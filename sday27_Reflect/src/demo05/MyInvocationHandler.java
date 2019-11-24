package demo05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private Object target; // Ŀ�����
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Ȩ��У��");
		Object obj = method.invoke(target, args);
		System.out.println("��־��¼");
		return obj;
	}

}
