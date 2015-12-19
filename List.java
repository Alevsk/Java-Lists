public class List {

   Node head;
   
   List(){
      head = null;
   }
   
   public void add(Node node) {
      if(head == null)
         head = node;
      else {
         Node focusNode = head;
         while(focusNode.next != null) {
            focusNode = focusNode.next;
         }  
         focusNode.next = node;
      }      
   }
   
   public void print() {
      Node focusNode = head;
      while(focusNode != null) {
         System.out.print(focusNode.val + " -> ");
         focusNode = focusNode.next;
      }
      
      System.out.print("null");
   
   }

   

   public static void main(String[] args) {
   
      List list = new List();
           
      list.add(new Node(1));
      list.add(new Node(2));
      list.add(new Node(3));
      list.add(new Node(4));
      list.add(new Node(5));
      
      list.print();
   
   }

}

class Node {

  int val;
  Node next;
  
  Node(int val) {
     this.val = val;
     next = null;
  }
}