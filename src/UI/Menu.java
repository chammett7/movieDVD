package UI;

import Movies.MovieCollection;

import java.util.Scanner;

public class Menu {

    boolean exit;
    MovieCollection movieCol = new MovieCollection();
    MemberCollection memberCol = new MemberCollection();
    Member member = new Member("staff", "", "today123");
    Scanner scanner = new Scanner(System.in);

    public void runMenu() {
        while (!exit) {
            printMainMenu();
            int choice = getInput();
            choiceSelection(choice);
        }
    }

    public void printMainMenu() {
        System.out.println("Welcome to the Community Library");
        System.out.println("===========Main Menu============");
        System.out.println("1. Staff Login");
        System.out.println("2. Member Login");
        System.out.println("0. Exit");
        System.out.println("================================");
        System.out.println();
        System.out.println("Please make a selection(1-2, or 0 to exit):");
    }

    public int getInput() {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

    //ensuring all input is handled
        while(choice < 0 || choice > 2 ) {
            try {
                System.out.println("Enter your selection: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Selection. Please make a selection(1-2, or 0 to exit): ");
            }
        }
        return choice;
    }

    private void choiceSelection(int choice) {
        //switch allocates what happens once users puts choice into console
        switch(choice)
        {
            case 1:
                staffLogin();
                break;
            case 2:
                memberLogin();
                break;
            case 0:
                exit = true;
                System.out.println("Thank you for choosing our library. Bye-Bye!");
                break;
            default:
                System.out.println("An unknown or external error has occurred.");
                break;
        }
    }

    private void memberLogin() {

        System.out.println("===========Member Login============");

        System.out.println("Enter Username: ");
        String username = scanner.nextLine();

        // get the member from the memberCollection array if details are correct and run the member menu
        for (Member member : this.memberCol.memberCollection) {
            if (username.equals(member.username)) {

                System.out.println("Enter Password: ");
                String password = scanner.nextLine();
                if (password.equals(member.password)) {
                    MemberMenu memberMenu = new MemberMenu(member, this.movieCol);
                    memberMenu.runMemberMenu();
                } else {
                    System.out.println("*********************************");
                    System.out.println("Invalid username or password for member login.");
                    System.out.println("*********************************");
                    System.out.println();
                }
            }
        }
    }


    private void staffLogin() {

        String Username = member.getUsername();
        String Password = member.getPassword();

        System.out.println("===========Staff Login============");

        System.out.println("Enter Username: ");
        String username = scanner.nextLine();

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        if(username.equals(Username) && password.equals(Password)) {
            StaffMenu staffMenu = new StaffMenu(this.memberCol, this.movieCol);
            staffMenu.runStaffMenu();
        }
        else {
            System.out.println("*********************************");
            System.out.println("Invalid username or password for staff login.");
            System.out.println("*********************************");
            System.out.println();
        }
    }
}


