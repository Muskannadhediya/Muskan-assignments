public class question11 {


    public static void main(String[] args) {

        int n = 10, firstTerm = 4, secondTerm = 16;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + firstTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

