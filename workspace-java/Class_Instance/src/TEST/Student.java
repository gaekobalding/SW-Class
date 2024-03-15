package TEST;

public class Student {

	String name;
	int age;
	String avg;
	
	public static void main(String[] args) {

		Student student1 = new Student("홍길동", 20, "컴퓨터공학");
		Student student2 = new Student("김철수", 22, "전자 공학");
		
		System.out.println("no.1 : ");
		student1.displayStudentInfo();
		System.out.println("\n");
		System.out.println("no.2 : ");
		student2.displayStudentInfo();
	}
	
	public Student(String name, int age, String avg) {
		super(); //자동으로 생기는 기본 생성장 -> 있어도 되고 없어도 됨
		this.name = name;
		this.age = age;
		this.avg = avg;
	}


	private void displayStudentInfo() {
		System.out.printf("이름 : " + name +", " + "나이 : " + age +", " + "학과 : " + avg );
		
	}

}
