$(function () {
	if($(window).width()<1025){
		$(".m-btn").click(function () {
			$(".m-nav-box").fadeIn(300);
		});
		$(".m-nav-box .close").click(function () {
			$(".m-nav-box").fadeOut(300);
		});
	}
});