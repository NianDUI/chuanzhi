package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateUsernameServlet
 */
@WebServlet("/ValidateUsernameServlet")
public class ValidateUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ValidateUsernameServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8"); // ��Ӧ��������

		/*
		 * 1��ȡ����username 2.�ж��Ƿ�Ϊitcast 3.����ǣ���Ӧ1 4.������ǣ���Ӧ0
		 */
		String username = request.getParameter("username");
		if (username.equalsIgnoreCase("itcast")) {
			response.getWriter().print("1");
		} else {
			response.getWriter().print("0");
		}

	}

}
