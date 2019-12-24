 //控制层 
app.controller('cinemaController' ,function($scope,$controller,$location,cityService   ,cinemaService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		cinemaService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		cinemaService.findPage(page,rows).success(
			function(response){
				$scope.list=response.list;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		cinemaService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.cinemaId!=null){//如果有ID
			serviceObject=cinemaService.update( $scope.entity ); //修改  
		}else{
			serviceObject=cinemaService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					alert("申请成功! 请耐心等待审核!!!")
					$scope.entity={}
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		cinemaService.dele( $scope.selectIds ).success(
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
		if($location.search()['cityId']!=null){
			$scope.searchEntity.cityId=$location.search()['cityId'];
		}
		cinemaService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.list;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}

	$scope.cityList=[];
	//查询所有城市
	$scope.findCityAll=function () {
		cityService.findAll().success(function (response) {
			$scope.cityListData=response;
			for (var i = 0;i<response.length;i++){
				$scope.cityList[response[i].cityId]=response[i].cityName;
			}
		})
	}
	//服务类型转换
	$scope.serviceStrToList=function (str) {
		if (str.length<=0)return null;
		return JSON.parse(str);
	}

    
});	