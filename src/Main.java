import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the password: ");
            int password = sc.nextInt();
            if (!(password == 2002)) {
                System.out.println("Invalid password");
            }else {
                break;
            }
        }
        System.out.println("Welcome");
        sc.close();
    }
}