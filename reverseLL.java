class reverseLL {

    Node head,tail;

    reverseLL(){
        head = null;
        tail = null;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void create(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = tail = newnode;
        }
        else{
            while(tail.next!=null){
                tail = tail.next;
            }
            tail.next = newnode;
            tail = tail.next;
        }

    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);

            if(temp.next!=null){
                System.out.print("-->");
            }
            temp = temp.next;
        }
        System.out.println();
    }


    public int getLen(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void reverse(){

        // Check whether a linked List is present or not || It is a single node or not
        if(head==null||head.next==null){
            return;
        }

        Node prevNode = head;
        Node  currNode = prevNode.next;
        
        while(currNode!=null){
            Node nextNode = currNode.next;

            currNode.next = prevNode;


            // Update evey Single Node except nextNode because nextNode is initializing every time
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        
        reverseLL ll = new reverseLL();

        ll.create(20);
        ll.create(30);
        ll.create(40);
        ll.create(50);

        System.out.println("Linked List Created is:");
        
        ll.display();

        int size = ll.getLen();
        System.out.println("Size of the Linked List is = " +size);

        System.out.println("After Reversing the LL:");
        ll.reverse();
        ll.display();
    }    
}
