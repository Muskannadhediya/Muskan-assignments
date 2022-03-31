public class question4b {
    public static void main(String[] args) {

        float first = 1.4f, second = 2.4f, third = 3.4f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        System.out.println("third number = " + third);


        float temporary = first;


        first = second;


        second = third;


        third = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        System.out.println("third number = " + third);
    }
}


