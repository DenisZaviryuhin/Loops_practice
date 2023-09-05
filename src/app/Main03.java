package app;

public class Main03 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 6; i >= 1; i--){
            sum += i;
            count++;
            System.out.println(count + ") Num is " + i + ", sum is " + sum);
        }
        System.out.println("-------------------" + "\nSum of numbers is " + sum);
    }
}
