import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("아이디를 입력하세요 : ");
        String username = sc.nextLine();

        System.out.printf("생년월일를 입력하세요 : ");
        int birth = sc.nextInt();

        System.out.printf("아이디 : %s\n생년월일 : %d", username, birth);
    }
}
