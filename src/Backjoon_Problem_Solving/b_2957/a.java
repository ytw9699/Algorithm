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
    
    Iterator it = map.keySet().iterator(); // Iterator 로 Key들을 뽑아낸다 
    Map.Entry e = map.higherEntry(1);
    Map.Entry f = map.lowerEntry(3);
    System.out.println(e.getKey() + " : " + e.getValue());
    System.out.println(f.getKey() + " : " + f.getValue());
    
    Object obj;
    while (it.hasNext()) {  // Key를 뽑아낸 Iterator 를 돌려가며
      obj = it.next(); // Key 를 하나씩 뽑아
      System.out.println(obj + ": " + map.get(obj)); // Value 를 출력
    }
  }
}

