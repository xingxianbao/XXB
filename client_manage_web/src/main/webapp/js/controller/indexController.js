app.controller('indexController' ,function($scope,$controller,indexService) {

    $controller('baseController', {$scope: $scope});//继承

    $scope.getName=function () {
        indexService.getName().success(
          function (response) {
              $scope.username=response.name;
          }  
        );
    }
});