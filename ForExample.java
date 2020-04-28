
public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("1~5까지 합은" + sum);
        // System.out.println(2 + " * " + 1 + " = " + (2*1));
        // System.out.println(2 + " * " + 2 + " = " + (2*2));
        // System.out.println(2 + " * " + 3 + " = " + (2*3));

        sum = 0;
        int i = 0;
        for (i = 1; i <= 9; i++) {
            System.out.println(2 + " * " + i + " = " + (i * 2));
        }
        sum = 0;
        for (i = 1; i <= 100; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}