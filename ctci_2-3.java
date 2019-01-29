public class LinkedList{
    static Node head;
    int size = 0;
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
    public int size()
    {
        Node curr = this.head;
        while(curr!=null)
        {
            size++;
            curr = curr.next;
        }
        return size;
    }
    public static LinkedList delMiddle(LinkedList l){
        int index = 0;
        Node curr = l.head;
        Node prev = null;
        if(curr==null) return l;
        int mid = l.size()/2;
        // LinkedList result = new LinkedList();
       
        while(curr.next != null)
        {
            if(index==mid)
            {
                prev.next = curr.next;
                
                break;
            }
            else
            {
                prev = curr;
                curr = curr.next;
                index++;
                 
            }
        }
       
        
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
        // System.out.println(list.size());
        System.out.println("Linked List : \n "); 
        list.printList(head); 
        LinkedList out = new LinkedList();
        out = delMiddle(list); 
        System.out.println(""); 
        System.out.println("Linked List after deleting mid element:"); 
        out.printList(head); 
    }
}