class linkedList{

    Node head,tail;

    linkedList(){
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

    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = tail = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
        displayLL();
    }

    public void addLast(int data){
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

    public void displayLL(){
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

    public void deleteFirst(){
        if(head==null){
            System.out.println("Nothing to delete:");
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            temp = null;
            displayLL();
        }
    }


    public void deleteLast(){
        if(head==null){
            System.out.println("Linked List is not Created:");
        }
        else{
            Node i = head;
            Node j = i.next;
            
            while(j.next!=null){
                i = i.next;
                j = j.next;
            }
            i.next = null;
            i=null;
            j=null;

            displayLL();
        }
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

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);

        System.out.println("Linked List is:");

        ll.displayLL();

        System.out.println("After adding a data to its 1st Position:");

        ll.addFirst(10);

        System.out.println("After Deleting the 1st Node");

        ll.deleteFirst();

        System.out.println("After Deleting the Last Node:");

        ll.deleteLast();


        int size = ll.getLen();
        System.out.println("Length of the List is = " +size);
    }

}