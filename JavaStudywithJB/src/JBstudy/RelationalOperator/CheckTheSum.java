import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        boolean ans = (a+b+c) >= 20;
        System.out.println(ans);
        // put your code here
    }
}
