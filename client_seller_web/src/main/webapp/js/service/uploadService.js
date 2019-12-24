//上传服务层
app.service('uploadService',function($http){

	//查询实体
	this.uploadFile=function(){

		//使用FormData对象 模拟表单控件
		var formData = new FormData();
		formData.append("file",file.files[0]);
		return $http({
			method:'post',
			url:'../uploadFile.do',
			data:formData,
			headers:{
				//设置请求头 angular自动转换传输文件的形式
				'Content-Type':undefined
			},
			//表单数据序列化传输
			transformRequest:angular.identity
		});
	}

});