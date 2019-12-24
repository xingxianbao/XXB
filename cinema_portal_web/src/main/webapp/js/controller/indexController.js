//控制层
app.controller('indexController' ,function($scope,
     $controller,cityService,typeService,homeDataService){

    $controller('baseController',{$scope:$scope});//继承

    $scope.entity={};

    $scope.initPage=function () {
        $scope.selectType();
        $scope.selectCity();

    }

    $scope.selectType=function () {
        typeService.findAll().success(function (response) {
            $scope.typeList=response;
        })
    }
    $scope.selectCity=function () {
        cityService.findAll().success(function (response) {
            $scope.cityList=response;
            $scope.entity.cityId=response[0].cityId;
            homeDataService.findByCityId($scope.entity.cityId).success(function (response) {
                $scope.homeDataList=response;
            })
        })
    }
    $scope.selectHomeData=function () {
        homeDataService.findByCityId($scope.entity.cityId).success(function (response) {
            $scope.homeDataList=response;
        })
    }

    $scope.reloadData=function () {
        homeDataService.findByCityId($scope.entity.cityId).success(function (response) {
            $scope.homeDataList=response;
        })
    }
});