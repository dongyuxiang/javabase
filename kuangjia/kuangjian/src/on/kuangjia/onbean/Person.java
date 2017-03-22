package on.kuangjia.onbean;

public class Person {
	private String name;//��Ա����  ����װ
	private int age;
	
	public Person() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {//��������
		this.name = name;//this.name��ʾ����ĳ�Ա���ԣ�
						//�����name��ʾ��������
//���������ƺͳ�Ա����������ͬʱ���ڻ������÷ֱ�����ʹ��this�����֣�
//������Ʋ���ͬ�����ʡ��
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
