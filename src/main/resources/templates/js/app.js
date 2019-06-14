$(function(){
	
	$("div.themes-selector>span").click(function(){
		$("#theme-selector-link").attr("href","./css/themes/" + $(this).data("theme") + ".css");
	});
	
	$("div.bg-selector>span").click(function(){
		$("#bg-selector-link").attr("href","./css/bgs/" + $(this).data("bg") + ".css");
	});
});