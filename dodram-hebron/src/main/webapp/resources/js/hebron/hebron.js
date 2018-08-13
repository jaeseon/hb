$(document).ready(function() {

  // header mouse hover event
  $(".header-menu").mouseenter(function(){
    $(".nav_depth").fadeIn(300);
		$(".nav-bg").fadeIn(300);
	}).mouseleave(function(){
		$('.nav_depth').stop();
	  	$(".nav_depth").fadeOut(300);
	  	$('.nav-bg').stop();
		$(".nav-bg").fadeOut(300);
	});


  // slider event
  $('.slider').bxSlider({
    auto: true
  });
  
});