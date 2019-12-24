 //控制层 
app.controller('movieController' ,function($scope,$controller
							,typeService,uploadService,movieService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		movieService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		movieService.findPage(page,rows).success(
			function(response){
				$scope.list=response.list;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		movieService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象
		$scope.entity.movIntroduce=editor.html();
		$scope.entity.movIndate=document.getElementById("time").value;
		if($scope.entity.movId!=null){//如果有ID
			serviceObject=movieService.update( $scope.entity ); //修改  
		}else{
			serviceObject=movieService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		movieService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		movieService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.list;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}

	//查询电影类型
	$scope.selectType=function(){
		typeService.findAll().success(function (response) {
			$scope.typeList=response;
		})

	}


	$scope.entity={movDirector:[],movPic1:{},movPic:{}, movPic2:[],movPerformer:[]};
	$scope.director={};
	$scope.performer={};
	$scope.pic2={};
	//保存照片
	$scope.saveImage=function (obj) {
		if(obj=='director'){
			$scope.entity.movDirector.push($scope.director);
		}else if(obj=='pic2'){
			$scope.entity.movPic2.push($scope.pic2.img);
		}else if(obj=='performer'){
			$scope.entity.movPerformer.push($scope.performer);
		}
	}
	//删除照片
	$scope.deleImage=function(index,obj){
		if(obj=='director'){
			$scope.entity.movDirector.splice(index,1);
		}else if(obj=='pic2'){
			$scope.entity.movPic2.splice(index,1);
		}else if(obj=='performer'){
			alert(index)
			$scope.entity.movPerformer.splice(index,1);
		}
	}
	//上传
	$scope.uploadFile=function (obj) {
		uploadService.uploadFile(obj).success(function (response) {
			if (response){
				if (obj=='director'){
					$scope.director.img=response.message;
				}else if(obj=='pic2'){
					$scope.pic2.img=response.message;
				}else if(obj=='performer'){
					$scope.performer.img=response.message;
				}else if(obj=='pic'){
					$scope.entity.movPic1=response.message;
				}

			}else{
				alert(response.message)
			}
		})
	}
});	