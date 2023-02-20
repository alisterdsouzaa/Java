package DSA;

public class Tree{
    static int index = -1;
    static class Node{
        private final int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        }

    public static Node buildTree(int [] nodes){
        index++;
        if(nodes[index]== -1){
            return null;
        }else {
            Node node = new Node(nodes[index]);

            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }

    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        else {
            System.out.print(root.data +" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            preOrderTraversal(root.left);
            System.out.print(root.data + " ");
            preOrderTraversal(root.right);
        }
    }
    static int iCnt = 0;
    public static void countNodes(Node root) {
        if (root == null) {
            return;
        } else {
            countNodes(root.left);
            iCnt++;
            countNodes(root.right);
        }
    }

    public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }
         int leftSum = sumOfNode(root.left);
         int rightSum = sumOfNode(root.right);

         return leftSum + rightSum + root.data;
    }


    public static void main(String[] args) {
        int[] arrayOfNodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,7,-1,-1,8,-1,-1};

        //Tree tree = new Tree();
        Node root = buildTree(arrayOfNodes);
        System.out.println(root.data);

        preOrderTraversal(root);
        System.out.println();

        postOrderTraversal(root);
        System.out.println();

        inOrderTraversal(root);
        System.out.println();

        countNodes(root);
        System.out.println(iCnt);

        System.out.println(sumOfNode(root));
    }
}
