public class Singlylinkedlists{
    
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data =data;
            this.next =null;
        }
    }
    public void display(ListNode head){
        ListNode current =head;
        while (current !=null){
            System.out.print(current.data+ "-->");
            current =current.next;
        }
        System.out.print("null");
        System.out.println("\n");
    }
    public int length(){
        if(head ==null){
            return 0;
        }
        int count =0;
        ListNode current =head;
        while(current!=null){
            count++;
            current= current.next;
        }
        return count;
    }
    public ListNode insertfirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next =head;
        head = newNode;

        return newNode;
    }
    public ListNode insertlast(int value){
        ListNode newNode =new ListNode(value);
        if(head ==null){
            head =newNode;
            return newNode;
        }
        ListNode current =head;
        while (current.next!=null){
            current =current.next;
        }
        current.next =newNode;

        return newNode;
    }
    public ListNode insert(int position, int value){
        ListNode newNode =new ListNode(value);
        if(position == 1){
            newNode.next =head;
            head =newNode;
            return newNode;
        }
        else{
            ListNode previous =head;
            int count=1;
            while (count <position-1) {
                previous =previous.next;
                count++;
            }
            ListNode current =previous.next;
            newNode.next =current;
            previous.next =newNode;

            return newNode;
        }
    }
    public ListNode removefirst(){
        ListNode current = head;
        head =head.next;
        current.next =null;

        return current;

    }
    public ListNode removelast(){
        if(head == null){
            return null;
        }
        ListNode current = head;
        ListNode previous =null;
        while (current.next !=null){
            previous =current;
            current =current.next;
        }
        previous.next =null;
        return current;
    }
    public ListNode remove(int position){
        if (head==null || position ==1){
            return null;
        }
        ListNode current = head;
        
        int count =1;
        while (count < position-1){
            current =current.next;
            count++;
        }
        ListNode previous = current.next;
        current.next =previous.next;

        return current;

    }
    public boolean search(int searchkey){
        ListNode current =head;
        
        while(current !=null){
            if(current.data == searchkey){
                return true;
            }
            current = current.next;
            
        }
        return false;
    }
    public ListNode reverse(ListNode head){
        if(head ==null){
            return head;
        }
        ListNode current =head;
        ListNode previous =null;
        ListNode next =null;
        while(current!= null){
            next = current.next;
            current.next =previous;
            previous = current;
            current =next;
        }
        return previous;

    }
    public static void main(String[] args){
        Singlylinkedlists s = new Singlylinkedlists();
        s.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
    
        s.head.next = second;
        second.next = third;
        third.next = fourth;
        //s.insertfirst(2);
        //s.insertlast(3);
        //s.insert(3, 5);
        //s.removefirst();
        //s.removelast();
        //s.remove(3);
        //boolean isFound =s.search(11);
        // if(isFound){
        //     System.out.println("Found the element");
        // }
        // else{
        //     System.out.println("not found");
        // }

        
        s.display(s.head);
        ListNode reverseList =s.reverse(s.head);
        s.display(reverseList);
    
        //System.out.println("the length is " + s.length()); 
    }
}    