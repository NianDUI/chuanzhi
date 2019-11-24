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
		response.setContentType("text/html;charset=utf-8"); // ��Ӧ��������
		
		/*
		 * ��Ӧ����ʡ�����ƣ�ʹ�ö��ŷָ���
		 */
		/*
		 * 1.Document���� *�������������� * ���ý������ĶԷ���������һ�������󣬵õ�Document
		 */
		try {
			SAXReader reader = new SAXReader();
			InputStream input = this.getClass().getResourceAsStream("/china.xml");
			Document doc = reader.read(input);
			
			/*
			 * ��ѯ����provice��name���ԣ��õ�һ�ѵ����Զ���
			 * ѭ�������������е�����ֵ���ӳ�һ���ַ��������͸��ͻ���
			 */
			List<Attribute> arrList = doc.selectNodes("//province/@name");// ������//province/@name
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arrList.size(); i++) {
				sb.append(arrList.get(i).getValue()); // ��ÿ�����Ե�ֵ��ŵ�sb��
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
