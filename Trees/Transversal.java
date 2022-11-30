public class Transversal{
    public static void main(String[] args) {
        Node root = new Node(2, null, null);
        root.leftChild = new Node(1, null, null);
        root.rightChild = new Node(3, null, null);
        System.out.println("Inorder: ");
        inorder(root);
        System.out.println("Preorder: ");
        preorder(root);
        System.out.println("Postorder: ");
        postorder(root);
    }

    public static void inorder(Node current){
        //Inorder: Left --> current --> Right

        // Left
        if (current.leftChild != null){
            inorder(current.leftChild);
        }

        // Current
        System.out.println(current.data);

        //Right
        if (current.rightChild != null){
            inorder(current.rightChild);
        }
    }

    public static void preorder(Node current){
        //Inorder: current --> Left --> Right

        // Current
        System.out.println(current.data);

        // Left
        if (current.leftChild != null){
            inorder(current.leftChild);
        }

        //Right
        if (current.rightChild != null){
            inorder(current.rightChild);
        }
    }

    public static void postorder(Node current){
        //Inorder: Left --> Right --> current

        // Left
        if (current.leftChild != null){
            inorder(current.leftChild);
        }

        //Right
        if (current.rightChild != null){
            inorder(current.rightChild);
        }

        // Current
        System.out.println(current.data);

        
    }
}