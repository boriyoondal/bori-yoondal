package conn.example1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex03")
public class ex03 extends HttpServlet {   
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html;charset=euc-kr");
      
   String num1 = request.getParameter("num1");
   String num2 = request.getParameter("num2");
   String select=request.getParameter("select");
   
   int num3 = Integer.parseInt(num1);
   int num4 = Integer.parseInt(num2);
   

   //�Ʒ��� ������� ������������ ����Ͻÿ�
  // System.out.println(num3 + num4);
   //System~ �� �������� �ܼ�â������ ������� �����ִ� â
   
   PrintWriter out = response.getWriter();
//   int num5 = num3+num4;
//	out.print(num5);
//	
	//���ǹ�(select�� � ��ȣ�� �����ִ°�?)
	if(select.equals("+")) {
		out.print("�հ�"+num1+"+"+num2+"="+(num3+num4));
		
		}else if(select.equals("-")) {
			out.print("�հ�"+num1+"-"+num2+"="+(num3-num4));
			
		}else if(select.equals("*")) {
			out.print("�հ�"+num1+"*"+num2+"="+(num3*num4));
			
		}else if(select.equals("/")) {
			out.print("�հ�"+num1+"/"+num2+"="+(num3/num4));
		}
   }
}