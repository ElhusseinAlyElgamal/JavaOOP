package abbstractiom;

import session3oop.inheritance.persons;

public class fixedemployee3 extends persons {
    int daysof;

    String department;
   private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void calculatesalary()
    {
        System.out.println("salary"+salary);
    }


    }
