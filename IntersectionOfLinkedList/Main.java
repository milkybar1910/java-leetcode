package IntersectionOfLinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Main {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) {
            return headA;
        }
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }
        ListNode curr = headA;
        ListNode temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = null;
            curr = temp;
        }

        ListNode curr1 = headB;
        ListNode temp1;
        while (curr1 != null) {
            if (curr1.next == null) {
                return curr1;
            }
            curr1 = curr1.next;

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("ASdfasdf");
    }
}
