package DoublyLinkedList;

public class DoublyMain {
    public static void main(String[] args) {
    	
        DoublyLinkedList numbers = new DoublyLinkedList();
         numbers.addFirst(30);//�� �տ� �߰� 
         numbers.addFirst(20);
         numbers.addFirst(10);
         	System.out.println(numbers);
                  
         System.out.println(numbers.removeLast());//�ǵ� ��� ����
         	System.out.println(numbers);
           
         numbers.addLast(30);//�� �ڿ� �߰�
         numbers.addLast(40);
         numbers.addLast(50);
         	System.out.println(numbers);
         
         System.out.println(numbers.node(2));//�ε��� 2��°���������ͺ���
         
         numbers.add(2,25);//�ε��� 2��ġ�� 25�߰�
         	System.out.println(numbers);
         	
         System.out.println(numbers.removeFirst());//�Ǿ� ��� ����
         System.out.println(numbers);
         
         System.out.println(numbers.remove(2));//������ ��ġ�� ��� ����
         System.out.println(numbers);
                 
         System.out.println(numbers.size());//��� �� ��ȯ
         
         System.out.println(numbers.get(1));//������ ��ġ�� ��ü�� ��ȯ
         
         System.out.println(numbers.indexOf(40));//10�� ���� �ش��ϴ� ��ġ ��ȯ
         
         DoublyLinkedList.ListIterator i = numbers.listIterator();
         
         System.out.println(numbers);
         i.add(5);//next�� ���ϰ� �׳� 5�� �߰��ϸ� �Ǿտ� �߰���
         i.next();
         i.add(15);
         System.out.println(numbers);
          
         while(i.hasNext()){
     	    System.out.println(i.next());
     	 }
         
         i = numbers.listIterator();
         
         while(i.hasNext()) {
        	 if((int)i.next()==20){
        	       i.remove();
        	 }
         }
         System.out.println(numbers);
    }
 
}