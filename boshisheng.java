package lab_4;
 interface Student {
	public abstract void setFee(float fee);
    public abstract void getFee(float fee);
}
 interface Teacher {
    public abstract void setSalary(float salary);
    public abstract void getSalary(float salary);
}
abstract class boshisheng implements Student,Teacher{
	
			String name;
			String sex;
			int  age;
			double fee;
			double salary;
			boshisheng(){	
			}	
		public boshisheng(String name, String sex, int age ) {
			this.name=name;
			this.sex=sex;
			this.age=age;
		}
		public String getName() {
			return name;	
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex=sex;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public void getSalary(float salary) {
			this.salary = salary*12;
		}
		public void setFee(float fee) {
		    this.fee=fee;  
		}
		public void getFee(float fee) {
			this.fee = fee ;
		}
		
}
		

