public class question23
    {
        public static void main(String[]x)
        {

            int initial=2;
            System.out.print(initial+" ");

            int diff=6;
            for(int i=1;i<=6;i++)
            {

                if(i%2==0)
                {
                    initial=initial+diff;
                    System.out.print(initial+" ");
                }
                if(i%2!=0)
                {
                    initial=initial-diff;
                    System.out.print(initial+" ");
                }

                diff=diff+4;

            }
        }
    }

