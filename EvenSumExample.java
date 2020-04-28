
public class EvenSumExample {
    public static void main(String[] args) {
        // int i = 0;
        // int sum = 0;
        // for (i = 1; i <= 100; i++) {
        // if (i % 2 == 0) {
        // continue;
        // }
        // sum = sum + i;
        // }
        // System.out.println("sum은 " + sum);

        for (int i = 1; i <= 100; i++) {
            // 2 또는 3의 배수를 출력하세요. 조건합(둘중 하나만 맞으면 참): 조건A || 조건B
            if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0)) {
                System.out.println(i);
            }
            // 2와 3의 공통배수.
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println("2와 3의 배수 : " + i);
            }
            if (!(i % 2 == 0)) {
                System.out.println("홀수값: " + i);
            }

        }
    }
}
