// public class firstandlastOcc {
//     public static int findFirstOcc(String str, char ch) {
//         int index = str.indexOf(ch);
//         return index;
//     }

//     public static int findLastOcc(String str, char ch) {
//         return str.lastIndexOf(ch);
//     }

//     public static void main(String[] args) {
//         String str = "yyyaaabbrrffaabbddaaxz";

//         int firstOcc = findFirstOcc(str, 'a');
//         int lastOcc = findLastOcc(str, 'a');
//         System.out.println(lastOcc + " " + firstOcc);
//     }
// }
public class firstandlastOcc {

    public static int firstocc = -1;
    public static int lastocc = -1;

    public static void findocc(String str, int idx, char ch) {

        if (idx >= str.length()) {
            System.out.println(firstocc);
            System.out.println(lastocc);
            return;
        }

        char currchar = str.charAt(idx);
        if (currchar == ch) {
            if (firstocc == -1) {
                firstocc = idx;
            } else {
                lastocc = idx;
            }
        }

        findocc(str, idx + 1, currchar);
    }

    public static void main(String[] args) {
        String str = "yyyaaabbrrffaabbddaaxz";
        findocc(str, 0, 'a');
    }
}
