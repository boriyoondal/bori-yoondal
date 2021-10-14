package conn.example1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex06")
public class ex06 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=euc-kr");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String birth = request.getParameter("birth");
		String color = request.getParameter("color");
		String[] hobby = request.getParameterValues("hobby");
		String talk = request.getParameter("talk");
		
		System.out.println("ID : " + id);
		System.out.println("NAME : "+ name);
		System.out.println("EMAIL : " + email);
		System.out.println("tel : " + tel);
		System.out.println("GENDER : "+gender);
		System.out.println("COUNTRY : "+ country);
		System.out.println("BIRTH :"+birth);
		System.out.println("COLOR : "+color);
		System.out.println("HOBBY : "+ hobby);
		System.out.println("TALK : " + talk);
		
	
		String res_hobby="";
		for(int i = 0; i<hobby.length; i++) {
			res_hobby += hobby[i];
		}
		
		out.print("ID : " + id );
		out.print("NAME : "+ name);
		out.print("EMAIL : " + email);
		out.print("tel : " + tel);
		out.print("GENDER : "+gender);
		out.print("COUNTRY : "+ country);
		out.print("BIRTH :"+birth);
		out.print("COLOR : "+color);
		out.print("HOBBY : "+ res_hobby);
		out.print("TALK : " + talk);
		
		//웹의흐름
		//1.html에서 사용자가 값을 입력한다.
		//2.Servlet에서 사용자가 입력한 값을 가져온다.(request)
		//3. Servlet에서 사용자에게 응답페이지를 만들어 응답해준다.(response)
		
	}
	
	

}
