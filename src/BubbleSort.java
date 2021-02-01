public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,7,4,16,23,11,4};
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<8;i++)
			System.out.println(arr[i]);
	}

}
