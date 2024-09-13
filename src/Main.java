
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        int age;
        float height;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your height: ");
        height = input.nextFloat();

        System.out.println("\n\n"+"*".repeat(40)+"\n"+"\t\tStudent Details\n"+"*".repeat(40));

        System.out.println("Name: "+name + "\nAge: "+age+"\nHeight: "+height);
    }
}
