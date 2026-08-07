import java.util.Scanner;

public class Studentinformation {

    String name;
    String usn;
    String branch;

    Scanner sc = new Scanner(System.in);

    // Method to input student details
    void input() {
        System.out.println("\nEnter student name:");
        name = sc.nextLine();

        System.out.println("Enter USN:");
        usn = sc.nextLine();

        System.out.println("Enter branch:");
        branch = sc.nextLine();

        System.out.println("\nStudent details entered successfully!");
    }

    // Method to display student details
    void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Student Name : " + name);
        System.out.println("USN          : " + usn);
        System.out.println("Branch       : " + branch);
    }

    public static void main(String[] args) {

        Studentinformation s = new Studentinformation();

        int choice;

        // Menu loop
        do {
            System.out.println("\n===== STUDENT INFORMATION MENU =====");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = s.sc.nextInt();
            s.sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    s.input();
                    break;

                case 2:
                    s.display();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        s.sc.close();
    }
}