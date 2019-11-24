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
		response.setContentType("text/xml;charset=utf-8"); // ע�⣺����xmlʱ����Ҫ�޸ģ�����
		/*
		 * ��ȡʡ�����ƣ����ظ�ʡ��Ӧ��<province>Ԫ�أ�
		 * ��Ԫ��ת�����ַ������͸��ͻ��ˣ�
		 */
		/*
		 * 1.��ȡʡ������
		 * 2.ʹ��ʡ�������ҵ���Ӧ��<province>Ԫ��
		 * 3.��<province>Ԫ��ת�����ַ���,����!
		 */
		try {
			/*
			 * �õ�Document
			 */
			SAXReader reader = new SAXReader();
			InputStream input = this.getClass().getResourceAsStream("/china.xml");
			Document doc = reader.read(input);
			
			/*
			 * ��ȡ���� 
			 */
			String pname = request.getParameter("pname"); // ��ȡʡ������
			Element proEle = (Element) doc.selectSingleNode("//province[@name='" + pname + "']"); // //province[name='����'](����)���õ�һ��Ԫ�أ�ʹ��selectSingleNode��ԭ���ǲ������һ�� 
			String xmlStr = proEle.asXML(); // ��Ԫ��ת��Ϊ�ַ���
			response.getWriter().print(xmlStr);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
		
	}

}
