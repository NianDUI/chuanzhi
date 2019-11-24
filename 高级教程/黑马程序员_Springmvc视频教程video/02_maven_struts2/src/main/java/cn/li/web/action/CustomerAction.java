package cn.li.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// url : http://localhost:8080/02_maven_struts2/customerAction_save.action
	public String save() throws Exception {
		System.out.println("CustomerAction的save方法被调用了");
		return SUCCESS;
	}
}
