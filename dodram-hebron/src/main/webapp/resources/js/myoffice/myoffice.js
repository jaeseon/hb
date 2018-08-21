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
	
	// 서버 시간 갱신
	var xmlHttp;
	
	try {
		xmlHttp = new XMLHttpRequest(); // Chrome, FF, Opera, Safari, IE 7.0 high
	} catch(e1) {
		try {
			xmlHttp = new ActiveXObject('Msxml2.XMLHTTP'); // IE 6.0 Low 
		} catch(e2) {
			try {
				xmlHttp = new ActiveXObject('Microsoft.XMLHTTP');
			} catch(e3) {
				alert('aJax not supported');
				return;
			}
		}
	}
	
	xmlHttp.open('HEAD', window.location.href.toString(), false);
	xmlHttp.setRequestHeader("Content-Type", "text/html");
	xmlHttp.send('');
	
	var serverDate = xmlHttp.getResponseHeader("Date");
	var currentDateClass = new Date(serverDate);
	
	playServerTime = setInterval(function() {
		currentDateClass = new Date(currentDateClass.setSeconds(currentDateClass.getSeconds()+1));
		
		$('.server-time').html('Server: ' + currentDateClass.toLocaleDateString("tlh-Kore-AQ-fonipa") + " " + currentDateClass.toLocaleTimeString("tlh-Kore-AQ-fonipa"));
	}, 1000);
});