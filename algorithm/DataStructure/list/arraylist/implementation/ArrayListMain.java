package list.arraylist.implementation;
  public class ArrayListMain {
  public static void main(String[] args) {
	ArrayList numbers = new ArrayList();
	
    numbers.add(10);//������ �߰�
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(1, 15);//ù��°�� �߰�
    numbers.add(0,5);//�Ǿ� �߰�
   
    System.out.println(numbers);
    //���⼭ ��ü�� �ҷ����� �̾ȿ� tostring�޼ҵ带 ���������� ����������
    
    System.out.println(numbers.remove(1));//�ε��� 1��° ����
    System.out.println(numbers.remove(0));//ó������
    System.out.println(numbers.remove(numbers.size()-1));//������ ����
    System.out.println(numbers);
    System.out.println(numbers.get(0));//0��° �� ��������
    System.out.println(numbers.size());//����Ʈ�� ������Ʈ �� ��ȯ
    System.out.println(numbers.indexOf(20));//20���� �ִ� �ε��� ��ȯ
    System.out.println();
    //�ݺ� 2���� ���
    for(int i=0; i<numbers.size(); i++) {//1° ���
     System.out.println(numbers.get(i));
    }

    ArrayList.ListIterator li = numbers.listIterator();//2��°���
    //ArrayList.ListIterator�� ArrayListŬ�����ȿ� istIterator��� Ŭ������ ����Ŵ
    //�� Ŭ������ ������ Ÿ������ �ϴ� li��ü ����
    System.out.println("���İ� ������ ���");
    while(li.hasNext()){//���İ� ������ ���
    int value = (int) li.next();
   	 System.out.println(value);
    }
    
    System.out.println("������ ������ ���");
    
    while(li.hasPrevious()) {//������ ������ ���
	   System.out.println(li.previous());
    }
       
    System.out.println(numbers);
       
    while(li.hasNext()) {
	   int number = (int)li.next();//�߰��� ���� �߰��غ���
	   if(number == 20) {//20���� 35
		   li.add(35);
	   }
     }
    System.out.println(numbers);
       
    li = numbers.listIterator();//��ü������ nextIndex = 0; ���� �ٽ� �ʱ�ȭ
    
    while(li.hasNext()) {//�׸��� �ٽ� ���� �ݺ�
	   int number = (int)li.next();
			   if(number == 30) {//���ͷ����͸� ���� Ž���Ҷ� �ʿ��� ��ġ�� ������Ʈ ����
				   li.remove();
			   }
	         }
    System.out.println(numbers);
    }
	}
