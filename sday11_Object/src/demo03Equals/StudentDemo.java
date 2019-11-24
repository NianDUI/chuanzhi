package demo03Equals;

/*
 * Object�۵ķ���:
 * 		public boolean equals(Object obj)
 * 			ָʾ����ĳ�������Ƿ���˶�����ȡ���
 * ���������Ĭ������±Ƚϵ��ǵ�ֵַ��
 * ��ô��д��
 * 		һ���ǱȽ϶���ĳ�Ա����ֵ�Ƿ���ͬ
 * 
 * 		public boolean equals(Object obj) {
        	return (this == obj);
    	}
 * 
 * ==:
 * 		�������ͣ��Ƚ�ֵ�Ƿ����
 * 		�������ͣ��Ƚϵľ��ǵ�ֵַ�Ƿ���ͬ
 * 
 * 
 */
public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("����ϼ", 27);

		System.out.println(s1 == s2);
		Student s3 = s1;
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		Student s4 = new Student("������", 30);
		System.out.println(s1.equals(s4));
	}

}
