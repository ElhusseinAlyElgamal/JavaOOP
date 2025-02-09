package session2java;

public class Switch {
    public static void main(String[] args) {
        // = Assign
        // == Equality
        int Number = 2;
        if (Number > 5) {
            System.out.println("Number bigger than 5");
        } else if (Number > 7) {

            System.out.println("Number bigger than 7");
        } else if (Number > 10) {
            System.out.println("Number bigger than 10");
        } else {
            System.out.println("Number is not bigger than 5,7,10");
        }
        int number = 80;
        switch (number) {
            case 5:
                System.out.println("Number is 5");

                break;

            case 10:
                System.out.println("Number is 10");

                break;

            case 15:
                System.out.println("Number is 15");

                break;

            case 20:
                System.out.println("Number is 20");

                break;

            default:
                System.out.println("Number isn't equal");

        }

    }

}

