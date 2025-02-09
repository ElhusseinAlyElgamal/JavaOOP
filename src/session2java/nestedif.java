package session2java;

public class nestedif {
    public static void main(String[] args) {
        String Name= "hussein";
        int grade = 100;
        int Age= 20;
/*

if (Name.equalsIgnoreCase("mahmoud") && grade==100 )
    System.out.println("Passed");

 */
        if (Name.equalsIgnoreCase("husein")) // Condition 1
            System.out.println(Name);
        System.out.println("codition 1 Passed");

        if (grade >= 50) // Condition 2
        {
            System.out.println(grade);
            System.out.println("codition 2 Passed");
        }else

            System.out.println("codition 2 failed");

        if (Age>=18) // Condition 3
        {
            System.out.println(Age);
            System.out.println("codition 3 Passed");
        }

        else

            System.out.println("codition 3 failed");

    }
}

