
public class ForAndForExample {
    public static void main(String[] args) {
        //MethodExample1 m = new  MethodExample1();
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단 ");
            for (int j = 1; j <= 9; j++) {
                System.out.println( i + " * " + j + " = " + i*j);
            }
        }
      // System.out.println(m.sum(1,5));
    }
}