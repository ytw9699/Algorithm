package ch_05_Bit_Manipulation;

import java.util.ArrayList;

public class Question3_2 {
	
	public static int longestSequence(int n) {
		if (n == -1) return Integer.BYTES * 8;
		ArrayList<Integer> sequences = getAlternatingSequences(n);
		return findLongestSequence(sequences);
	}	
	//�� ������ ���� ����Ʈ�� ��ȯ�Ѵ�, ������ �׻� 0�������� �����Ѵ�.
	//�� ������ ���̸� �����Ƽ� �迭�� �����Ѵ�.
	public static ArrayList<Integer> getAlternatingSequences(int n) {
		ArrayList<Integer> sequences = new ArrayList<Integer>();
		
		int searchingFor = 0;
		int counter = 0;
		
		for (int i = 0; i < Integer.BYTES * 8; i++) {
			if ((n & 1) != searchingFor) {
			//	System.out.println(counter);
				sequences.add(counter);
				searchingFor = n & 1; // 1��  0�� ��� �ٲ��ֱ�
				counter = 0;	
			}
			counter++;
			n >>>= 1;
		}
		//System.out.println(counter);
		sequences.add(counter);
		return sequences;
	}
	//0������ 1������ ���� ���� ������ ����� �迭�� �־������� ����� �ִ� ���� ����� ã��
	public static int findLongestSequence(ArrayList<Integer> seq) {
		int maxSeq = 1;
		
		for (int i = 0; i < seq.size(); i += 2) {
			int zerosSeq = seq.get(i);
			int onesSeqPrev = i - 1 >= 0 ? seq.get(i - 1) : 0;
			int onesSeqNext = i + 1 < seq.size() ? seq.get(i + 1) : 0;
			
			int thisSeq = 0;
			if (zerosSeq == 1) { // ��ġ��
				thisSeq = onesSeqNext + 1 + onesSeqPrev; 
			} else if (zerosSeq > 1) { // 0�ϳ��� �������� �յ��� �ϳ��� ���Ѵ�
				thisSeq = 1 + Math.max(onesSeqPrev, onesSeqNext);
			} else if (zerosSeq == 0) { // 0������ �����Ƿ� �յ��� �ϳ��� ���Ѵ�
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
