$(document).ready(function() {
	// header mouse hover event
	$(".menu-header-2").mouseenter(function(){
		$(".nav-depth").fadeIn(300);
		$(".nav-bg").fadeIn(300);
	}).mouseleave(function(){
		$('.nav-depth').stop();
	  	$(".nav-depth").fadeOut(300);
	  	$('.nav-bg').stop();
		$(".nav-bg").fadeOut(300);
	});
	
	// slider event
	$('.slider').bxSlider({
		auto: true
	});
});
