package UI;

import Movies.BorrowedTree;
import Movies.Movie;
import Movies.MovieCollection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class MemberMenu extends Menu {

    boolean backToMain;
    Member member;
    MovieCollection movieCol;
    Scanner scanner = new Scanner(System.in);


    public MemberMenu(Member member, MovieCollection collection) {
        this.movieCol = collection;
        this.member = member;
    }


    protected void runMemberMenu() {
        while (!backToMain) {
            printMemberMenu();
            int choice = getInput();
            choiceSelection(choice);
        }
    }

    private void printMemberMenu() {
        System.out.println("===========Member Menu============");
        System.out.println("1. Display all movies");
        System.out.println("2. Borrow a movie DVD");
        System.out.println("3. Return a movie DVD");
        System.out.println("4. List current borrowed movie DVDs");
        System.out.println("5. Display top 10 most popular movies");
        System.out.println("0. Return to main menu");
        System.out.println("================================");
        System.out.println("Please make a selection(1-,5 or 0 to return to main menu):");
    }

    public int getInput() {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        while (choice < 0 || choice > 5) {
            try {
                System.out.println("Enter your selection: ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Selection.Please make a selection(1-5, or 0 to return to main menu):");
            }
        }
        return choice;
    }

    private void choiceSelection(int choice) {
        switch (choice) {
            case 1:
                displayAllMovies();
                break;
            case 2:
                borrowDVD();
                break;
            case 3:
                returnDVD();
                break;
            case 4:
                listCurrentBorrowed();
                break;
            case 5:
                displayTop10();
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

    void displayAllMovies() {
        /**
         * Display all information about all DVDs in alphabetical order of the movie title
         * including the number of DVDs currently in the library
         *
         * Traverse tree + count nodes
         */
        this.movieCol.inOrderTraverseTree(this.movieCol.getRoot());

        System.out.println(this.movieCol.getSize());


    }

    void borrowDVD() {
        /**
         * Borrow a DVD from library given the title
         *
         */
        if (member.movies.keySet().size() == 10) {
            System.out.println("You have exceeded your borrow limit for movie DVDs. Please return a DVD to borrow a new one. ");
        } else {
            System.out.println("Please enter the title of the movie you would like to borrow: ");
            String title = (scanner.nextLine());

            Movie movie = this.movieCol.findNode(title);
            if (movie != null) {
                movie.setBorrowed(true);

                member.movies.put(title, movie);

            } else {
                System.out.println("No movie found in the system with the title: " + title);
            }
        }

    }

    void returnDVD() {
        /**
         * Remove DVD from member + set borrowed to false
         */
        System.out.println("Please enter the title of the movie you would like to return: ");
        String title = (scanner.nextLine());

        Movie movie = this.movieCol.findNode(title);
        if (movie != null) {
            movie.setBorrowed(false);
            member.movies.remove(title);
        } else {
            System.out.println("No movie found in the system with the title: " + title);
        }


    }

    void listCurrentBorrowed() {
        /**
         * Print list of movies in member where borrowed == true
         */
        System.out.println("Your currently borrowed movies are: ");

        for (String movie : member.movies.keySet()) {
            System.out.println(movie);
        }

    }

    void displayTop10() {
        /**
         * Traverse tree most to least
         *
         */
        BorrowedTree tree = new BorrowedTree();

        if (this.movieCol.getRoot() == null)
            return;


        Stack<MovieCollection.Node> s = new Stack<>();
        MovieCollection.Node current = this.movieCol.getRoot();

        // traverse the tree
        while (current != null || s.size() > 0) {

//            Reach the left most Node of the current Node
            while (current != null) {
//                place pointer to a tree node on the stack before traversing the node's left subtree
                s.push(current);
                current = current.getLeftChild();
            }

            // Current must be null in this point of the program
            current = s.pop();

            tree.addNode(current.getMovie());

            //the node and its left subtree hhave been visited, now visiting the right subtree's
            current = current.getRightChild();
        }
        // Array that ensures only top 10 are printed
        ArrayList<Movie> top = new ArrayList<>();
        tree.printInOrder(tree.getRoot(), top);
    }
}
