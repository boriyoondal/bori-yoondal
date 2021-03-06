package conn.example1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex02")
public class ex02 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Client에게 입력한 데이터를 받아오려면?
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("사용자가 입력한 ID : " + id);
		System.out.println("사용자가 입력한 PW : " + pw);
		
		//사용자가 입력한 ID와 PW를 응답해주는 페이지를 만드시오
		response.setContentType("text/html;charset=euc-kr");
		//응답할 페이지와 인코딩 방식을 지정
			
		PrintWriter out = response.getWriter();
		out.print("사용자가 입력한 ID : " + id + "<br>");
		
		out.print("사용자가 입력한 PW : " + pw);

		//웹프로그래밍의 흐름//
		
		//1. 사용자가 값을 입력한다.(HTML) 
		//action, name, submit 중요(이 구성요소가 있어야 서버로 바로 보낼 수 있음)
		
		//2. 사용자가 입력한 값을 변수로 가져온다.(Servlet)
		//request 중요
		
		//3. 사용자에게 응답하는 페이지를 만들어준다.(Servlet->HTML)
		//response 중요
		
		// + DB(JDBC)
		//--> 암기하기 <--//
	}

}
