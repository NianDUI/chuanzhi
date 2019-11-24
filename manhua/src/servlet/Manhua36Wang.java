package servlet;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.Manhua36WangUtil;

/**
 * Servlet implementation class Manhua36Wang
 */
@WebServlet("/Manhua36Wang")
public class Manhua36Wang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Manhua36Wang() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String href = request.getParameter("href");
			System.out.println(href);
			
			List<String> list = Manhua36WangUtil.getChapterImgSrcs(href);
			String imgSrcs = list.stream().collect(Collectors.joining(","));
//			System.out.println(imgSrcs);
			response.getWriter().write(imgSrcs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
