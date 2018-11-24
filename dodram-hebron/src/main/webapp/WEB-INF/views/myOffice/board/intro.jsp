<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회사소개 작성하기</title>
 
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="/resources/editor/js/HuskyEZCreator.js" charset="utf-8"></script>
 
</head>
<script type="text/javascript">
    $(function(){
        //전역변수
        var obj = [];              
        //스마트에디터 프레임생성
        nhn.husky.EZCreator.createInIFrame({
            oAppRef: obj,
            elPlaceHolder: "editor",
            sSkinURI: "/resources/editor/SmartEditor2Skin.html",
            htParams : {
                // 툴바 사용 여부
                bUseToolbar : true,            
                // 입력창 크기 조절바 사용 여부
                bUseVerticalResizer : true,    
                // 모드 탭(Editor | HTML | TEXT) 사용 여부
                bUseModeChanger : true,
            }
        });
        //전송버튼
        $("#insertBoard").click(function(){
            //id가 smarteditor인 textarea에 에디터에서 대입
            obj.getById["editor"].exec("UPDATE_CONTENTS_FIELD", []);
            //폼 submit
            $("#insertBoardFrm").submit();
        });
    });
</script>
<body>
 <div class="container">
	<div class="big-box-container">
		<div class="big-box-title">회사소개 작성하기</div>
		<div class="big-box-contents">
		    <form action="./insertBoard.do" method="post" id="insertBoardFrm" enctype="multipart/form-data">
		        <textarea name="editor" id="editor" style="width: 767px; height: 500px;">
		        	<c:forEach var="content" items="${ content }">
						${content.content }
					</c:forEach>
		        </textarea>
		        <input type="hidden" name="title" value="intro" />
		        <input type="button" id="insertBoard" value="등록" />
		    </form>
		</div>
	</div>
</div>
</body>
</html>
