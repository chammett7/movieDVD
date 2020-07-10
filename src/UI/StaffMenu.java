package UI;

import Movies.Movie;
import Movies.MovieCollection;
import java.util.Scanner;


public class StaffMenu extends Menu {
    
    boolean backToMain;
    MemberCollection memberCol;
    MovieCollection movieCol;
    Scanner scanner = new Scanner(System.in);

    public StaffMenu(MemberCollection memberCol, MovieCollection movieCol) {
        this.movieCol = movieCol;
        this.memberCol = memberCol;
    }


    protected void runStaffMenu() {
        while(!backToMain)
        {
            printStaffMenu();
            int choice = getInput();
            choiceSelection(choice);
        }

    }
    
    private void printStaffMenu() {
        System.out.println("===========Staff Menu============");
        System.out.println("1. Add a new movie DVD");
        System.out.println("2. Remove a movie DVD");
        System.out.println("3. Register a new Member");
        System.out.println("4. Find a registered member's phone number");
        System.out.println("0. Return to main menu");
        System.out.println("================================");
        System.out.println("Please make a selection(1-4, or 0 to return to main menu):");

    }

    public int getInput() {
        int choice = -1;

        while(choice < 0 || choice > 4 ) {
            try{
                System.out.println("Enter your selection: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Selection. Please make a selection(1-4, or 0 to return to main menu):");
            }
        }
        return choice;
    }

    private void choiceSelection(int choice) {
        switch(choice)
        {
            case 1:
                addNewDVD();
                break;
            case 2:
                removeDVD();
                break;
            case 3:
                memberCol.registerNewMember();
                break;
            case 4:
                memberCol.findMemberPhone();
                break;
            case 0:
                backToMain = true;
                printMainMenu();
                break;
            default:
                System.out.println("An unknown or external error has occurred.");
                break;
        }
    }
    
    void addNewDVD() {


        System.out.println("Please enter the following details of the movie you want to add: ");
        System.out.println("Title: ");
        String title = (scanner.nextLine());
        System.out.println("Director: ");
        String director = (scanner.nextLine());
        System.out.println("Starring: ");
        String starring = (scanner.nextLine());
        System.out.println("Genre: ");
        String genre = (scanner.nextLine());
        System.out.println("Classification: ");
        String classification = (scanner.nextLine());
        System.out.println("Release Date: ");
        String releaseDate = (scanner.nextLine());
        System.out.println("Duration: ");
        String duration = (scanner.nextLine());

        this.movieCol.addNode(new Movie(title, director, starring, genre, classification, releaseDate, duration, 0));
        
    }
    
    void removeDVD() {

        System.out.println("Please enter the title of the movie you would like to remove: ");
        String title = (scanner.nextLine());

        this.movieCol.deleteNode(this.movieCol.getRoot(), title);

    }

}
