package cn.mybatis.po;

import java.util.List;

/**
 * @author 1, �û���װ����
 * vo ָ ��ͼ�����
 * po ָ �־ò����
 * pojo ָ �Զ������
 */
public class UserQueryVo {
	
	// ������id
	private List<Integer> ids;
	
	private String username;
	
	// �������װ����Ҫ�Ĳ�ѯ������

	// �û���ѯ������
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
	
	// ���԰�װ�������Բ�ѯ�������綩������Ʒ��
	
	// ...
	
}
