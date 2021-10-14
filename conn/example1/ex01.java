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
		//Service �޼ҵ��� ���� : Java�� main()ó�� Servlet������ service()
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Servlet(Serve+Applet) : Server(WAS:Tomcat)����
		//						  Java�� ������� �۵��ϴ� �������α׷�
		//ip�ּ� : 211.105.164.194

	System.out.println("������ ex01 �������α׷� ȣ��");
	
	String ip = request.getRemoteAddr();
		//request : Client�� ��� ������ �����ִ� ��ü(�Է��� data)
	System.out.println("������ ������� IP : " + ip);
		
	//response ������� ��û�� �����ϴ� ������, Server�� Client���� ������ ����� �����ϴ� ��ü(����,�̵�)
	response.setContentType("text/html;charset=euc-kr");
	//������ �������� ���ڵ� ����� ����
		
	PrintWriter out = response.getWriter();
	//Servlet�� html�� ����� PrinterWriter ����, ������ HTML�������� ���� Servlet������ ����
	out.write("���������� ����");
	//PrintWriter��θ� ���ؼ� ������ HTML�� �� �Է�
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	System.out.println("����ڰ� �Է��� ID : " + id);
	System.out.println("����ڰ� �Է��� PW : " + pw);
	}

}
