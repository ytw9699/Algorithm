package CircularLinkedList;
public class CircularLinkedListMain {
	static CircularLinkedList numbers = new CircularLinkedList();
	// ���� ���� ����Ʈ�� ����
	static Object first;//������ ��ȸ�� ���� ���� ����1
	static Object next;//������ ��ȸ�� ���� ���� ����2
	 
    public static void main(String[] args) {
    	
         numbers.addFirst(20);//�� �տ� �߰� 
         numbers.addFirst(10);
         	System.out.println(numbers);//���
         numbers.addLast(30);//�� �ڿ� �߰�
         numbers.addLast(40);
         	System.out.println(numbers);
          	
         	getAllNode();//��ü ������ ��ȸ
         	
         	remove(20);//����Ʈ���� 20 ���� 
         	
         	getAllNode();
         	
         System.out.println(numbers);
    }
    
    public static void getAllNode() {//��ü ������ ��ȸ
		 first = numbers.getFirst();
      	
      	if((int)first != 1) {
      		System.out.println(first);//�� �� ���
      		
      		for(int i=0; i<numbers.size()-1; i++)
     		{
      			next = numbers.getNext();//�� �� �ڷ� �� ���
      			
      			if((int)next != 1) {
      				System.out.println(next);
      			}
     		}
      	}
	 }
    
    public static void remove(int target) {//Ÿ�ٿ� �ش��ϴ� ��� ����
    	first = numbers.getFirst();
      	
      	if((int)first != 1) {
      			if((int)first == target) {//�� ���� �����Ͱ� Ÿ���̶��
					numbers.remove();
					return;//�����Ǹ� ����������
				}
      		for(int i=0; i<numbers.size()-1; i++)//��ü Ž��
     		{
      			next = numbers.getNext();
      			
      			if((int)next != 1) {
      				if((int)next == target) {//���� ���߿� Ÿ�ٰ� ���� ��ġ�ϸ�
      					numbers.remove();//���� �޼ҵ� ����
      					return;//�����Ǹ� ����������
      				}
      			}
     		}
      	}
    }
}