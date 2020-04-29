
public class ForRemind2 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i <= 20; i++) {
            if ((i % 2 == 0) || (i % 3 == 0)) {
                System.out.println("2 또는 3의 배수 " + i);
            }
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println("2와 3의 공통배수" + i);
            }
        }
    }
}