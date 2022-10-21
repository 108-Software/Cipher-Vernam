import java.util.Scanner;
public class User_prog {

    public static void main(String[] arg) {

        System.out.println("Подключение успешно!");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        Encryption msg = new Encryption();
        msg.breaking(answer);

    }

}
