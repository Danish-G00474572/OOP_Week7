package ie.atu.oop.week1;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j ;

        ArrayList<Member> Members = new ArrayList<>();
        int selection = 0;
        while (selection != 5) {
            System.out.println("1.  Add Member");
            System.out.println("2.  Display All Members");
            System.out.println("3.  search by id");
            System.out.println("4.  Remove Member");
            System.out.println("5.  Exit");

            System.out.print("Enter your selection:");
            selection = input.nextInt();
            input.nextLine();


            switch (selection) {
                case 1:
                    System.out.println("Enter Member SerID:");
                    String ID = input.nextLine();

                    System.out.println("Enter Member Name:");
                    String name = input.nextLine();

                    System.out.println("Enter Member Age:");
                    int age = input.nextInt();
                    input.nextLine();

                    if (age <= 0 || age > 120) {
                        System.out.println("Invalid age");
                    } else {
                        Member newMember = new Member(ID, name, age);
                        Members.add(newMember);

                        System.out.println("Member added ");
                    }


                    break;
                case 2:

                    if (Members.isEmpty()) {
                        System.out.print("No data Entered");
                    } else {

                        for (int i = 0; i < Members.size(); i++) {
                            Members.get(i).displayDetails();
                        }
                    }

                    break;
                case 3:
                    j = 0;
                    System.out.println("Enter Member SerID to search for:");
                    String SerID = input.nextLine();
                    for (int i = 0; i < Members.size(); i++) {
                        if (Members.get(i).getMemberid().equals(SerID)) {
                            System.out.println("Member found on list");
                            Members.get(i).displayDetails();
                            j = 1;
                            break;
                        }
                    }
                    if (j == 0) {
                        System.out.println("Member not found");
                    }
                    break;
                case 4:
                    j = 0;
                    System.out.println("Enter Member ID to Delete member:");
                    String DelID = input.nextLine();
                    for (int i = 0; i < Members.size(); i++) {
                        if (Members.get(i).getMemberid().equals(DelID)) {
                            System.out.println("Member found on list, Removing member");
                            Members.remove(i);
                            j = 1;
                            break;
                        }

                    }
                    if (j == 0) {
                        System.out.println("Member not found/ Member with the given id does not exist");
                    }
                    break;
                case 5:

                    System.out.println("Exit");
                    break;

                default:

                    System.out.println("Invalid selection");
                    break;
            }
        }
    }
}







        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



