import java.util.Arrays;

public class Solution {

	public int solution(int[] A) {

		// write your code in Java SE 8
		int contador = 1;
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {

			if (A[i] == contador) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {

		int[] array = {5, 3, 4, 1, 2};
        int[] array2= {1,2,3};
        int [] array3= {-1,-3};

		Solution a = new Solution();
		int num = a.solution(array);
        int num2= a.solution(array2);
        int num3= a.solution(array3);

		System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);

	}

}
