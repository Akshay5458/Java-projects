package akwrk;

public class Odd {

	public static void main(String[] args) {


		int[] arr=new int[6];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		
		
		for (int i=arr[0];i<=arr[5];i++)
		{
	
			if(i%2==1)
			{
				System.out.println("positive numbers in the aray="+i);
			
			}
			else
			{
				System.out.println("negative no in array"+i);
			}
		}
	}
}
