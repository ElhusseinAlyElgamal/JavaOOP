package session2java;

public class dandl {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
// ++ when u want to add '1' to your variables
// -- when u want to Minus '1' to your variables
        System.out.println(number1);
        System.out.println(number2);

        System.out.println(++number1);
        System.out.println(number1);

        System.out.println(--number1);
        System.out.println(number1);

        System.out.println(--number1);
        System.out.println(number1);

        System.out.println(++number2);
        System.out.println(number2);

        System.out.println(--number2);
        System.out.println(number2);

        System.out.println(--number2);
        System.out.println(number2);

// لما العلامة -- او ++ تتحط بعد الnumber العملية
// الحسابية بتتم وتتخزن في الميموري بس في
// اول Print للكود مبتظهرش بتظهر في تاني Print

        System.out.println(number1--);
        System.out.println(number1);

        System.out.println(number2++);
        System.out.println(number2);
    }
}
