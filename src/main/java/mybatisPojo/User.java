package mybatisPojo;

public class User {
       private int id;
       private String name;
       private int age;
       private String sex;
       private int deptno;
       private String deptname;
       
       
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String name, int age, String sex, int deptno) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.deptno = deptno;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
    
	

	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", sex="
				+ sex + ", deptno=" + deptno + "]";
	}


       
}
