package Arraylist;
/*�ε����� �̿��ؼ� �����͸� �������� ���� ����ϴٸ� ArrayList�� �ξ� �����ϴ�.
 ������ �������� �߰�/������ ����ϴٸ� LinkedList�� �ξ� ȿ�����Դϴ�.
 ó���ϰ��� �ϴ� �����Ϳ� ���� � ������ ��Ʈ���ĸ� ���������� �� �Ǵ��ϴ� ����
  ��Ը� �ý����� �����ϴµ��� �ʼ����� �ɷ��Դϴ�.
*/
public class ArrayList {
    private int size = 0;//��� �����Ͱ� ����Ʈ�ȿ� ����ִ��� 0 �ʱ�ȭ
    private Object[] elementData = new Object[100];
    //Array List�� �迭�� �̿��ؼ� ����Ʈ�� ����
    //�ڹ��� ArrayList�� ������ �ø��� �ڵ����� �þ���� 
    //���⼭�� ���ǻ� [100] ���� �����غ���
    public boolean add(Object element) {//�迭 �������� ���� �߰�
        elementData[size] = element;
        size++;
        return true;
    }
    public boolean add(int index, Object element) {
        // �迭�� ������Ʈ �߰��� �����͸� �߰��ϱ� ���ؼ��� 
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
          //���� ������Ʈ ���� index�� ���(������Ʈ)���� �ڷ� ��ĭ�� �̵���Ų��
        }
        elementData[index] = element;//���ϴ� ��ġ�� ������
        size++;// ������Ʈ�� ���ڸ� 1 ����
        return true;
    }
    public String toString(){//toString ��ü�� ����ؼ� ����
        String str = "[";
        for(int i=0; i < size; i++){
            str += elementData[i];
            if(i < size-1){//���������� �޸� �Ⱥ��̱� ����
                str += ",";
            }
        }
        return str + "]";
    }
    public Object remove(int index) {
        // ������Ʈ�� �����ϱ� ���� ������ �����͸� removed ������ ����.
        Object removed = elementData[index];
        /*������ ������Ʈ ���� ������Ʈ���� ������ 
                  ������Ʈ���� ���������� �̵��ؼ� ���ڸ��� ä���.*/
        for(int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
        size--;//ũ�⸦ ���δ�.
        elementData[size] = null;//������ ��ġ�� ������Ʈ�� ����. 
        return removed;//������ ������ ����
    }   
    public Object get(int index) {//��� ����Ʈ�� ���� �迭�� ����� ���� ���� ������
    	return elementData[index];
    //�迭�� �޸��� �ּҿ� ���� �����ϴ� ����������(random access)���� �ſ� ������ ó��
    	}
    public int size() {//�ܺο��� ����� ���� ���ϰ� �̷��� ��ȸ������ ������
    	return size;//����Ʈ�� ��� ������Ʈ�� ��������
    }
    public int indexOf(Object o){//����� �ε����� ã�ƶ�
        for(int i=0; i < size; i++){
            if(o.equals(elementData[i]))//���� ������ ��
                return i;
        }
        return -1;//������ -1����
    }
    public ListIterator listIterator() {//���ϵ�����Ÿ���� ListIterator
    	return new ListIterator();
    }
    //ListIterator ��ü�� �ݺ��۾��� ���� �����
    public class ListIterator{//ArrayListŬ�����ȿ� ListIteratorŬ��������
    	private int nextIndex = 0;// ���� Ž���ϰ� �ִ� ������ ����Ű�� �ε��� ��
		
    	public boolean hasNext() {// next �޼ҵ带 ȣ���� �� �ִ����� üũ
    		return nextIndex < size();
    	}
    	public Object next() {//���� ������Ʈ ������ ����
    		return elementData[nextIndex++];
    	}
        public boolean hasPrevious() {
    	return nextIndex > 0;//0���� ũ�� ���� ������Ʈ�� �����Ѵٴ� �ǹ�
    	}
    	public Object previous() {//���� ������Ʈ ������ ����
    		return elementData[--nextIndex];
    	} 
    	public void add(Object element){//���� ������Ʈ�� ���� ������Ʈ�� �߰�
    	    ArrayList.this.add(nextIndex++, element);//���� �̸��� �޼ҵ忩�� �浹������ ����
    	   //ArrayListŬ������ add�޼ҵ带 ����Ű�� ���� this�� ��
    	}  //this�� ���ο��� ���� numbers �ν��Ͻ��� ����Ŵ
    	//�� add�޼ҵ带 �߰��ؼ� �۾��߳ĸ� nextIndex�� �� ListIterator�ȿ��� �����ϱ�
    	//�̷��� �ؾ� ���ͷ����͸� ���� Ž���Ҷ� �ʿ��� ��ġ�� ������Ʈ �߰� ����
    	public void remove(){//���� ������Ʈ ����
    	    ArrayList.this.remove(--nextIndex);
    	}
    }
}