// import java.util.*;

// public class clibstaircase {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         System.out.println(count(n));
//     }

//     public static int count(int step) {
//         if (step < 0) {
//             return 0;
//         }

//         if (step == 0) {
//             return 1;
//         }

//         int res = count(step - 1) + count(step - 2);
//         return res;
//     }

// }

import java.util.*;

public class clibstaircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean two=false;
        System.out.println(count(n,two));
    }

    public static int count(int step,boolean two) {
        if (step < 0) {
            return 0;
        }

        if (step == 0) {
            return 1;
        }

        int res=0;
        res+=count(step - 1,false);
        if (!two){
            res+=count(step - 2,true);
        }
        return res;
    }

}

