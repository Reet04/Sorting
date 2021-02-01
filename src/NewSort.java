
public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,7,3,5,16,2,11,23,13,21};
		 int n = arr.length;
		    for (int i = 0; i < n-1; i++)
	        {
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
		    
		    for(int i=0;i<n;i++)
		    	System.out.println(arr[i]);

	}

}
