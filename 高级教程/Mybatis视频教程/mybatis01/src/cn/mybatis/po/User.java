package cn.mybatis.po;
/**
 * 
 * @author 1
 *
 */

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*
 * Serializable
 * 二级缓存调用pojo类实现序列化接口
 * 二级缓存的存储器是不一定在内存。多种多样。
 * 为了将缓存数据出执行反序列化操作。
 */
public class User implements Serializable{

	// 属性名和数据库表的字段对应。
	private Integer id;
	private String username;
	private String sex;
	private Date birthday;
	private String address;

	private List<Orders> ordersList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday + ", address="
				+ address + ", ordersList=" + ordersList + "]";
	}

}
