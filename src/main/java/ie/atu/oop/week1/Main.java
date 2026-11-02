package ie.atu.oop.week1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        class gymMembers {
            Scanner input = new Scanner(System.in);
            private String memberid;
            private String name;
            private int age;
            public gymMembers(String memberid, String name, int age) {
                this.memberid = memberid;
                this.name = name;
                this.age = age;
            }
            public String getMemberid() {
                System.out.println("Enter Member ID");
                String getMemberid = input.nextLine();
                return memberid;
            }
            public String getName() {
                System.out.println("Enter Name");
                String name = input.nextLine();
                return name;
            }
            public int getAge() {
                System.out.println("Enter Age");
                int age = input.nextInt();
                return age;
            }
            public void displayDetails(){
                System.out.println(memberid);
                System.out.println(name);
                System.out.println(age);
            }
            List<String> Members = new ArrayList<>();

        int selection=0;
        while (selection != 5){
            System.out.println("1.  Add Member");
            System.out.println("2.  Display All Members");
            System.out.println("3.  search by id");
            System.out.println("4.  Remove Member");
            System.out.println("5.  Exit");
            int Selection = input.nextInt();
                int count = Members.size()  ;

            switch(Selection){
                case 1:

                    Members.add(getMemberid());
                    Members.add(getName());
                    int age = getAge();
                    Members.add(String.valueOf(age));
                    if(age<=0) {
                        System.out.println("Invalid Age");
                        Members.remove(count);
                        Members.remove(count+1);
                        Members.remove(count+2);
                    }
                    break;
                case 2:

                    if(count>1){
                        System.out.print("No data Entered");
                    }
                    else {
                        int j = 0;
                        for (int i = 0; i < count; i++) {
                            System.out.print(Members.get(i));
                            j = j + 1;
                            if (j == 2) {
                                System.out.println();
                                j = 0;
                            }

                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter Member ID to search for:");
                    String ID = input.nextLine();
                    for(int i=0;i<Members.size();i++){
                        if(Members.get(i).equals(ID)){
                            System.out.println("Member found on list");
                            System.out.println(Members.get(i));
                            System.out.println(Members.get(i+1));
                            System.out.println(Members.get(i+2));

                        }
                        else{
                            System.out.println("Member not found");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Member ID to Delete member:");
                    String ID = input.nextLine();
                    for(int i=0;i<Members.size();i++){
                        if(Members.get(i).equals(ID)){
                            System.out.println("Member found on list, Removing member");
                            Members.remove(i);
                            Members.remove(i+1);
                            Members.remove(i+2);



                        }
                        else{
                            System.out.println("Member not found/ Member with the given id does not exist");
                        }
                    }
                    break;
                    }




            }
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }

}
