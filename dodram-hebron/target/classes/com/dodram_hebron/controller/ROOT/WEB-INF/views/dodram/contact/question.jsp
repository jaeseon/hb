<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="contact-container">
	<div class="intro-text">
		<div class="intro-title">제품&견적 문의</div>
		<div class="intro-company-introduce1">
			<span>
				도드람바이오는<br />
				옳은 일은 올바르게 하기 위해 정진합니다.
			</span>
			<p>
				옳은 일이란 핵심 가치를 지향하는 것이며, 올바르게 함이란 최상의 효과를 내기 위해<br />
				최고의 효율을 기하는 것입니다. 언제나 고객 중심적인 사고로 고객 가치를 극대화하고,<br />
				현재보다는 미래의 기회를 가치 기준으로 판단합니다.
			</p>
		</div>
		<div class="intro-company-introduce2">
			<div class="question-form-container">
				<form action="/sendQA" method="post" onsubmit="return check_question_btn();" onload="frmBlank();">
					<input type="hidden" name="type" value="dodram">
					<div><img src="/resources/src/images/Icon-user.png"><input type="text" name="name" placeholder="이름(회사)" maxlength="25" autofocus="autofocus"/></div>
					<div><img src="/resources/src/images/Icon-mail.png"><input type="email" name="email" placeholder="보내는 분 E-mail" maxlength="25"/></div>
					<div><img src="/resources/src/images/Icon-tel.png"><input type="text" name="tel" placeholder="연락처 (ex: 01012345678)" maxlength="25"/></div>
					<div><img src="/resources/src/images/Icon-title.png"><input type="text" name="title" placeholder="제목" maxlength="100"/></div>
					<div>
						<img src="/resources/src/images/Icon-contents.png" style="vertical-align: top;">
						<textarea class="contents-area" rows="10" cols="16" name="contents" placeholder="내용을 입력하세요."></textarea>
					</div>
					
					<div style="text-align: center;"><input type="submit" value="문의하기"></div>
				</form>
			</div>
		</div>
		
		<div class="intro-company-introduce2" style="text-align: center;">
			고객님의 문의사항은 입력하신 이메일로 회신되니 반드시 본인의 이메일을 입력하시기를 바랍니다.<br />
			이메일 문의를 하실 분은(첨부파일 포함 등) <a href="mailto:dodrambio@naver.com"><span style="color: #3386B2; font-weight:700;">dodrambio@naver.com</span></a> 을 이용해주세요. 
		</div>
	</div>
</div>
