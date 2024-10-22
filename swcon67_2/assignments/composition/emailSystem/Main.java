//ธนกฤต ตระกาจัทร์ 661040206060

package composition.emailSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmailSystem system = new EmailSystem();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=========== SWCon Email System ===========");
        while (running) {
            System.out.print("=======> Command [Log I)n  S)end  R)ead  Log O)ut  Q)uit]: ");
            String command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "I":
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    system.login(username);
                    break;
                case "S":
                    System.out.print("Enter recipient: ");
                    String recipient = scanner.nextLine();
                    System.out.print("Enter text: ");
                    String text = scanner.nextLine();
                    system.sendEmail(recipient, text);
                    break;
                case "R":
                    system.readEmails();
                    break;
                case "O":
                    system.logout();
                    break;
                case "Q":
                    running = false;
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }

        scanner.close();
    }
}
