package app;

public class Main02 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
                System.out.println(count + ") Num is " + i + ", sum is " + sum);

            }
        }
        System.out.println("-----------------" + "\nSum of numbers is " + sum);
    }
}








