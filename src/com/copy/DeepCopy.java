package com.copy;
class Address1 implements Cloneable
{
    int pin;
    String city;

    public Address1(int pin, String city) {
        this.pin = pin;
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address1{" +
                "pin=" + pin +
                ", city='" + city + '\'' +
                '}';
    }
}

class Student1 implements Cloneable
{
    int roll;
    String name;
    Address1 addr;

    public Student1() {
    }

    public Student1(int roll, String name, Address1 addr) {
        this.roll = roll;
        this.name = name;
        this.addr = addr;
    }

  

	@Override
    protected Object clone() throws CloneNotSupportedException {
        Student1 dummyStudent = (Student1) super.clone();
        dummyStudent.addr = (Address1) this.addr.clone();
        return dummyStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }
}

public class DeepCopy
{

    public static void main(String[] args) throws CloneNotSupportedException 
    {

        Address1 addr1 = new Address1(123,"Pune");
        Student1 original = new Student1(10, "Ram", addr1);

        Student1 cloned = (Student1) original.clone();

        System.out.println("Original Object " +original);
        System.out.println("Cloned Object " +cloned);

        cloned.roll = 30;
        cloned.name = "Sham";
        cloned.addr.city = "Mumbai";

        System.out.println(">>>>>>> After changing fields <<<<<<<<<");
        System.out.println("Original Object " +original);
        System.out.println("Cloned Object " +cloned);
    }
}