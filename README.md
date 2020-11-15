#  接口程序实验  
## 实验目的  
1.掌握接口的定义和实现方法  
2.实验抽象类和抽象方法的使用  
## 实验过程 
1.先创建两个接口（学生、老师）；  
2.创建boshisheng类，创建构造方法，建立，获取属性信息；  
3.创建Test类，实例化用户信息，赋值，输出年纳税金额；  
## 核心方法  
1.定义接口  
``` 
 interface Student {
	public abstract void setFee(float fee);
    public abstract void getFee(float fee);
}   
```
2.实现接口  
```  
abstract class boshisheng implements Student,Teacher  {
}  

```
3.建立构造方法  
```  
public boshisheng(String name, String sex, int age ) {
			this.name=name;
			this.sex=sex;
			this.age=age;
		}  
    
```  
4.使用sanner方法输入学费、薪水  
```  
Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的学费：");
		float fee = scanner.nextFloat();
		System.out.println("请输入你的月薪：");
		float salary = scanner.nextFloat();  
 ```  
5.使用final方法定义税率常量  
```  
final double rate=0.1;  
```
## 实验结果  
```  
----------------------------------------
姓名：张鹏飞
性别：男
年龄：22
----------------------------------------
请输入你的学费：
5000
请输入你的月薪：
5000
----------------纳税金额-------------------
您的年纳税金额为：
5500.0
----------------------------------------
```  
## 实验感想  
通过本次实验，基本掌握了接口的定义（interface）和实现方法（implements）；学会了抽象类和抽象方法的使用，知道了所有的抽象方法的访问权限必须是public；学会了使用scanner方法输入信息；学会了使final方法，知道了final修饰的是常量；
