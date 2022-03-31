public class question10{

        public static void main(String[] args)
        {
            int n=12344;
            System.out.print(n);
            //Object created of class numConWords
            numConWords nw = new numConWords();
            nw.genWords((n / 1000000000), " Hundred");
            nw.genWords((n / 10000000) % 100, " crore");
            nw.genWords(((n / 100000) % 100), " lakh");
            nw.genWords(((n / 1000) % 100), " thousand");
            nw.genWords(((n / 100) % 10), " hundred");
            nw.genWords((n % 100), " ");
        }
    }
    class numConWords {

        void genWords(int n, String ch) {
            String one[] = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
                    " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
                    " Nineteen"};

            String ten[] = {" ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety"};

            if (n > 19) {
                System.out.print(ten[n / 10] + " " + one[n % 10]);
            } else {
                System.out.print(one[n]);
            }
            if (n > 0)
                System.out.print(ch);
        }
    }