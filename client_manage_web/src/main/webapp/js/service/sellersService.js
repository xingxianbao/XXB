//服务层
app.service('sellersService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../sellers/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../sellers/findPage.do?pageNum='+page+'&pageSize='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../sellers/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../sellers/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../sellers/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../sellers/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../sellers/search.do?pageNum='+page+"&pageSize="+rows, searchEntity);
	}    	
});