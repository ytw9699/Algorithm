package b_2957;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class a {
  public static void main(String args[]) {
	  int names[] = {1,2,3,3};
    int diameters[] = { 4,5,6,7 };
    
    TreeMap map = new TreeMap();
    for (int i = 0, n = names.length; i < n; i++) {
      map.put(names[i], diameters[i]); 
    }
    
    Iterator it = map.keySet().iterator(); // Iterator �� Key���� �̾Ƴ��� 
    Map.Entry e = map.higherEntry(1);
    Map.Entry f = map.lowerEntry(3);
    System.out.println(e.getKey() + " : " + e.getValue());
    System.out.println(f.getKey() + " : " + f.getValue());
    
    Object obj;
    while (it.hasNext()) {  // Key�� �̾Ƴ� Iterator �� ��������
      obj = it.next(); // Key �� �ϳ��� �̾�
      System.out.println(obj + ": " + map.get(obj)); // Value �� ���
    }
  }
}

