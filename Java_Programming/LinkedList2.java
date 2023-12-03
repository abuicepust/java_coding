public class LinkedList2 {
    public static void main(String[] args) {
        ListNodeNew head = new ListNodeNew(1);
        head.next = new ListNodeNew(1);
        head.next.next = new ListNodeNew(2);
        head.next.next.next = new ListNodeNew(2);
        head.next.next.next.next = new ListNodeNew(3);
        new PrintListNode(head);
    }
}
class PrintListNode{
    PrintListNode(ListNodeNew head){
        ListNodeNew current = head;
        while (current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
    }
}
class ListNodeNew{
    int val;
    ListNodeNew next;

    ListNodeNew(){

    }
    ListNodeNew(int val){
        this.val = val;
    }
    ListNodeNew(int val,ListNodeNew next){
        this.val = val;
        this.next = next;
    }
}