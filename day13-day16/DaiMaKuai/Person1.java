package DaiMaKuai;

public class Person1 {
	private String name;
	private int age;
	  
		{
			System.out.println("构造代码块执行了");
		}
		Person1(){
			System.out.println("Person无参数的构造函数执行");
		}
		Person1(int age){
			this.age = age;
			System.out.println("Person（age）参数的构造函数执行");
		}
}

