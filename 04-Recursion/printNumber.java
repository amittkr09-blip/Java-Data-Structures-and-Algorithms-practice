//   INCREASING ORDER
// public class printNumber {
//     public static void printNumbers(int n) {
//         if (n >= 10) {
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printNumbers(n + 1);
//     }

//     public static void main(String[] args) {
//         printNumbers(1);
//     }
// }
// DECREASING ORDER

public class printNumber {
    public static void printNumbers(int n) {
        if (n <= 1) {
            System.out.println(n);
            return;
            
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}