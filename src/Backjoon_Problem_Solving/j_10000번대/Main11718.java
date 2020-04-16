package j_10000번대;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main11718 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
         
        int k=100;
        while(k>0 && sc.hasNextLine()) {
        String word = sc.nextLine();
        k--;
        if (word.startsWith(" ") || !Pattern.matches("^([a-zA-Z0-9 ]+)", word)
        		|| word.endsWith(" ") || word.length()>100 || word.isEmpty()) {
                break;
            }
            words.add(word);
        }
        sc.close();
 
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
