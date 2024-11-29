class LinkedListPalindrome {
    
    Node head,tail;

    LinkedListPalindrome(){
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

    public void checkPalindrome(int size){
        String s1 = " ";
        String s2 = " ";

        int i=0;
        int [] array = new int[size];

        Node temp = head;

        // Assign all the values of the LL into an array
        while(temp!=null){
            array[i] = temp.data;

            i++;
            temp = temp.next;
        }

        System.out.println();

        // Storing the values of every element inside the array to an String
        // Store the data in forward direction 
        for(int j=0;j<array.length;j++){
            s1 = s1 + array[j];
        }
        // Storing the data in reverse direction
        for(int j=(array.length-1);j>=0;j--){
            s2 = s2 + array[j];
        }

        // Checking both the String is equal or not
        if(s1.equals(s2)){
            System.out.println("Linked List is Palindrome");
        }
        else{
            System.out.println("Linked list is not Palindrome:");
        }

    }
    public static void main(String[] args) {
        
        LinkedListPalindrome ll = new LinkedListPalindrome();

        ll.create(1);
        ll.create(2);
        ll.create(1);

        ll.display();

        int size = ll.getLen();
        System.out.println("Size of the Linked List is = " +size);

        ll.checkPalindrome(size);
    }
}
