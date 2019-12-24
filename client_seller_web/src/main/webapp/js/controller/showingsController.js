 //控制层 
app.controller('showingsController' ,function($scope,$controller,
	timetableService,movieService,hallService ,showingsService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		showingsService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		showingsService.findPage(page,rows).success(
			function(response){
				$scope.list=response.list;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	$scope.entity={};
	//查询实体 
	$scope.findOne=function(id){				
		showingsService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象
        $scope.entity.playTime=document.getElementById("time").value;
		if($scope.entity.showId!=null){//如果有ID
			serviceObject=showingsService.update( $scope.entity ); //修改  
		}else{
			serviceObject=showingsService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询
                    alert(response.message)

				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		showingsService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){

					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		showingsService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.list;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	$scope.initGetList=function(){
		$scope.selectMovieList();
		$scope.selectHallList();
		$scope.selectTimetable();
	}

	$scope.null={};
	$scope.selectHallList=function () {
		hallService.search(1,100,$scope.null).success(function (response) {
			$scope.hallList=response.list;
		})
	}
	$scope.selectMovieList=function () {
		movieService.findAll().success(function (response) {
			$scope.movieList=response;
		})
	}
	$scope.selectTimetable=function () {
		timetableService.findAll().success(function (response) {
			$scope.timetableList=response;
		})
	}
	$scope.setEntityHall=function () {
		$scope.entity.hallId = $scope.hall.hallId;
		$scope.entity.hallName = $scope.hall.hallName;


	}
	$scope.setEntityMov=function () {
		$scope.entity.movId = $scope.movie.movId;
		$scope.entity.movName = $scope.movie.movName;
	}
});	