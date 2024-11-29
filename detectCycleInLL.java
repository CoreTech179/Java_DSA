class detectCycleInLL {

    Node head,tail;

    detectCycleInLL(){
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

    // Used to create the LL

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

    // Used to make circular LL
    public void makeCircularLL(){
        tail.next = head;
    }

    // Used to display the LL
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

    public void detectCircularLL(){

        // If there is no LL exist
        if(head==null){
            return;
        }

        Node rabbit = head;
        Node turtle = head;

        boolean check = false;

        // rabbit!=null --> means suppose we have reached a such a node where after jumping another 2 steps make the rabbit variable as null. Therefore we will stop here immediately.

        // rabbit.next!=null --> means we have to stop there if the rabbit comes to its last node since after then the rabbit can't jump anymore.  
        while(rabbit!=null && rabbit.next!=null){
            rabbit = rabbit.next.next;
            turtle = turtle.next;

            if(rabbit==turtle){
                check = true;
                System.out.println("Loop is Present at the LL:");
                break;
            }
        }
        if(check == false){
            System.out.println("Loop is not Present at the LL:");
        }
        
    }
    public static void main(String[] args) {
     
        detectCycleInLL ll = new detectCycleInLL();

        ll.create(10);
        ll.create(20);
        ll.create(30);
        ll.create(40);
        
        System.out.println("Linked List is:");

        ll.display();
        ll.makeCircularLL();
        ll.detectCircularLL();
    }
}
