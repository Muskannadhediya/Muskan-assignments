
    import java.io.FileOutputStream;
    public class question9 {
        public static void main(String args[]){
            try{
                FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
                fout.write(65);
                fout.close();
                System.out.println("target...");
            }catch(Exception e){System.out.println(e);}
        }
    }


