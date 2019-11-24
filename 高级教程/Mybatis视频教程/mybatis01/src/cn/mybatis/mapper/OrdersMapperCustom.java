package cn.mybatis.mapper;

import java.util.List;

import cn.mybatis.po.Orders;
import cn.mybatis.po.OrdersCustom;
import cn.mybatis.po.User;

/**
 * 订单mapper
 * @author 1
 *
 */
public interface OrdersMapperCustom {

	// <!-- 查询订单关联查询用户信息 -->
	public List<OrdersCustom> findOrdersUser() throws Exception;
	
	// <!-- 查询订单关联查询用户信息，使用resultMap -->
	public List<Orders> findOrdersUserResultMap() throws Exception;
	
	// <!-- 查询订单（关联用户）及订单信息，使用resultMap -->
	public List<Orders> findOrdersUserAndOrderDetailResultMap() throws Exception;
	
	// <!-- 查询用户及购买的商品信息,使用resultMap -->
	public List<User> findUserAndItemsResultMap() throws Exception;
	
	// <!-- 查询订单关联查询用户，用户信息需要延迟加载。
	public List<Orders> findOrdersUserLazyLoading() throws Exception;
	

}
