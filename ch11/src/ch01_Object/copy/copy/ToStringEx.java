package ch01_Object.copy.copy;

import java.sql.Date;

public class ToStringEx {
	public static void main(String[] args) {
		A a = new A();
		a.f1 = "field1";
		a.i1 = 10;
		//toString 메소드는 필드값 출력용으로 재정의하여 사용.
		System.out.println(a.toString());
		
		//Date클래스의 toString()은 날짜정보출력하도록 재정의 됨.
		Date date = new Date(0);
		System.out.println(date.toString());
		
		//System.out.print()메소드의 매개변수로 참조변수가 전달되면
		//toString()메소드가 자동 호출
		System.out.println(a);
		System.out.println(date);
	}
}
class A extends Object {
	String f1;
	int i1;
	
	@Override
	public String toString() {
		return "A [f1=" + f1 + ", i1=" + i1 + "]";
	}
	
	
	
}