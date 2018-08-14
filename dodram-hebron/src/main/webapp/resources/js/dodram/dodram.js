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

// partners -> tab
function tab_click(obj) {
	if(obj === 1) {
		$('.tab-menu > span:nth-of-type(2)').removeClass('over');
		$('.tab-menu > span:nth-of-type(1)').removeClass('nover');
		$('.tab-menu > span:nth-of-type(1)').addClass('over');
		
		$('.partners002-wrap').removeClass('visib');
		$('.partners002-wrap').addClass('non');
		
		$('.partners001-wrap').removeClass('non');
		$('.partners001-wrap').addClass('visib');
	} else if(obj === 2) {
		$('.tab-menu > span:nth-of-type(1)').removeClass('over');
		$('.tab-menu > span:nth-of-type(2)').removeClass('nover');
		$('.tab-menu > span:nth-of-type(2)').addClass('over');
		
		$('.partners001-wrap').removeClass('visib');
		$('.partners001-wrap').addClass('non');
		
		$('.partners002-wrap').removeClass('non');
		$('.partners002-wrap').addClass('visib');
	}
	
	return false;
}