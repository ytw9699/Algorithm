package Arraylist;
	import java.util.ArrayList;
	import java.util.Iterator;//����Ʈ ������
	
	public class ArrayListApi2 {
	  public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<>();
 
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
                
        Iterator it = numbers.iterator();
        /*Iterator ��ü�� numbers ��ü ���ο� ����� ���� �ϳ���
        	��ȸ�ϸ鼭 Ž���� �� �ֵ��� ���� ��ü�̴�*/
        System.out.println("iterator");
        
        while (it.hasNext()) {
        //���� �� �̻� ��ȸ�� ������Ʈ�� ���ٸ� it.hasNext()�� ���ϰ��� false�� �Ǹ鼭 while���� ����
            int value = (int) it.next();
            //it.next()�޼ҵ带 ȣ���� ������ ������Ʈ�� ������� ����
            if (value == 30) {
                it.remove();//��ȸ �������� ���ǿ� ���� ������Ʈ�� ����
            }
            System.out.println(value);//��ȸ ���
        }
        System.out.println(numbers);
 
        System.out.println("for each");
	        for (int value : numbers) {//���� �� ���� ������� Ž��
	            System.out.println(value);
	        }
	        
        System.out.println("for");//���� �� ���� ������� Ž��
	        for (int i = 0; i < numbers.size(); i++) {
	            System.out.println(numbers.get(i));
	        }
    }
}
