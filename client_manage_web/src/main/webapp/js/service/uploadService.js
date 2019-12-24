//上传服务层
app.service('uploadService',function($http){

	//查询实体
	this.uploadFile=function(name){
		//使用FormData对象 模拟表单控件
		var formData = new FormData();
		if (name=='director'){
			formData.set("file",director.files[0]);
		}else if(name=='performer'){
			formData.set("file",performer.files[0]);
		}else if(name=='pic2'){
			formData.set("file",pic2.files[0]);
		}else{
			formData.set("file",pic.files[0]);
		}
		return $http({
			method:'post',
			url:"http://localhost:8100/uploadFile.do",
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