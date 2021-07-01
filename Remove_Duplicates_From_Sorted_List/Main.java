// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
// Return the linked list sorted as well.

package Remove_Duplicates_From_Sorted_List;

public class Main {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;

        while (second != null) {
            if (first.val == second.val) {
                if (second.next == null) {
                    first.next = null;
                    return head;
                }
                second = second.next;
            } else {
                first.next = second;
                first = second;
                second = second.next;
            }
        }
        return head;
    }

}
