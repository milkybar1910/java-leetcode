// You are given two non-empty linked lists representing two non-negative integers. 
// The digits are stored in reverse order, and each of their nodes contains a single digit. 
// Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.

package Add_Two_Numbers;

public class Main {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode currResult = resultHead;
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        while (head1 != null || head2 != null) {
            int val1 = (head1 != null) ? head1.val : 0;
            int val2 = (head2 != null) ? head2.val : 0;
            int sum = carry + val1 + val2;
            carry = sum / 10;
            currResult.next = new ListNode(sum % 10);
            currResult = currResult.next;
            if (head1 != null) {
                head1 = head1.next;
            }
            if (head2 != null) {
                head2 = head2.next;
            }

            if (carry > 0) {
                currResult.next = new ListNode(carry);

            }

        }
        return resultHead.next;
    }

    public static void main(String[] args) {

    }
}
