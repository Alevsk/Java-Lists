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
      list.delete(4);
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