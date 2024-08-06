public class file1 {
    public static void main(String[] args) {

        String st = "23";

        for (int i = 0; i < 2; i++) {
            char ch = st.charAt(i);
            int val = ch - '0';
            System.out.print(val);
        }
    }
}
