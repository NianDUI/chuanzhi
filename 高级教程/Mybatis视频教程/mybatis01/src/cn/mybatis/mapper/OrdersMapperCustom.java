package cn.mybatis.mapper;

import java.util.List;

import cn.mybatis.po.Orders;
import cn.mybatis.po.OrdersCustom;
import cn.mybatis.po.User;

/**
 * ����mapper
 * @author 1
 *
 */
public interface OrdersMapperCustom {

	// <!-- ��ѯ����������ѯ�û���Ϣ -->
	public List<OrdersCustom> findOrdersUser() throws Exception;
	
	// <!-- ��ѯ����������ѯ�û���Ϣ��ʹ��resultMap -->
	public List<Orders> findOrdersUserResultMap() throws Exception;
	
	// <!-- ��ѯ�����������û�����������Ϣ��ʹ��resultMap -->
	public List<Orders> findOrdersUserAndOrderDetailResultMap() throws Exception;
	
	// <!-- ��ѯ�û����������Ʒ��Ϣ,ʹ��resultMap -->
	public List<User> findUserAndItemsResultMap() throws Exception;
	
	// <!-- ��ѯ����������ѯ�û����û���Ϣ��Ҫ�ӳټ��ء�
	public List<Orders> findOrdersUserLazyLoading() throws Exception;
	

}
