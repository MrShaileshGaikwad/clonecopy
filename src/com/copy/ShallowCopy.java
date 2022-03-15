package com.copy;

class Address 
{
	int pin;
	String city;
	
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
}
	class Student implements Cloneable
	{
		int id;
		String name;
		Address addr;
		
		public Student (int id,String name,Address addr)
		{
			this.id=id;
			this.name=name;
			this.addr=addr;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
		}
		public Student() {}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
}
public  class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address addr = new Address(411062,"pune");
		
		Student s =new Student (12,"shailesh",addr);
		
		Student clone = (Student)s.clone();
		
		System.out.println(s);
		System.err.println(clone);
		System.err.println("after clone  change field");
		
		clone.id=17;
		clone.name="slash";
		clone.addr.city="thane";
		
		System.out.println(s);
		System.err.println(clone);
	}

}
