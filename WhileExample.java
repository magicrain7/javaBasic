
public class WhileExample {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        // for(int i = 1; i <= 5; i++){
        // sum = sum + i;
        // }

        // //while문 사용
        // int i = 1;
        // while(i <= 5){
        // sum = sum + i;
        // i++;
        // }
        // while(i <= 5){
        // sum = sum + i;
        // i = 1;
        // if(i > 5){
        // break;
        // }
        // i++;
        // }

        while (i <= 100) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("1~100까지 홀수의 합은" + sum);
    }
}