
public class MethodExample1 {
    public static void main(String[] args) {
        System.out.println("result :" + sum(10, 20));
        System.out.println("result :" + sum(10.2, 20.4));
        System.out.println("result :" + sum(1, 2, 3));
        System.out.println("1부터 5까지 합" + toSum(1,5));             //tosSum(num1,num2)
        printStar(1,3);
        System.out.println("======");
        printStar(1,5);
        printDouble(20);
        printDouble(10,3);
        printString("Good morning","Lee");
        printStar(3," HELLO ");
        printGugudan(5);
        printTriangle();
    }
    public static void printTriangle(){
        for(int i = 1; i <= 5; i++) {
            System.out.println();
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void printGugudan(int a) {
        for( int i =1; i<=9; i++){
            System.out.println(a +" * " + i + " = " + (a*i));
        }
    }

    public static void printString(String str, String name) {  //void 반환되는 값이 없다.
        System.out.println(str + ", "+ name);

    }

    public static void printDouble(int a){
        System.out.println(a*2);
    }
    public static void printDouble(int a, int b){
        System.out.println(a*b);
    }
    
    public static void printStar(int a, int b){
        for(int i = a; i<=b; i++){
            for(int j = 1; j <= a; j++){
            System.out.println("*");
            }
        }
    }
    public static void printStar(int a, String str){
        for(int i =1; i<=a; i++){
            System.out.println(str);
        }
    }


    public static int toSum(int num1, int num2){  
        int sum = 0;
        for (int i = num1; i <= num2; i++){
            sum += i; //sum = sum + i;
        }
        return sum;
    }

    public static int sum(int a, int b) { // sum이라는 Method
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static double sum(double c, double d) { 
        double sum = 0;
        sum = c + d;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;
    }
}