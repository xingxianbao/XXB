app.service('indexService',function($http){
    //查询实体
    this.getName=function(){
        return $http.get('../login/getName.do');
    }
});