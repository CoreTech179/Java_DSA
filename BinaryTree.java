import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static class  Node {
        
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class CreateBinaryTree {
    
        static int index = -1;

        public Node buildTree(int [] nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root==null){
            System.out.print("-1"+" ");
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            System.out.print("-1"+" ");
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        // initially
        q.add(root);
        q.add(null);

        // Running a loop until queue is not empty completely
        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if(currentNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                System.out.print(currentNode.data+" ");
                if(currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
        }

    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        int totalNodes = leftNodes + rightNodes;
        return totalNodes + 1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        int sum = leftSum + rightSum;
        return sum + root.data;
    }

    public static int treeHeight(Node root){
        if(root==null){
            return 0;
        } 

        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }

        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = treeHeight(root.left) + treeHeight(root.left) + 1;

        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }

    public static void main(String[] args) {
        
        int [] nodes = new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        CreateBinaryTree tree = new CreateBinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        // inorder(root);
        // postorder(root);
        // levelOrderTraversal(root);

        // int TotalNodes = countNodes(root);
        // System.out.print("Total Nodes in my Tree are = "+TotalNodes);

        // int totalSum = sumOfNodes(root);
        // System.out.print("Sum of the Nodes are = "+totalSum);

        // int maxHeight = treeHeight(root);
        // System.out.println("Height of the tree is = "+maxHeight);

        int longestPath = diameter(root);
        System.out.println("Longest Path in our tree is = "+longestPath);
    }
}
