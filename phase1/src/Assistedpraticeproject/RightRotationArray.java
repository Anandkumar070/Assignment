package Assistedpraticeproject;
class RotateArray { 
public void rotate(int[] num, int r) {
    		if(r > num.length) 
       			r=r%num.length;
 		int[] result = new int[num.length];
 		for(int i=0; i < r; i++){
        			result[i] = num[num.length-r+i];
 		}
 		int j=0;
    		for(int i=r; i<num.length; i++){
        			result[i] = num[j];
j++;
    		}
 		System.arraycopy( result, 0, num, 0, num.length );
}
} 
public class RightRotationArray
{
	public static void main(String[] args) {
		RotateArray R = new RotateArray();
        		int arr[] = { 11,15,16,22,32,45 }; 
        		R.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}