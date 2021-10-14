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
   

   //아래의 결과값을 응답페이지로 출력하시오
  // System.out.println(num3 + num4);
   //System~ 은 개발자의 콘솔창에서의 결과값을 보여주는 창
   
   PrintWriter out = response.getWriter();
//   int num5 = num3+num4;
//	out.print(num5);
//	
	//조건문(select가 어떤 기호를 갖고있는가?)
	if(select.equals("+")) {
		out.print("합계"+num1+"+"+num2+"="+(num3+num4));
		
		}else if(select.equals("-")) {
			out.print("합계"+num1+"-"+num2+"="+(num3-num4));
			
		}else if(select.equals("*")) {
			out.print("합계"+num1+"*"+num2+"="+(num3*num4));
			
		}else if(select.equals("/")) {
			out.print("합계"+num1+"/"+num2+"="+(num3/num4));
		}
   }
}