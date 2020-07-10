package UI;



import java.util.*;

public class MemberCollection {
    //put the members into an arrayList
    ArrayList<Member> memberCollection = new ArrayList<>();
    //use Scanner for user input into the console
    Scanner scanner = new Scanner(System.in);

    public MemberCollection() {
        memberCollection.add(new Member("l", "l", "123"));
    }

    protected void registerNewMember() {

        System.out.println("Please enter the details for the new user below.");
        System.out.println("First Name: ");
        String firstName = (scanner.nextLine());

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();


        String username = lastName + firstName;


        Member member = new Member(lastName, firstName, password);

        System.out.println("Address: ");
        String address = scanner.nextLine();
        member.setAddress(address);
        System.out.println("Phone: ");
        String phone = scanner.nextLine();
        member.setPhone(phone);

        //adding the new member into the array
        memberCollection.add(member);

        }

    public void findMemberPhone() {

        System.out.println("Please the first and last name of the user you are searching for below. ");
        System.out.println("First Name: ");
        String firstName = (scanner.nextLine());

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();

        String username = lastName + firstName;

        for (Member member : memberCollection) {
            //find member by username and print phone
            if (username.equals(member.username)) {
                System.out.println("The members phone number is: "+ member.getPhone());

            }
        }

        System.out.println("User was not found in the system.");

    }

}
