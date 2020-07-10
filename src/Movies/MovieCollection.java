package Movies;

public class MovieCollection {

    //getting the root element of the tree
    public Node getRoot() {
        return root;
    }

    Node root;
    int size = 0;

    //getting the size
    public int getSize() {
        return size;
    }

    public void addNode(Movie movie) {
        this.size++;
        //creating and initialising new node
        Node newNode = new Node(movie);

        //checking if this is the root element for tree
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node focusNode = this.root;

            Node parent;

            while (true) {

                parent = focusNode;
                int compare = newNode.key.compareTo(focusNode.key);
                //checking if new node should go on left or right side of parent
                if (compare < 0) {

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


    //finding nodes, node will be returned after it is found or not found
    //passing String key which is going to define what node is being searched for
    public Movie findNode(String key) {

        Node focusNode = root;
        //while node not found
        while (!focusNode.key.equals(key)) {

            int compare = key.compareTo(focusNode.key);
            //search down left children
            if (compare < 0) {
                focusNode = focusNode.leftChild;
            }
            //searching down right side
            else {
                focusNode = focusNode.rightChild;
            }
            //node was not found
            if (focusNode == null) {
                return null;
            }

        }

        return focusNode.movie;

    }

//getters and setters for the tree
    public class Node {

        String key;
        Movie movie;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Movie getMovie() {
            return movie;
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
        Node(Movie movie) {
            this.movie = movie;
            this.key = movie.getTitle();
        }

    }

//minValue for deleting node
    public String minValue(Node node) {
        if (node.getLeftChild() != null) {
            return minValue(node.getLeftChild());
        }
        return node.getKey();
    }

    public Node deleteNode(Node root, String key) {
        if (root == null) return root;

        int compare = key.compareTo(root.key);
        //checking if new node should go on left or right side of parent
        if (compare < 0) {
            root.setLeftChild(deleteNode(root.getLeftChild(), key));
        } else if (compare > 0) {
            root.setRightChild(deleteNode(root.getRightChild(), key));
        } else {
            //node with no leaf nodes
            if (root.getLeftChild() == null && root.getRightChild() == null) {
                System.out.println("Deleting movie: " + key);
                return null;
            } else if (root.getLeftChild() == null) {
                // node with one node (no left node)
                System.out.println("Deleting movie: " + key);
                return root.getRightChild();
            } else if (root.getRightChild() == null) {
                // node with one node (no right node)
                System.out.println("Deleting movie: " + key);
                return root.getLeftChild();
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                String minValue = minValue(root.getRightChild());
                root.setKey(minValue);
                root.setRightChild(deleteNode(root.getRightChild(), minValue));
                System.out.println("Deleting movie: " + key);
            }

        }

        return root;
    }
// in this algorithm, the left subtree is searched through first, followed by root, and finally nodes on the right subtree are looked throug
    public void inOrderTraverseTree(Node focusNode) {

        if(focusNode != null) {

            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode.key);

            inOrderTraverseTree(focusNode.rightChild);

        }
    }

}
