package com.dodram_hebron.controller;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dodram_hebron.service.AdminService;

@Controller
public class EditorController {
	
	@Autowired
	private AdminService service;
	
	@RequestMapping(value="/myOffice/intro", method = RequestMethod.GET)
	public String intro(Model model){
		model.addAttribute("content", service.editorBoardList("intro"));
		return "/myOffice/board/intro";
	}
	
    @RequestMapping(value = "/myOffice/insertBoard.do", method = RequestMethod.POST)
    public void insertBoard(String editor, String title, HttpServletResponse response) throws IOException {
        Map<String, Object> list = new HashMap<String, Object>();
        list.put("title", title);
        list.put("content", editor);
        service.updateEditorBoard(list);
        response.setContentType("text/html; charset=UTF-8");
        try{
	        PrintWriter out = response.getWriter();
	        out.println("<script>alert('회사소개가 수정되었습니다.'); location.href='/myOffice/intro';</script>");
	        out.flush();
        }catch (IOException e) {
			e.printStackTrace();
		}
    }
 
    // 다중파일업로드
    @RequestMapping(value = "/file_uploader_html5.do",
                  method = RequestMethod.POST)
    @ResponseBody
    public String multiplePhotoUpload(HttpServletRequest request) {
        // 파일정보
        StringBuffer sb = new StringBuffer();
        try {
            // 파일명을 받는다 - 일반 원본파일명
            String oldName = request.getHeader("file-name");
            // 파일 기본경로 _ 상세경로
            String filePath = "/tomcat/webapps/ROOT/resources/photoUpload/";
            String saveName = sb.append(new SimpleDateFormat("yyyyMMddHHmmss")
                          .format(System.currentTimeMillis()))
                          .append(UUID.randomUUID().toString())
                          .append(oldName.substring(oldName.lastIndexOf("."))).toString();
            InputStream is = request.getInputStream();
            OutputStream os = new FileOutputStream(filePath + saveName);
            int numRead;
            byte b[] = new byte[Integer.parseInt(request.getHeader("file-size"))];
            while ((numRead = is.read(b, 0, b.length)) != -1) {
                os.write(b, 0, numRead);
            }
            os.flush();
            os.close();
            // 정보 출력
            sb = new StringBuffer();
            sb.append("&bNewLine=true")
              .append("&sFileName=").append(oldName)
              .append("&sFileURL=").append("https://dodrambio.com/resources/photoUpload/")
        .append(saveName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return sb.toString();
    }
}
