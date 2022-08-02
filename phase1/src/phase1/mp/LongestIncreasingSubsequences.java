package phase1.mp;
import java.util.Scanner;

public class LongestIncreasingSubsequences {
	public int[] lis(int[] l) {
		int P = l.length - 1;
		int[] R = new int[P + 1];
		int[] S = new int[P + 1];
		int t = 0;

		for (int i = 1; i < P + 1; i++) {
			int j = 0;
			for (int pos = t; pos >= 1; pos--) {
				if (l[R[pos]] < l[i]) {
					j = pos;
					break;
				}
			}
			S[i] = R[j];
			if (j == t || l[i] < l[R[j + 1]]) {
				R[j + 1] = i;
				t = Math.max(t, j + 1);
			}
		}

		int[] result = new int[t];
		int pos = R[t];
		for (int i = t - 1; i >= 0; i--) {
			result[i] = l[pos];
			pos = S[pos];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Longest Increasing Subsequence\n");

		System.out.println("Enter no. of elements");
		int P = scan.nextInt();
		int[] arr = new int[P + 1];
		System.out.println("\nEnter " + P + " elements");
		for (int i = 1; i <= P; i++)
			arr[i] = scan.nextInt();

		LongestIncreasingSubsequences obj = new LongestIncreasingSubsequences();
		int[] result = obj.lis(arr);
		System.out.print("\nLongest Increasing Subsequence : ");
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
		System.out.println();
	}
}