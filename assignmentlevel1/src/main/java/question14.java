
    import java.util.Scanner;
    public class question14 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of terms:");
            int n=sc.nextInt();
            int x=1;
            int y=4;
            int z=7;
            System.out.print(x+" "+y+" "+z+" ");
            int count=4;
            while(count<=n){
                int num=x+y+z;
                x=y;
                y=z;
                z=num;
                System.out.print(num+" ");
                count++;
            }
        }
    }

