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
    public static LinkedList kthToLast(LinkedList l, int k){
        int index = 0;
        Node curr = l.head;
        if(curr==null) return l;
        // LinkedList result = new LinkedList();
        while(curr.next != null && index != k)
        {
            curr = curr.next;
            index++;
        }
        l.head = curr;
        return l;
        
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
  
        System.out.println("Linked List : \n "); 
        list.printList(head); 
        LinkedList out = new LinkedList();
        out = kthToLast(list,3); 
        System.out.println(""); 
        System.out.println("Linked List from 3rd element:"); 
        out.printList(head); 
    }
}