
// Input: l1 = [1,2,4], l2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: l1 = [], l2 = []
// Output: []
// Example 3:

// Input: l1 = [], l2 = [0]
// Output: [0]

package MERGE_LINKED_LIST;

public class LinkedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return l1;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
        } else {
            ListNode temp = l2;
            l2 = l2.next;
            temp.next = l1;
            l1 = temp;
            l1.next = mergeTwoLists(l1.next, l2);
        }
        return l1;

    }
}
