//定义基本的controller
app.controller('baseController',function($scope,$http){
    //定义分页组建使用的配置信息 固定写死
    $scope.paginationConf = {
        currentPage: 1,   //当前页数据  aglr控制
        totalItems: 10,   //默认总条数 后台返回
        itemsPerPage: 10, //每页支持查询的条数 ag 前端控制
        perPageOptions: [10, 20, 30, 40, 50], //每页条数可选项
        onChange: function(){  //当分页控件的数据发生变化执行的函数
            //而且页面加载进来也会执行函数
            $scope.reloadList();//重新加载
        }
    };
    //定义reload方法调用分页查询的方法
    $scope.reloadList=function(){
        var pageNum = $scope.paginationConf.currentPage;
        var pageSize = $scope.paginationConf.itemsPerPage;
        $scope.search(pageNum,pageSize,$scope.searchEntity);
    }

    //定义一个数组用于存储选中的id
    $scope.selectIds=[];
    //定义一个方法用于向数组中添加id
    //event表示触发当前方法的事件
    $scope.updateSelection=function(event,id){
        //$event.target获取到当前的checkbox对象
        if(event.target.checked){
            $scope.selectIds.push(id);
        }else{
            //从数组中将当前的id移除
            var index = $scope.selectIds.indexOf(id);
            $scope.selectIds.splice(index,1); //移除方法 参数1从索引位置开始 删除参数2个数据
        }

    }
})