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
import org.dom4j.io.SAXReader;

/**
 * Servlet implementation class ProvinceServlet
 */
@WebServlet("/ProvinceServlet")
public class ProvinceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProvinceServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8"); // 响应编码问题
		
		/*
		 * 响应所有省份名称，使用逗号分隔！
		 */
		/*
		 * 1.Document对象 *创建解析器对象 * 调用解析器的对方法，传递一个流对象，得到Document
		 */
		try {
			SAXReader reader = new SAXReader();
			InputStream input = this.getClass().getResourceAsStream("/china.xml");
			Document doc = reader.read(input);
			
			/*
			 * 查询所有provice的name属性，得到一堆的属性对象
			 * 循环遍历，把所有的属性值连接成一个字符串，发送给客户端
			 */
			List<Attribute> arrList = doc.selectNodes("//province/@name");// 或者是//province/@name
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arrList.size(); i++) {
				sb.append(arrList.get(i).getValue()); // 把每个属性的值存放到sb中
				if (i < arrList.size() - 1) {
					sb.append(",");
				}
			}
			response.getWriter().print(sb.toString());
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
