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
		boshisheng  a1 = new Test("������","��",22);
		System.out.println("----------------------------------------");
		System.out.println("������"+a1.getName());
		System.out.println("�Ա�"+a1.getSex());
		System.out.println("���䣺"+a1.getAge());
		System.out.println("----------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������ѧ�ѣ�");
		float fee = scanner.nextFloat();
		System.out.println("�����������н��");
		float salary = scanner.nextFloat();
		a1.setFee(salary);
		System.out.println("----------------��˰���-------------------");	
	    final double rate=0.1;
	    double sum=salary*12-fee;
	    double shui=sum*0.1;
	    System.out.println("��������˰���Ϊ��");
	    System.out.println(shui);	
		System.out.println("----------------------------------------");
	}

	

	
}
