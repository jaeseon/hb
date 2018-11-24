$(document).ready(function() {
	
	// 메뉴 마우스 오버 및 아웃
	$('.nav > ul > li a').mouseenter(function() {
		$(this).addClass('caret-color-change');
		$('.caret-color-change > .caret').css('color', '#fff');
	}).mouseleave(function() {
		$(this).removeClass('caret-color-change');
		$('.caret').css('color', '#bbb');
	});
	
	// 메뉴 클릭
	$('.nav > ul > li a').on('click', function() {
		if( $(this).parent().attr('class') !== 'open' ) {
			$('.open').removeClass('open');
			$(this).parent().toggleClass('open');
			
			return;
		}
		
		$(this).parent().toggleClass('open');
	});
});