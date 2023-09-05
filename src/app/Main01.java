package app;

public class Main01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        int count = 1;
        for (int i = 0; i < array[3]; i++) {
            sum += array[i];
            System.out.println(count + ") Num is " + array[i] + ",sum is " + sum);
            count++;
        }
        System.out.println("------------------" + "\nSum of numbers is 10");
    }
}



