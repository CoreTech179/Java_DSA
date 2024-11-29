class deleteNthNodeFromLast {
    
    Node head,tail;

    deleteNthNodeFromLast(){
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

    public void findNthLast(int n){

        // If there is no LL exist or there is only a single node in the LL then there is no point
        if(head==null||head.next==null){
            return;
        }
        // Initialize the pointers

        Node prevNode = head;
        Node currNode = prevNode.next;
        Node nextNode = currNode.next;

        // Here our size of the LL is 4 therefore the 2nd node of our LL from the last is 30 therefore delete that Node  
        for(int i=1;i<n;i++){
            // update every pointer 
            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }
        prevNode.next = nextNode;
        currNode.next = null;
        currNode = null;
        nextNode = null;
    }


    public static void main(String[] args) {
        
        deleteNthNodeFromLast ll = new deleteNthNodeFromLast();

        ll.create(10);
        ll.create(20);
        ll.create(30);
        ll.create(40);

        System.out.println("Linked List is:");
        ll.display();

        int size = ll.getLen();
        System.out.println("Length Of the LL is = " +size);

        System.out.println("Finding nth node from the last and delete the nth node:");

        // 10-->20-->30-->40-->50
        // If n = 2 then 2nd node from the last is 40 therefore delete that node and print the Linked List 

        ll.findNthLast(2);
        ll.display();

    }
}
