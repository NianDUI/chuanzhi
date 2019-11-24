package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Servlet implementation class CityServlet
 */
@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CityServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/xml;charset=utf-8"); // 注意：发送xml时这里要修改！！！
		/*
		 * 获取省份名称，加载该省对应的<province>元素！
		 * 把元素转换成字符串发送给客户端！
		 */
		/*
		 * 1.获取省份名称
		 * 2.使用省份名称找到对应的<province>元素
		 * 3.把<province>元素转换成字符串,发送!
		 */
		try {
			/*
			 * 得到Document
			 */
			SAXReader reader = new SAXReader();
			InputStream input = this.getClass().getResourceAsStream("/china.xml");
			Document doc = reader.read(input);
			
			/*
			 * 获取参数 
			 */
			String pname = request.getParameter("pname"); // 获取省份名称
			Element proEle = (Element) doc.selectSingleNode("//province[@name='" + pname + "']"); // //province[name='北京'](条件)，得到一个元素，使用selectSingleNode的原因是查出来就一个 
			String xmlStr = proEle.asXML(); // 把元素转换为字符串
			response.getWriter().print(xmlStr);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
		
	}

}
