package session3oop.incapsoltion;

public class carsTwo {



    // attributes / Data type
    private int spead;
   private String color;
    private String model;
    private int speed;
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
    public carsTwo(String model, String color, int spead) {
        this.model = model;
        this.color = color;
        this.spead = spead;
        counter++;
    }

    public carsTwo()
    {
        System.out.println("this is am empty object");
}

    public void setspeed (int speed)
    {

        this.speed=speed;
    }
    //getter
public int getspeed() {
    return speed;
}

    public int getSpead() {
        return spead;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }
}