package demo.pojo;

/**
 * 这是用户基本描述类。
 * 
 * @author 1
 * @version V1.0
 *
 */
public class User {
	private String name;
	private String password;

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String naem) {
		this.name = naem;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
