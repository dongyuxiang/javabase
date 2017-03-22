package on.kuangjia.onbean;

public class Person {
	private String name;//成员属性  ，封装
	private int age;
	
	public Person() {
		super();
		// TODO 自动生成的构造函数存根
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
	public void setName(String name) {//参数名字
		this.name = name;//this.name表示上面的成员属性，
						//后面的name表示参数名字
//当参数名称和成员属性名称相同时由于机器不好分别，所以使用this来区分，
//如果名称不相同则可以省略
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
