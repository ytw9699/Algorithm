package Arraylist;
	import java.util.ArrayList;//����Ʈ ������
	import java.util.Iterator;//����Ʈ ������
	
		public class ArrayListApi {//Java���� ArrayList�� ���� ���� ���Ǵ� ������ ��Ʈ�����Դϴ�
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();//ArrayList ��ü ����
 
        numbers.add(10);//add�� �迭�� �ܼ��� �������� ���̱� ������ ������ �����մϴ�.
        numbers.add(20);//�������� �߰�
        numbers.add(30);//�������� �߰�
        
        System.out.println("add(��)");
        System.out.println(numbers);
        
        numbers.add(0, 35);//0��°�� �߰�
        System.out.println("add(��)");
        System.out.println(numbers);
        
        numbers.add(1, 50);//1��°�� �߰�
        System.out.println("\nadd(�ε���, ��)");
        System.out.println(numbers);
        System.out.println();
 
        System.out.println(numbers.remove(2));//������ ������ 10 ����
        System.out.println("remove(�ε���)");
        System.out.println(numbers);
 
        System.out.println("\nget(�ε���)");
        System.out.println(numbers.get(2));//�ε���2��° ��������
 
        System.out.println("\nsize()");
        System.out.println(numbers.size());//������Ʈ�� ���� ��������
 
        System.out.println("\nindexOf()");
        System.out.println(numbers.indexOf(30));//30�� �ε��� ��ġ ��������
        
        System.out.println(numbers.remove(numbers.size()-1));//������ ����
        
        Iterator it = numbers.iterator();
        //�ڹٿ����� ArrayList�� Ž���ϱ� ���� ������� iterator�� ����
        //Iterator ��ü�� numbers ��ü ���ο� ����� ���� �ϳ���
        //��ȸ�ϸ鼭 Ž���� �� �ֵ��� ���� ��ü
        System.out.println("\niterator");
        while (it.hasNext()) {
        	//���� �� �̻� ��ȸ�� ������Ʈ�� ���ٸ� it.hasNext()�� ���� false�� �Ǹ鼭 while���� ����
            int value = (int) it.next();
            //it.next() �޼ҵ带 ȣ���� ������ ������Ʈ�� ������� ����
            if (value == 30) {
                it.remove();//��ȸ �������� �ʿ信 ���� ������Ʈ�� ����
            }
            System.out.println(value);
        }
        System.out.println(numbers);
 
        System.out.println("\nfor each");
        for (int value : numbers) {//���� �� ���� ������� Ž��
            System.out.println(value);
        }
        System.out.println("\nfor");//���� �� ���� ������� Ž��
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
