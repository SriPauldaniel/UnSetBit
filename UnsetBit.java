import java.util.Scanner;
public class UnsetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        if(i>=0) {
            n = n & ~(1<<i);
        }
        
        System.out.println(n);
        sc.close();
    }
}