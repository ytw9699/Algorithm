package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
    	
        LinkedList numbers = new LinkedList();
        
        System.out.println("����");
        
         numbers.addFirst(30);
         System.out.println(numbers);
         numbers.addFirst(20);
         numbers.addFirst(10);
         System.out.println(numbers);
         numbers.addLast(10);
         numbers.addLast(20);
         numbers.addLast(30);
         //System.out.println(numbers.node(2));//2��°���������ͺ���
         numbers.add(2,25);
         
         System.out.println(numbers);
         System.out.println(numbers.removeFirst());
         //numbers.removeFirst();
         System.out.println(numbers);
         System.out.println(numbers.remove(2));
         System.out.println(numbers);
         System.out.println(numbers.removeLast());
         System.out.println(numbers);
         System.out.println(numbers.size());
         System.out.println(numbers.get(1));
         System.out.println("�ε���");
         System.out.println(numbers.get(numbers.size()-1));
         System.out.println(numbers.indexOf(10));
         
         LinkedList.ListIterator i = numbers.listIterator();
         
         System.out.println("�ݺ���");
         System.out.println(numbers);
         i.add(5);
         System.out.println(numbers);
         i.add(4);
         System.out.println(numbers);
         System.out.println(i.next());
         System.out.println(i.next());
         System.out.println(numbers);
         i.add(15);
         System.out.println(numbers);
          
         while(i.hasNext()){//��� ��� ������ ��ȸ
     	    System.out.println(i.next());
     	 }
         
        /* for(int i=0; i<numbers.size(); i++){
        	    System.out.println(numbers.get(i));
        }
                ���� ���� ������� �ݺ��� ����ص������� linkedlist������ �̰��� �ٶ������� ���� ���.
                �ֳ��ϸ� ArrayList�� �ٸ��� LinkedList���� get�� ȿ�������� �ʱ� ����.
         get�� ȣ���� ������ ���������δ� �ݺ����� ����. �̷� ��� Iterator�� ����ϴ� ���� ����.
         Iterator�� ���������� �ݺ� ó���� ��尡 ���������� ���� ������ �����ϱ� ����*/
         
         System.out.println("�ݺ�");
         System.out.println(i.next());
         System.out.println(i.next());
         System.out.println(i.hasNext());
         System.out.println(i.next());
         System.out.println(i.next());
         System.out.println(i.hasNext());
         
         while(i.hasNext()) {//����ũ�� ����ũ�� �ƴ϶� �̹���� ȿ������������
        	 if((int)i.next()==20){//���⼭ ��带 ã�°����� �ؿԴµ� 
        	       i.remove();//���⼭ �� node�޼ҵ带 ���� ��� Ž�����ؼ� ��ȿ��
        	 }//�׷��� �ܹ��⿡�� ����� ���� ����Ʈ�� ���°�
         }
         System.out.println(numbers);
    }
 
}