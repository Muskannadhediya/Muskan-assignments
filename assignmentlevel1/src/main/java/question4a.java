public class question4a {

        public static void main(String[] args) {

            float first = 1.4f, second = 2.4f;

            System.out.println("--Before swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);


            float temporary = first;


            first = second;


            second = temporary;

            System.out.println("--After swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
        }
    }

