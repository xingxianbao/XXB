//服务层
app.service('cinemaService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../cinema/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../cinema/findPage.do?pageNum='+page+'&pageSize='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../cinema/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../cinema/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../cinema/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../cinema/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../cinema/search.do?pageNum='+page+"&pageSize="+rows, searchEntity);
	}
	this.updateIsUsable=function (cinemaId,isUsable) {
		return $http.get('../cinema/updateIsUsable.do?cinemaId='+cinemaId+'&isUsable='+isUsable);
	}
});