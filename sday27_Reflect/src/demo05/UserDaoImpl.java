package demo05;

public class UserDaoImpl implements UserDao{

	@Override
	public void add() {
		System.out.println("��ӹ���");
	}

	@Override
	public void delete() {
		System.out.println("ɾ������");
	}

	@Override
	public void update() {
		System.out.println("���¹���");
	}

	@Override
	public void find() {
		System.out.println("���ҹ���");
	}

}
