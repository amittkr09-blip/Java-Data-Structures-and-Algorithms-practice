class fibbonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
    }
}



/*
   Fibonacci Recursion

   Formula:
   F(n) = F(n-1) + F(n-2)

   Base Case:
   F(0) = 0
   F(1) = 1

   Example:
   F(5)
   = F(4) + F(3)
   = 3 + 2
   = 5

   Time Complexity: O(2^n)
   Space Complexity: O(n) - recursion stack
*/