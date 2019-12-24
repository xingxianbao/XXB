//服务层
app.service('ordersService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../orders/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../orders/findPage.do?pageNum='+page+'&pageSize='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../orders/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../orders/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../orders/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../orders/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../orders/search.do?pageNum='+page+"&pageSize="+rows, searchEntity);
	}    	
});