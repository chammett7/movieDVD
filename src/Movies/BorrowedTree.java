package Movies;

import java.util.ArrayList;


public class BorrowedTree {

    public Node getRoot() {
        return root;
    }

    Node root;

    public void addNode(Movie movie) {

        //creating and initialising new node
        Node newNode = new Node(movie);

        //checking if this is the root element for tree
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;

            Node parent;

            while (true) {

                parent = focusNode;
                //checking if new node should go on left or right side of parent
                if (newNode.key < focusNode.key) {

                    focusNode = focusNode.leftChild;

                    //if leftChild has no children place new node on the left
                    if (focusNode == null) {

                        parent.leftChild = newNode;
                        break;
                    }
                }
                //need to put node on right
                else {
                    focusNode = focusNode.rightChild;

                    //if right node has no children
                    if (focusNode == null) {

                        parent.rightChild = newNode;
                        break;
                    }
                }
            }
        }
    }

    //printing top 10 most borrowed
    // used ArrayList to ensure that only 10 are printed
    public void printInOrder(Node root, ArrayList<Movie> inorder) {
        if(root == null || inorder.size() == 10) {
            return;
        }
        printInOrder(root.getRightChild(), inorder);

        inorder.add(root.movie);
        System.out.println("Title: " + root.movie.getTitle() + " Count: " + root.movie.getBorrowedCount());

        printInOrder(root.getLeftChild(), inorder);
    }


    class Node {

        int key;
        Movie movie;

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public Movie getMovie() {
            return movie;
        }

        public void setMovie(Movie movie) {
            this.movie = movie;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        Node leftChild;
        Node rightChild;

        //constructor
        Node(  Movie movie) {

            this.movie = movie;
            this.key = movie.getBorrowedCount();
        }

    }





}