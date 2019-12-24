//服务层
app.service('homeDataService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../homeData/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../homeData/findPage.do?pageNum='+page+'&pageSize='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../homeData/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../homeData/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../homeData/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../homeData/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../homeData/search.do?pageNum='+page+"&pageSize="+rows, searchEntity);
	}
	//根据城市id查找响应的数据
	this.findByCityId=function(cityId){
		return $http.get('../homeData/findByCityId.do?cityId='+cityId);
	}
});