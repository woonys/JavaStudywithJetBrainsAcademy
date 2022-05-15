import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourBefore = scanner.nextInt() * 3600;
        int minBefore = scanner.nextInt() * 60;
        int secBefore = scanner.nextInt();
        int hourAfter = scanner.nextInt() * 3600;
        int minAfter = scanner.nextInt() * 60;
        int secAfter = scanner.nextInt();
        
        int ans = (secAfter + minAfter + hourAfter) - (secBefore + minBefore + hourBefore);
        System.out.println(ans);
        
    }
}
