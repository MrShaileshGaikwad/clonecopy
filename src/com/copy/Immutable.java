package com.copy;


final class Employe
{
	private final int id;
    private final String name;
	private final Address2 addr;
	
	
	
	public Employe(int id, String name, Address2 addr)
	{
		super();
		this.id = id;
		this.name = name;
		Address2 clone =new Address2();
		clone.setPin(addr.getPin());
		clone.setCity(((Address2) addr).getCity());
		clone.setState(addr.getState());
		this.addr = clone;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public Address2 getAddr() {
		Address2 duplicate=new Address2();
		duplicate.setPin(addr.getPin());
		duplicate.setCity(addr.getCity());
		duplicate.setState(addr.getState());
		return duplicate;
	}


	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
}
public class Immutable {

	public static void main(String[] args) {
		
		Address2 original =new Address2(4111,"pune","dehli");
    Employe e=  new Employe(10, "ram",original);
System.err.println(e);
e.getAddr().setCity("dubai");
System.out.println(e);
	}

}
