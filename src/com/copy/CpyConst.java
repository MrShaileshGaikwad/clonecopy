package com.copy;


class Person
{
    int adhar;
    String name;
    OfficeAddr addr;

    public Person(int adhar, String name, OfficeAddr addr) {
        this.adhar = adhar;
        this.name = name;
        this.addr = addr;
    }

    public  Person(Person p)
    {
        this.adhar = p.adhar;
        this.name = p.name;
        //this.addr = p.addr; no taking here
        OfficeAddr dummyAddr = new OfficeAddr();
        dummyAddr.city = p.addr.city;
        dummyAddr.pin = p.addr.pin;
        this.addr = dummyAddr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "adhar=" + adhar +
                ", name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }
}

class OfficeAddr
{
    String city;
    int pin;

    public OfficeAddr() {
    }

    public OfficeAddr(String city, int pin) {
        this.city = city;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "OfficeAddr{" +
                "city='" + city + '\'' +
                ", pin=" + pin +
                '}';
    }
}
public class CpyConst {
    public static void main(String[] args) {

        OfficeAddr addr = new OfficeAddr("Pune",123);
        Person p1 = new Person(12345, "ABC", addr);
        Person p2 = new Person(p1);
        System.out.println("Original : "+p1);
        System.out.println("Copy : "+p2);

        p2.addr.city = "Mumbai";

        System.out.println("after change in mutable filed");
        System.out.println("Original : "+p1);
        System.err.println("Copy : "+p2);
    }
}
