<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="contact-container">
	<div class="intro-text">
		<div class="intro-title">찾아오시는 길</div>
		<div class="intro-company-introduce1">
			<span>
				헤브론테크는<br />
				옳은 일은 올바르게 하기 위해 정진합니다.
			</span>
			<p>
				옳은 일이란 핵심 가치를 지향하는 것이며, 올바르게 함이란 최상의 효과를 내기 위해<br />
				최고의 효율을 기하는 것입니다. 언제나 고객 중심적인 사고로 고객 가치를 극대화하고,<br />
				현재보다는 미래의 기회를 가치 기준으로 판단합니다.
			</p>
		</div>
		<div class="intro-company-introduce2">
			<div class="address-table-container">
				<table>
					<tr>
						<td>도로명 주소</td>
						<td>충청남조 천안시 서북구 입장면 섶머리2길 12-33</td>
					</tr>
					<tr>
						<td>지번 주소</td>
						<td>신두리 91-10</td>
					</tr>
					<tr>
						<td>우편번호</td>
						<td>31027</td>
					</tr>
				</table>
			</div>
			<div id="map"></div>
		</div>
	</div>
</div>

<script>
	function initMap() {
		var myLatLng = {lat: 36.917532, lng: 127.2023998};
	
	    // Create a map object and specify the DOM element
	    // for display.
	    var map = new google.maps.Map(document.getElementById('map'), {
	      center: myLatLng,
	      zoom: 14
	    });
	
	    // Create a marker and set its position.
	    var marker = new google.maps.Marker({
	      map: map,
	      position: myLatLng,
	      title: 'HebronTech'
	    });
	}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC6KY5-RMKqMY9jUoKlJ3AODcdNvjv0f1M&callback=initMap" async defer></script>