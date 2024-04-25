package exceotionHandling;

class IllegalRangeException extends Exception {
    public IllegalRangeException(String message) {
        super(message);
    }
}

class PrimeRange {
    public static void main(String[] args) {
        try {
            printPrimeNumbers(1, 1);
        } catch (IllegalRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void printPrimeNumbers(int start, int end) throws IllegalRangeException {
        if (start < 2 || end < 2 || start > end) {
            throw new IllegalRangeException("Bhai sahab sahi range do");
        }

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
