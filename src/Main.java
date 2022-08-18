public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {


        // Task 1

        int[] arr = generateRandomArray();
        int monthlyAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            monthlyAmount += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Сумма трат за месяц составила " + monthlyAmount + " рублей»");
        System.out.println(' ');

        // Task 2

        int maxSumma = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSumma) {
                maxSumma = arr[i];
            }

        }
        System.out.println("Максимальная сумма трат за день составила " + maxSumma + " рублей");
        System.out.println(' ');

        int minSumma = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSumma) {
                minSumma = arr[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minSumma + " рублей.");
        System.out.println(' ');

        // Task 3

        double average = 0;
        if (arr.length > 0) {
            double summa = 0;
            for (int j = 0; j < arr.length; j++) {
                summa += arr[j];
            }
            average = summa / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println(" ");

        // Task 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}