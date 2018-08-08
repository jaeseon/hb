$(document).ready(function() {
	
	// 마우스 오버 및 아웃
	$('.nav > ul li a').mouseenter(function() {
		$(this).addClass('caret-color-change');
		$('.caret-color-change > .caret').css('color', '#fff');
	}).mouseleave(function() {
		$(this).removeClass('caret-color-change');
		$('.caret').css('color', '#bbb');
	});
	
	// 마우스 클릭
	$('.nav > ul li a').on('clck', function() {
		$(this).css('background-color', '#000');
	});
});