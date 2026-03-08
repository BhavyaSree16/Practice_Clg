import java.util.*;

public class hw_hcl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Details");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        sc.nextLine();   

        System.out.print("Enter Student Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Student RollNo: ");
        int rollNo = sc.nextInt();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("Roll No: " + rollNo);
    }
}