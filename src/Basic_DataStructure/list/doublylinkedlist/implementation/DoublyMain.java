package list.doublylinkedlist.implementation;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLinkedList numbers = new DoublyLinkedList();
         numbers.addFirst(30);
         numbers.addFirst(20);
         numbers.addFirst(10);
         System.out.println(numbers);
         System.out.println(numbers.removeLast());
         System.out.println(numbers);
         System.out.println(numbers.removeLast());
         System.out.println(numbers);
         System.out.println(numbers.removeLast());
         System.out.println(numbers);
         
         numbers.addLast(10);
         numbers.addLast(20);
         numbers.addLast(30);
         System.out.println(numbers);
         
         System.out.println(numbers.node(2));//2��°���������ͺ���
         
         numbers.add(1,15);
         numbers.add(2,25);
        
         
         System.out.println(numbers);
         System.out.println(numbers.removeFirst());
         numbers.removeFirst();
         System.out.println(numbers);
         
         System.out.println(numbers.remove(2));
         System.out.println(numbers);
         
         System.out.println(numbers.removeLast());
         System.out.println(numbers);
         
         System.out.println(numbers.size());
         
         System.out.println(numbers.get(1));
         
         System.out.println(numbers.indexOf(30));
         
         DoublyLinkedList.ListIterator i = numbers.listIterator();
         
         i.add(5);//next�� ���ϰ� �׳� 5�� �߰��ϸ� �Ǿտ� �߰���
         i.next();
         i.add(15);
         System.out.println(numbers);
          
         while(i.hasNext()){
     	    System.out.println(i.next());
     	 }
         
         System.out.println("�ݺ�");
         System.out.println(i.next());
         System.out.println(i.next());
         System.out.println(i.hasNext());
         System.out.println(i.next());
         System.out.println(i.next());
         System.out.println(i.hasNext());
         
         while(i.hasNext()) {//����ũ�� ����ũ�� �ƴ϶� �̹���� ȿ������������
        	 if((int)i.next()==20){
        	       i.remove();
        	 }
         }
         System.out.println(numbers);
    }
 
}