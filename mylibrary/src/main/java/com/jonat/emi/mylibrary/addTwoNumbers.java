package com.jonat.emi.mylibrary;

/**
 * Created by Johnobinnachuksorji on 10/13/2018.
 */

public class addTwoNumbers {
    /*
    you are given two non-empty linked lists representing
   two non-negative integers. The digits are stored in reverse order
   and each of their nodes contain a single digit. Add the two numbers
   and return it as a linked list.

   you may assume the two numbers do not contain
   any leading zero, except the numbers 0 itself.

     */

    public class ListNode{
      int val;
      ListNode next;
      ListNode(int x){
        val = x;
      }
    }


  public ListNode twoSum(ListNode l1, ListNode l2){
    ListNode dummyhead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyhead;
    while(p != null || q != null){
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int carry = 0;
      int sum = carry + x + y;
      carry = sum / 10;
      curr.next = new ListNode( sum % 10);
      if(p != null) p = p.next;
      if(q != null) q = q.next;

      if(carry > 0){
        curr.next = new ListNode(carry);
      }
    }
    return dummyhead;
  }

  public static void main(String[] args){

    System.out.println();
  }
/*
Time complexity : 0(max(m, n)assume m and n represents the length l1 and l2
respectively, the algorithm above iterates at most max(m, n) times;
 */
}
