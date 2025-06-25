class Fibonacci {
    static int callCount = 0;

    static int fib(int n) {
        callCount++;
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int totalTerms = 5;

        for (int i = 0; i < totalTerms; i++) {
            System.out.print(fib(i) + " ");
        }

        System.out.println("\nCalls made: " + callCount);
    }
}