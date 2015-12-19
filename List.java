public class List {

   Node head;
   
   List(){
      head = null;
   }
   
   /*
    * Add an element to the list on the last position
    * @params - node
    * @return - void
    */
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
      
   /*
    * Delete an element at the position n
    * @params - n
    * @return - void
    */
   public void delete(int n) {
   
      if(n >= 0 && n <= this.size()) {
         Node focusNode = head;
         Node parentNode = head;
         int i = 0;
         while(focusNode != null) {
            if(i == n) {
               parentNode.next = focusNode.next;
            }
            i++;
            parentNode = focusNode;
            focusNode = focusNode.next;
         }
      } else {
         System.out.println("deleted node must be between 0 and " + (this.size() - 1));
      }
   
   }
  
   /*
    * Add an element at the n position
    * @params - n
    * @params - node
    * @return - void
    */
   public void add(int n, Node node) {
      if(n < 0) {
         System.out.println("the position to insert new node must be 0 or more");
         return;
      }
      
      if(n == 0) {
         node.next = head;
         head = node;
         return;
      }
      
      if(n >= this.size()) {
         this.add(node);
         return;
      }
      
      Node focusNode = head;
      Node parentNode = head;
      int i = 0;
      while(focusNode != null) {
         if(i == n) {
            node.next = focusNode;
            parentNode.next = node;
         }
         i++;
         parentNode = focusNode;
         focusNode = focusNode.next;
      }
   
   }
   
   /*
    * return the size of the list
    * @params - nothing
    * @return - int
    */
   public int size() {
      int size = 0;
      Node focusNode = head;
      while(focusNode != null) {
         size++;
         focusNode = focusNode.next;
      }
      return size;
   }
   
   /*
    * Print all the elements of the list
    * @params - nothing
    * @return - void
    */
   public void print() {
      Node focusNode = head;
      while(focusNode != null) {
         System.out.print(focusNode.val + " -> ");
         focusNode = focusNode.next;
      }
      System.out.print("null\n");
   }

   
   public static void main(String[] args) {
   
      List list = new List();
           
      list.add(new Node(13));
      list.add(new Node(21));
      list.add(new Node(61));
      list.add(new Node(23));
      list.add(new Node(77));
      list.add(new Node(5));
      
      list.print();
      System.out.println("List size: " + list.size());
      
      list.delete(3);
      list.print();
      
      list.delete(4);
      list.print();
   
      list.add(2,new Node(999));
      list.add(12,new Node(999));
      list.add(0,new Node(999));
      list.add(0,new Node(69));
      list.add(0,new Node(123));
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