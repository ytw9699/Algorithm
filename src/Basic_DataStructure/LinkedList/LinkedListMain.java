package LinkedList;
public class LinkedListMain {
    public static void main(String[] args) {
    	
        LinkedList numbers = new LinkedList();
        
         numbers.addFirst(30);//�� �տ� �߰� 
         numbers.addFirst(20);
         numbers.addFirst(10);
         	System.out.println(numbers);//���
         numbers.addLast(40);//�� �ڿ� �߰�
         numbers.addLast(50);
         numbers.addLast(60);
         	System.out.println(numbers);
         
         numbers.add(2,25);//�ε��� 2��ġ�� 25�߰�
         System.out.println(numbers.node(2));//�ε��� 2��°���������ͺ���
         
         	System.out.println(numbers);
         System.out.println(numbers.removeFirst());//�Ǿ� ��� ����
         	System.out.println(numbers);
         System.out.println(numbers.remove(2));//������ ��ġ�� ��� ����
         	System.out.println(numbers);
         System.out.println(numbers.removeLast());//�ǵ� ��� ����
         	System.out.println(numbers);
         System.out.println(numbers.size());//��� �� ��ȯ
         System.out.println(numbers.get(1));//������ ��ġ�� ��ü�� ��ȯ
         System.out.println("�ε���");
         System.out.println(numbers.get(numbers.size()-1));//�ǵ��� ��ġ�� ���� ��ȯ
         System.out.println(numbers.indexOf((Object)10));//10�� ���� �ش��ϴ� ��ġ ��ȯ

         System.out.println("�ݺ���");
         LinkedList.ListIterator i = numbers.listIterator();
         
         	System.out.println(numbers);
         i.add(5);//�� �߰�
         	System.out.println(numbers);
         i.add(4);
         	System.out.println(numbers);
         System.out.println(i.next());//Ž��
         	System.out.println(numbers);
         i.add(15);
         	System.out.println(numbers);
         
         while(i.hasNext()){//��� ��� ������ ��ȸ
      	    System.out.println(i.next());
      	 }
         /* 
          	for(int i=0; i<numbers.size(); i++){
 	    		System.out.println(numbers.get(i));
 			}
	         ���� ���� ������� �ݺ��� ����ص������� linkedlist������ �̰��� �ٶ������� ���� ����̴�
	         �ֳ��ϸ� ArrayList�� �ٸ��� LinkedList���� get�� ȿ�������� �ʱ� ����
		 get�� ȣ���� ������ ���������δ� �ݺ����� ����. �̷� ��� Iterator�� ����ϴ� ���� ����
		 Iterator�� ���������� �ݺ� ó���� ��尡 ���������� ���� ������ �����ϱ� ����
		 */
         i = numbers.listIterator();
         
         while(i.hasNext()) {//����ũ�� ����ũ�� �ƴ϶� �� ����� ȿ������������
        	 if((int)i.next()==20){//���⼭ ��带 ã�°����� �ؿԴµ� 
        	       i.remove();//���⼭ �� node�޼ҵ带 ���� ��� Ž�����ؼ� ��ȿ��
        	 }//�׷��� �ܹ��⿡�� ����� ���� ����Ʈ�� ���°��̴�.
         }
         System.out.println(numbers);
    }
 
}