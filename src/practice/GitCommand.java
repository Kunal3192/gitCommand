package practice;

public class GitCommand {
    public static void calcSum(int a, int b){
        System.out.println(a + b);
    }
    public static int calcSub(int a, int b){
        return a - b;
    }
    public static void main(String[] args) {
        System.out.println("This is git command");
        calcSum(5, 6);
        System.out.println(calcSub(10, 5));
    }
}
