package lab_4;
import java.util.Scanner;
public class Test extends boshisheng{
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(String name, String sex, int age) {
		super(name, sex, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		boshisheng  a1 = new Test("张鹏飞","男",22);
		System.out.println("----------------------------------------");
		System.out.println("姓名："+a1.getName());
		System.out.println("性别："+a1.getSex());
		System.out.println("年龄："+a1.getAge());
		System.out.println("----------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的学费：");
		float fee = scanner.nextFloat();
		System.out.println("请输入你的月薪：");
		float salary = scanner.nextFloat();
		a1.setFee(salary);
		System.out.println("----------------纳税金额-------------------");	
	    final double rate=0.1;
	    double sum=salary*12-fee;
	    double shui=sum*0.1;
	    System.out.println("您的年纳税金额为：");
	    System.out.println(shui);	
		System.out.println("----------------------------------------");
	}

	

	
}
