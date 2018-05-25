package kedacom;

public class Student {
      private Integer id;
      private double age;
      private String name;
      private int score;
	public Student() {
	}
	public Student(double age, String name, int score) {
		this.age = age;
		this.name = name;
		this.score = score;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", score=" + score + "]";
	}
      
}
