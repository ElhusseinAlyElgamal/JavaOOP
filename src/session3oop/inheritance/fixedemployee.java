package session3oop.inheritance;

public class fixedemployee extends persons {
    int daysof;

    String department;


    public fixedemployee(int id, String name) {
        super(id, name);
    }

    public void printinfoemployee() {
        System.out.println(id + "" + name + salary);
    }
}