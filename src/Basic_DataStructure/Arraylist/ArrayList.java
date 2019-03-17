package Arraylist;
/*인덱스를 이용해서 데이터를 가져오는 것이 빈번하다면 ArrayList가 훨씬 빠릅니다.
 하지만 데이터의 추가/삭제가 빈번하다면 LinkedList가 훨씬 효과적입니다.
 처리하고자 하는 데이터에 따라서 어떤 데이터 스트럭쳐를 선택할지를 잘 판단하는 것은
  대규모 시스템을 구축하는데는 필수적인 능력입니다.
*/
public class ArrayList {
    private int size = 0;//몇개의 데이터가 리스트안에 들어있는지 0 초기화
    private Object[] elementData = new Object[100];
    //Array List는 배열을 이용해서 리스트를 구현
    //자바의 ArrayList는 갯수를 늘리면 자동으로 늘어나지만 
    //여기서는 편의상 [100] 으로 구현해보자
    public boolean add(Object element) {//배열 마지막에 값을 추가
        elementData[size] = element;
        size++;
        return true;
    }
    public boolean add(int index, Object element) {
        // 배열의 엘리먼트 중간에 데이터를 추가하기 위해서는 
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
          //끝의 엘리먼트 부터 index의 노드(엘리먼트)까지 뒤로 한칸씩 이동시킨후
        }
        elementData[index] = element;//원하는 위치에 덮어씌우기
        size++;// 엘리먼트의 숫자를 1 증가
        return true;
    }
    public String toString(){//toString 객체를 상속해서 구현
        String str = "[";
        for(int i=0; i < size; i++){
            str += elementData[i];
            if(i < size-1){//마지막에는 콤마 안붙이기 위해
                str += ",";
            }
        }
        return str + "]";
    }
    public Object remove(int index) {
        // 엘리먼트를 삭제하기 전에 삭제할 데이터를 removed 변수에 저장.
        Object removed = elementData[index];
        /*삭제된 엘리먼트 다음 엘리먼트부터 마지막 
                  엘리먼트까지 순차적으로 이동해서 빈자리를 채운다.*/
        for(int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
        size--;//크기를 줄인다.
        elementData[size] = null;//마지막 위치의 엘리먼트를 삭제. 
        return removed;//삭제된 데이터 리턴
    }   
    public Object get(int index) {//어레이 리스트의 장점 배열을 사용해 값을 쉽게 가져옴
    	return elementData[index];
    //배열은 메모리의 주소에 직접 접근하는 랜덤엑세스(random access)여서 매우 빠르게 처리
    	}
    public int size() {//외부에서 사이즈를 조정 못하게 이렇게 우회적으로 리턴함
    	return size;//리스트가 몇개의 엘리먼트를 가졌는지
    }
    public int indexOf(Object o){//어떤값의 인덱스를 찾아라
        for(int i=0; i < size; i++){
            if(o.equals(elementData[i]))//값이 같은지 비교
                return i;
        }
        return -1;//없으면 -1리턴
    }
    public ListIterator listIterator() {//리턴데이터타입이 ListIterator
    	return new ListIterator();
    }
    //ListIterator 객체는 반복작업을 위해 만든것
    public class ListIterator{//ArrayList클래스안에 ListIterator클래스만듬
    	private int nextIndex = 0;// 현재 탐색하고 있는 순서를 가리키는 인덱스 값
		
    	public boolean hasNext() {// next 메소드를 호출할 수 있는지를 체크
    		return nextIndex < size();
    	}
    	public Object next() {//다음 엘리먼트 순차적 리턴
    		return elementData[nextIndex++];
    	}
        public boolean hasPrevious() {
    	return nextIndex > 0;//0보다 크면 이전 엘리먼트가 존재한다는 의미
    	}
    	public Object previous() {//이전 엘리먼트 순차적 리턴
    		return elementData[--nextIndex];
    	} 
    	public void add(Object element){//현재 엘리먼트의 다음 엘리먼트에 추가
    	    ArrayList.this.add(nextIndex++, element);//같은 이름의 메소드여서 충돌방지를 위해
    	   //ArrayList클래스의 add메소드를 가리키기 위해 this를 씀
    	}  //this는 메인에서 만든 numbers 인스턴스를 가리킴
    	//왜 add메소드를 추가해서 작업했냐면 nextIndex는 이 ListIterator안에만 있으니까
    	//이렇게 해야 이터레이터를 통해 탐색할때 필요한 위치에 엘리먼트 추가 가능
    	public void remove(){//현재 엘리먼트 삭제
    	    ArrayList.this.remove(--nextIndex);
    	}
    }
}