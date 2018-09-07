package 剑指offer;

/**
 * Created by: Administrator 2018-09-06 11:56
 * 功能：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 */
import java.util.*;
public class Third {



    public class ListNode {
       int val;
      ListNode next = null;
       ListNode(int val) {
            this.val = val;
       }
   }

    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            Stack stack = new Stack();
            ArrayList<Integer> list = new ArrayList<>();
            while(listNode != null){
                stack.push(listNode.val);
                listNode = listNode.next;
            }
            while(stack != null){
                list.add(Integer.valueOf(stack.pop().toString()));
            }


            return list;
        }
    }

}



