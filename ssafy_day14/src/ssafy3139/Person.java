package ssafy3139;

/**
 * 메소드 오버라이딩 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 메소드 오버라이딩은 상속 관계인 경우 부모 클래스에 정의한 메소드를 자식 클래스에서 '재정의'하는 것을 말합니다.
 * 
 * 실습 순서
 * 1) Person 클래스의 showInformation() 메소드 구현
 * 2) Student 클래스의 showInformation() 메소드 구현
 * 3) Teacher 클래스의 showInformation() 메소드 구현
 * 4) InheritanceTest 구현
 */
public class Person {

	String name;
	int age;

	Person() {
		
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Q. 이름, 나이를 출력할 수 있는 showInformation() 메소드를 구현해 봅시다.
	void showInformation() {
		System.out.println("Person 클래스의 showInformation() ");
	    System.out.println("이름: " + name);
	    System.out.println("나이: " + age);
	}
}
