function LoadBookinfo(params){
    $.post("GetBookinfo",params,function(e){
    	$("table tr:not(:first)").remove();
    	var booktype="";
    	var isborrow="";
    	$(e.list).each(function(){
    		if(this.booktype=='1'){
    			booktype="小说";
    		}else if (this.booktype=='2') {
    			booktype="文学";
			}else if (this.booktype=='3') {
    			booktype="传记";
			}
    		if(this.isborrow=='1'){
				isborrow="已借阅";
			}else if(this.isborrow=='0'){
				isborrow="未借阅";
			}
    		$("table").append("<tr><td>"+this.bookcode+"</td>" +
    				"<td>"+booktype+"</td>"+"<td>"+this.bookname+"</td>"+"<td>"+this.bookatuthor+"</td>" +
    						"<td>"+this.publishpress+"</td>"+"<td><a href=''>"+isborrow+"</a>"+"</td></td></tr>");
    	})
    	 var str="共有"+e.total+"条数据"+"当前"+e.pageNum+"/"+e.pages+"页";
		 str+="<a href='javascript:void(0)' onclick=changpageno(1)>首页</a>";
		 str+="<a href='javascript:void(0)' onclick=changpageno("+(e.pageNum-1)+")>上一页</a>";
		 str+="<a href='javascript:void(0)' onclick=changpageno("+(e.pageNum+1)+")>下一页</a>";
		 str+="<a href='javascript:void(0)' onclick=changpageno("+e.pages+")>末页</a>";
		 str+="<input type='hidden' id='pages' value="+(e.pages)+">";
		 $("#page").html(str);
    })
}
function changpageno(pageNum){
	var booktype=$("#booktype").val();
	var bookatuthor=$("#bookatuthor").val();
	var isborrow=$("#isborrow").val();
	var params={booktype:booktype,bookatuthor:bookatuthor,isborrow:isborrow,pageNum:pageNum};
	if(pageNum>$("#pages").val()){
		pageNum=$("#pages").val();
}else{
	LoadBookinfo(params)
}
}
$(document).ready(function(){
	LoadBookinfo(null);
	$("#sel").click(function(){
		var booktype=$("#booktype").val();
		var bookatuthor=$("#bookatuthor").val();
		var isborrow=$("#isborrow").val();
		var params={booktype:booktype,bookatuthor:bookatuthor,isborrow:isborrow};
		LoadBookinfo(params);
	})
})
$("#t").click(function(){
	if(confirm("确定要退出吗?")){	
		alert("再见!");
	    location.href="clearsession";		
	}
})