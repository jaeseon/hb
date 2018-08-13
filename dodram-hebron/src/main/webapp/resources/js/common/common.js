
// question
function check_question_btn() {
	var isBlank = false;
	$('input[type=text], input[type=password], input[type=email], .contents-area').each(function() {
		if(this.value === '') {
			alert('내용을 입력해주세요.');
			this.focus();
		  
			isBlank = true;
			return false;
		}
	});
  
	if (isBlank === true) return false;
}

function frmBlank() {
	$('input[type=text], input[type=password], input[type=email], .contents-area').each(function() {
		this.value === '';
	});
}