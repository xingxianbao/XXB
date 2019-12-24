 //用户表控制层 
app.controller('indexController' ,function($scope,$controller   ,indexService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    $scope.showName=function(){
        indexService.showName().success(function (response) {
			$scope.username=response.username;
        })
	}
    
});	