public class CharOperationExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result = v1 / v2; // 2
        double result1;

        result = sum(10, 15);
        System.out.println(result);
        result = minus(v1, v2);
        System.out.println(result);
        result1 = divide(v1, v2);
        System.out.println(result1);
    }

    public static int sum(int num1, int num2) { // public static int (int)를 적으면 리턴타입이 인트형
        int result = num1 + num2;
        return result;
    }

    public static int minus(int num1, int num2) {
        int result;
        return result = num1 - num2;
    }

    public static double divide(int num1, int num2) {
        double a = (double) num1 / num2; // return (double)num1 / num2;
        return a;

    }
}