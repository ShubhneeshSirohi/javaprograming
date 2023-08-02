class AddNum  {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
      int carry = 0;
      int y = 0;
      int x = 0; 

      ListNode temp = new ListNode();
      ListNode ans = temp;

     while(l1 != null || l2 != null || carry != 0)
     {
          if(l1 != null)
          {
             x = l1.val;
             l1 = l1.next;
          }
          if(l2 != null)
          {
             y = l2.val;
             l2 = l2.next;
          }
           ans.next = new ListNode((x+y+carry) % 10);
           ans = ans.next;
           carry = (x+y+carry)/10;
           x = y = 0;
     }

 return temp.next;

        
    }

}