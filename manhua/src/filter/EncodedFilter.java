package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class encoded
 */
//@WebFilter({ "/encodedFilter", "/*" })
@WebFilter(
		filterName = "EncodedFilter",
		urlPatterns = { "/*" },
		initParams = {
				@WebInitParam(name = "encoding", value = "UTF-8")
			}
		)
public class EncodedFilter implements Filter {
	FilterConfig fConfig;

	public EncodedFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
//		request.setCharacterEncoding(fConfig.getServletContext().getInitParameter("encoded")); // XML≈‰÷√
		request.setCharacterEncoding(fConfig.getInitParameter("encoding"));
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.fConfig = fConfig;
	}

}
