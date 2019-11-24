package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/AServlet")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("(GET:)Hello Ajax!!");
		response.getWriter().print("(GET:)Hello AJAX!!!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8"); // ��Ӧ��������
		
		String username = request.getParameter("username"); // ��ȡ�������
		String password = request.getParameter("password"); // ��ȡ�������
		System.out.println("(POST:)Hello Ajax!!" + username+ ":" + password);
		response.getWriter().print("(POST:)Hello AJAX!!!<br/>�û�����" + username+ "  ����:" + password);
	}

}
