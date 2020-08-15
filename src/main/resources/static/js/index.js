<script th:inline="javascript" type="text/javascript">
/*<![CDATA[*/
	var basePath = /*[[${#httpServletRequest.getScheme() + "://" + #httpServletRequest.getServerName() + ":" + #httpServletRequest.getServerPort() + #httpServletRequest.getContextPath()}]]*/;
	
	alert("js好了");
	
	$(function(){
		alert("js好了");
		initData();
	});
	
	function initData(){
		//进入页面，加载轮播图片
		$.ajax({
			type:'post',
			url:'http://localhost:8080/springboot/lookForPicture',
			/*data:{name:'aa'},*/
			dataType:'json',
			success:function(data){
				alert("请求成功！");
			},
			error:function(){
	            alert("发生错误");
	        }
		});
	}
	/*]]>*/
</script>


