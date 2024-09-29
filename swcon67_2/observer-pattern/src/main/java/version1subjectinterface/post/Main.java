package version1subjectinterface.post;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String pageName = "Master Chef";
        FacebookPage page = new FacebookPage(pageName); // subject
        User kwan = new User("Kwan");  // observer 1
        kwan.follow(page);
        User ploy = new User("Ploy");  // observer 2
        ploy.follow(page);

        // observer 3
        BackupService service = new BackupService(pageName,"backup.txt", page);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Post: ");
            String message = scanner.nextLine();
            page.post(message);
        }
    }
}
