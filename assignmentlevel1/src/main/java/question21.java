
import java.util.Scanner;
    public class question21 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n,i,pr=1;
            System.out.printf("Enter the range of number(Limit):");
            n=sc.nextInt();
            for(i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    System.out.print(-1*pr+" ");
                }
                else
                {
                    System.out.print(pr+" ");
                }
                pr=(int) (pr+Math.pow(i,2));

            }
            sc.close();
        }
    }

