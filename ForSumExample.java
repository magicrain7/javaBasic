
public class ForSumExample {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        // for (i = 1; i <= 100; i++) {
        // if (i % 3 == 0) { //3의 배수일때
        // sum = sum + i;
        // }
        for (i = 0; i <= 100; i = i + 3) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("1~100까지 3의 배수의 합은 " + sum + " 입니다");
    }
}