package Arraylist;
import java.util.ArrayList;//����Ʈ ������

public class ArrayListApi1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();//ArrayList ��ü ����

    numbers.add(10);//add�� �迭�� �ܼ��� �������� ���̱� ������ ������ �����Ѵ�.
    numbers.add(20);//�������� �߰�
    numbers.add(30);
    
    System.out.println("add(��)");
    System.out.println(numbers);
    
    numbers.add(0, 35);//0��°�� �߰�
    System.out.println("add(��)");
    System.out.println(numbers);
    
    numbers.add(1, 50);//1��°�� �߰�
    System.out.println("add(�ε���, ��)");
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
    
    System.out.println("remove(numbers.size()-1))");
    System.out.println(numbers.remove(numbers.size()-1));//������ ����
    
}
}
