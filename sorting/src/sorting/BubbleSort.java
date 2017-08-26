package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		bubblesort(new int[]{1,2,3,4},3);
		System.out.println("gjykjkjh");
		System.out.println("gjykjkjh");
		System.out.println("gjykjkjh");
		System.out.println("gjykjkjh");
			System.out.println("gjykjkjh");	System.out.println("gjykjkjh");	System.out.println("gjykjkjh");

	}

	
	static void bubblesort(int a[],int n)
	{
		int i,j,temp;
		for( i=0; i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
							
				}
			}
		}
		}
}
