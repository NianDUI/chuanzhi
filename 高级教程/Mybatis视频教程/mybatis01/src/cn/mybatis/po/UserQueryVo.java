package cn.mybatis.po;

import java.util.List;

/**
 * @author 1, 用户包装类型
 * vo 指 视图层对象
 * po 指 持久层对象
 * pojo 指 自定义对象
 */
public class UserQueryVo {
	
	// 传入多个id
	private List<Integer> ids;
	
	private String username;
	
	// 在这里包装所需要的查询条件。

	// 用户查询条件。
	private UserCustom userCustom;

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	} 
	
	// 可以包装其他可以查询条件，如订单、商品。
	
	// ...
	
}
