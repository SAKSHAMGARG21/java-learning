// import java.util.Scanner;

// public class rotateArrKTimes {
//     public static void rotateArrayKTimes(int[][] arr, int k) {
//         int nRows = arr.length;
//         int nCols = arr[0].length;
//         int[][] tempArray = new int[nRows][nCols];

//         // Calculate effective number of rotations (0 to 3)
//         k = k % 4;

//         for (int r = 0; r < k; r++) {
//             for (int i = 0; i < nRows; i++) {
//                 for (int j = 0; j < nCols; j++) {
//                     tempArray[j][nRows - i - 1] = arr[i][j];
//                 }
//             }
//             arr = tempArray;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int nRows = scanner.nextInt();
//         int nCols = scanner.nextInt();
//         int k = scanner.nextInt();
//         int[][] arr = new int[nRows][nCols];

//         for (int i = 0; i < nRows; i++) {
//             for (int j = 0; j < nCols; j++) {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         rotateArrayKTimes(arr, k);

//         for (int i = 0; i < nRows; i++) {
//             for (int j = 0; j < nCols; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class rotateArrKTimes {
//     public static void rotateArrayKTimes(int[][] arr, int k) {
//         int nRows = arr.length;
//         int nCols = arr[0].length;

//         // Calculate effective number of rotations (0 to 3)
//         k = k % 4;

//         int[][] tempArray = new int[nCols][nRows];
//         tempArray = arr;

//         for (int r = 0; r < k; r++) {
//             int[][] tempArray2 = new int[nRows][nCols];
//             for (int i = 0; i < nRows; i++) {
//                 for (int j = 0; j < nCols; j++) {
//                     tempArray2[j][nRows - i - 1] = tempArray[i][j];
//                 }
//             }
//             tempArray = tempArray2;
//         }
//         arr = tempArray;
//         for (int i = 0; i < tempArray.length; i++) {
//             for (int j = 0; j < tempArray[i].length; j++) {
//                 arr[i][j] = tempArray[i][j];
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int nRows = scanner.nextInt();
//         int nCols = scanner.nextInt();
//         int k = scanner.nextInt();
//         int[][] arr = new int[nRows][nCols];

//         for (int i = 0; i < nRows; i++) {
//             for (int j = 0; j < nCols; j++) {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         rotateArrayKTimes(arr, k);

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class rotateArrKTimes {
// public static void rotateArrayKTimes(int[][] arr, int k) {
// int nRows = arr.length;
// int nCols = arr[0].length;

// // Calculate effective number of rotations (0 to 3)
// k = k % 4;

// int[][] tempArray;
// for (int r = 0; r < k; r++) {
// tempArray = new int[nCols][nRows];
// for (int i = 0; i < nRows; i++) {
// for (int j = 0; j < nCols; j++) {
// tempArray[j][nRows - i - 1] = arr[i][j];
// }
// }
// arr = tempArray;
// }

// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int nRows = scanner.nextInt();
// int nCols = scanner.nextInt();
// int k = scanner.nextInt();
// int[][] arr = new int[nRows][nCols];

// for (int i = 0; i < nRows; i++) {
// for (int j = 0; j < nCols; j++) {
// arr[i][j] = scanner.nextInt();
// }
// }

// rotateArrayKTimes(arr, 1);

// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[0].length; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

import java.util.Scanner;

public class rotateArrKTimes {
    public static void rotateArrayKTimes(int[][] arr, int k) {
        int nRows = arr.length;
        int nCols = arr[0].length;

        // Calculate effective number of rotations (0 to 3)
        k = k % 4;

        for (int r = 0; r < k; r++) {
            int[][] tempArray = new int[nCols][nRows];
            for (int i = 0; i < nRows; i++) {
                for (int j = 0; j < nCols; j++) {
                    tempArray[j][nRows - i - 1] = arr[i][j];
                }
            }
            // Copy tempArray back to arr
            arr = new int[nCols][nRows];
            for (int i = 0; i < nCols; i++) {
                for (int j = 0; j < nRows; j++) {
                    arr[i][j] = tempArray[i][j];
                }
            }
            int temp = nRows;
            nRows = nCols;
            nCols = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nRows = scanner.nextInt();
        int nCols = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arr = new int[nRows][nCols];

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        rotateArrayKTimes(arr, k);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
