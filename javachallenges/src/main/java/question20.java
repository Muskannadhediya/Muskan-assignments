public class question20 {

        public static void main(String[] args) {
            String str = "I am always ready to learn although i don not always like being taught";
            String rs = str.replace("a","$"); // Replace 'a' with '$'
            System.out.println(rs);
            rs = rs.replace("$","a"); // Replace '$' with 'a'
            System.out.println(rs);
        }
    }

