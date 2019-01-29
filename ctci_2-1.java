public class LinkedList{
    static Node head;
    static class Node
    {
        Node next;
        int data;
        public Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static void removeDupl(LinkedList l){
        
        Node ptr1 = l.head;
        while(ptr1 != null && ptr1.next!=null)
        {
            Node ptr2 = ptr1;
            
            while(ptr2.next!=null)
            {
                if(ptr1.data == ptr2.next.data)
                {
                    ptr2.next = ptr2.next.next;
                }
                else
                    ptr2 = ptr2.next;
            }
            ptr1 = ptr1.next;
            
        }
        
    }
    public static void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
     
        
        
    
    
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList(); 
        list.head = new Node(10); 
        list.head.next = new Node(12); 
        list.head.next.next = new Node(11); 
        list.head.next.next.next = new Node(11); 
        list.head.next.next.next.next = new Node(12); 
        list.head.next.next.next.next.next = new Node(11); 
        list.head.next.next.next.next.next.next = new Node(10); 
  
        System.out.println("Linked List before removing duplicates : \n "); 
        list.printList(head); 
  
        removeDupl(list); 
        System.out.println(""); 
        System.out.println("Linked List after removing duplicates : \n "); 
        list.printList(head); 
    }
}