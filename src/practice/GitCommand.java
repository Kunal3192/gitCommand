package practice;

public class GitCommand {
    public static int calcSum(int a, int b){
        return a + b;
    }
    public static int calcSub(int a, int b){
        return a - b;
    }
    public static int calcMul(int a, int b){
        return a * b;
    }
    public static int calcDiv(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("This is git command");
        System.out.println(calcSum(5, 6));
        System.out.println(calcSub(10, 5));
        System.out.println(calcMul(10, 5));
        System.out.println(calcDiv(10, 5));
    }
}
