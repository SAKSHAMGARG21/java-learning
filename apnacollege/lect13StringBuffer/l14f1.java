public class l14f1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");

        // System.out.println(sb);
        // System.out.println(sb.charAt(0));
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);
        // sb.insert(0, 'S');
        // System.out.println(sb);
        // sb.insert(3, "n");
        // System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);
        sb.delete(2, 4);
        System.out.println(sb);

        // StringBuilder sb = new StringBuilder("h");
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);
        // System.out.println(sb.length())

        // StringBuilder sb = new StringBuilder("hello");
        // StringBuilder sb2 = new StringBuilder();
        // for (int i = sb.length() - 1; i >= 0; i--){
        // sb2.append(sb.charAt(i));
        // }

        // int s = 0;
        // int e = sb.length() - 1;
        // while (s <= e) {
        //     char temp = sb.charAt(s);
        //     sb.setCharAt(s, sb.charAt(e));
        //     sb.setCharAt(e, temp);
        //     s++;
        //     e--;
        // }
        // System.out.println(sb);

        // StringBuilder sb1 = new StringBuilder("HelloWorld");

        // for (int i = 0; i < sb1.length() / 2; i++) {
        //     int front = i;
        //     int back = sb1.length() - i - 1;

        //     char frontChar = sb1.charAt(front);
        //     char backChar = sb1.charAt(back);

        //     sb1.setCharAt(front, backChar);
        //     sb1.setCharAt(back, frontChar);
        // }

        // System.out.println(sb1);

    }
}
