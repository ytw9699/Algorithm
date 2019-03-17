package ch_05_Bit_Manipulation;

import java.util.ArrayList;

public class Question3_2 {
	
	public static int longestSequence(int n) {
		if (n == -1) return Integer.BYTES * 8;
		ArrayList<Integer> sequences = getAlternatingSequences(n);
		return findLongestSequence(sequences);
	}	
	//각 수열의 길이 리스트를 반환한다, 수열은 항상 0수열부터 시작한다.
	//각 수열의 길이를 번갈아서 배열에 저장한다.
	public static ArrayList<Integer> getAlternatingSequences(int n) {
		ArrayList<Integer> sequences = new ArrayList<Integer>();
		
		int searchingFor = 0;
		int counter = 0;
		
		for (int i = 0; i < Integer.BYTES * 8; i++) {
			if ((n & 1) != searchingFor) {
			//	System.out.println(counter);
				sequences.add(counter);
				searchingFor = n & 1; // 1을  0을 계속 바꿔주기
				counter = 0;	
			}
			counter++;
			n >>>= 1;
		}
		//System.out.println(counter);
		sequences.add(counter);
		return sequences;
	}
	//0수열과 1수열의 길이 값이 번갈아 저장된 배열이 주어졌을때 만들수 있는 가장 긴수열 찾기
	public static int findLongestSequence(ArrayList<Integer> seq) {
		int maxSeq = 1;
		
		for (int i = 0; i < seq.size(); i += 2) {
			int zerosSeq = seq.get(i);
			int onesSeqPrev = i - 1 >= 0 ? seq.get(i - 1) : 0;
			int onesSeqNext = i + 1 < seq.size() ? seq.get(i + 1) : 0;
			
			int thisSeq = 0;
			if (zerosSeq == 1) { // 합치자
				thisSeq = onesSeqNext + 1 + onesSeqPrev; 
			} else if (zerosSeq > 1) { // 0하나를 뒤집은뒤 앞뒤중 하나에 더한다
				thisSeq = 1 + Math.max(onesSeqPrev, onesSeqNext);
			} else if (zerosSeq == 0) { // 0수열이 없으므로 앞뒤중 하나를 택한다
				thisSeq = Math.max(onesSeqPrev, onesSeqNext);
			}
			maxSeq = Math.max(thisSeq, maxSeq);
		}
		
		return maxSeq;
	}	
	public static void main(String[] args) {
		int original_number = 20;
		int new_number = longestSequence(original_number);
			
		System.out.println(Integer.toBinaryString(original_number));
		System.out.println(new_number);
	}

}
