package session1oop;

public class cars {



    // attributes / Data type
    public int spead;
    public String color;
    public String model;
     static int counter;


    //methods / opperations
//
    public void printinfo() {
        System.out.println("model" + model + "," +
                "color" + color + "," +
                "speed" + spead);


    }
    static void noofbjectsinclass() {
        System.out.println("no of object"+counter);
    }
    //nonststic


    //constructor
    public cars(String model, String color, int spead) {
        this.model = model;
        this.color = color;
        this.spead = spead;
        counter++;
    }

    public cars()
    {
        System.out.println("this is am empty object");
    }

}


