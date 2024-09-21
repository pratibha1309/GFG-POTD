
class Solution {
    Node copyList(Node head) {
        if (head == null) return null;

       s
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.data);
            copy.next = current.next; e
            current.next = copy; 
            current = copy.next; 
        }

       
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next; pointer
            }
            current = current.next.next; 
        }

        
        Node original = head;
        Node copyHead = head.next; 
        Node copyCurrent = copyHead;

        while (original != null) {
            original.next = original.next.next; 
            if (copyCurrent.next != null) {
                copyCurrent.next = copyCurrent.next.next; 
            }
            original = original.next;
            copyCurrent = copyCurrent.next;
        }

        return copyHead; 
    }
}