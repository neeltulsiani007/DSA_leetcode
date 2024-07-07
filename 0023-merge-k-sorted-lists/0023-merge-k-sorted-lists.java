/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0)
        {
            return null;
        }
    

        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b)->a.val-b.val);

        for(int i =0;i<lists.length;i++)
        {
            if(lists[i] != null)
            q.add(lists[i]);
        }

        ListNode prev = new ListNode(-1);
        ListNode ans = prev;

        while(!q.isEmpty())
        {
            ListNode temp = q.poll();
           // System.out.println(temp.val);
            prev.next = temp;
            prev = temp;

            if(temp.next != null)
            {
                temp = temp.next;
                q.add(temp);
            }

        }

        return ans.next;




      //  return null;
        
    }
}