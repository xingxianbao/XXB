 //控制层 
app.controller('hallController' ,function($scope,$controller,cinemaService   ,hallService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		hallService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		hallService.findPage(page,rows).success(
			function(response){
				$scope.list=response.list;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		hallService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存
	$scope.entity={}
	$scope.save=function(){
		var serviceObject;//服务层对象
		if($scope.entity.hallId!=null){//如果有ID
			serviceObject=hallService.update( $scope.entity ); //修改  
		}else{
			serviceObject=hallService.add( $scope.entity  );//增加 
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
		hallService.dele( $scope.selectIds ).success(
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
		hallService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.list;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	//将座位字符串转换为对象
	$scope.seatObj={};
    $scope.seatToObj=function (seat) {
		$scope.seatObj = JSON.parse(seat);
		$scope.seats=$scope.seatObj.seats;
	}
	//点击修改座位的状态
	$scope.checkedBox=function (obj) {
		$scope.seats[obj.id-1].status=$scope.seats[obj.id-1].status==1?0:1;
		$scope.entity.seat.seats=JSON.stringify($scope.seats);
		$scope.seatObj.seats=$scope.seats;
		$scope.entity.seat=$scope.seatObj;
	}
	//查找所有电影院
	$scope.cinemaList=[];
	$scope.findCinemaAll=function () {
		cinemaService.findAll().success(function (response) {
			for(var i = 0;i<response.length;i++){

				$scope.cinemaList[response[i].cinemaId]=response[i].cinName;
			}
		})
	}
});	