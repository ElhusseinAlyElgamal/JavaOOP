package session3oop.inheritance;

public class persons {
    int id;
    String name;
    double salary;
    int hours;

    public void printofhouremplye() {
        System.out.println();
    }
    public persons(int id ,String name)
    {
       this.id=id;
      this.name=name;
}
public persons()
{
    System.out.println("default construcror");
}
}