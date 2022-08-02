package Assistedpraticeproject;

public class Range_of_L_and_R 
{ 
    static int A = 16;
    static int B = 100000; 
    static long table[][] = new long[B][A + 1]; 
    static void buildSparseTable(int arr[], int m) 
    { 
        for (int i = 0; i < m; i++) 
            table[i][0] = arr[i]; 
        for (int j = 1; j <= A; j++) 
            for (int i = 0; i <= m - (1 << j); i++) 
                table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1]; 
    } 
    static long query(int L, int R) 
    {
        long answer = 0; 
        for (int j = A; j >= 0; j--)  
        { 
            if (L + (1 << j) - 1 <= R)  
            { 
                answer = answer + table[L][j];
                L += 1 << j; 
            } 
        } 
        return answer; 
    }
    public static void main(String args[]) 
    { 
        int arr[] = { 3, 4, 8, 5, 9, 2 }; 
        int m = arr.length; 
        buildSparseTable(arr, m); 
        System.out.println(query(0, 5)); 
        System.out.println(query(3, 5)); 
        System.out.println(query(2, 4)); 
    } 
}
