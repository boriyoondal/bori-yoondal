package conn.example1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex01")
public class ex01 extends HttpServlet {
		//Service 메소드의 역할 : Java의 main()처럼 Servlet에서는 service()
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Servlet(Serve+Applet) : Server(WAS:Tomcat)에서
		//						  Java를 기반으로 작동하는 서버프로그램
		//ip주소 : 211.105.164.194

	System.out.println("누군가 ex01 서버프로그램 호출");
	
	String ip = request.getRemoteAddr();
		//request : Client의 모든 정보를 갖고있는 객체(입력한 data)
	System.out.println("접속한 사용자의 IP : " + ip);
		
	//response 사용자의 요청에 응답하는 페이지, Server가 Client에게 응답할 방식을 지정하는 객체(생성,이동)
	response.setContentType("text/html;charset=euc-kr");
	//응답할 페이지와 인코딩 방식을 지정
		
	PrintWriter out = response.getWriter();
	//Servlet과 html의 통로인 PrinterWriter 지정, 생성된 HTML페이지와 현재 Servlet파일을 연결
	out.write("응답페이지 생성");
	//PrintWriter통로를 통해서 생성된 HTML에 값 입력
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	System.out.println("사용자가 입력한 ID : " + id);
	System.out.println("사용자가 입력한 PW : " + pw);
	}

}
