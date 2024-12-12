package akwrk;

public class Oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int a=22;
		if (a%5==0)
		{
			if(a%11==0)
			{
				System.out.println("a is divisible by 11&5");
		}
			else
			{
				System.out.println("a is divisible by 5 only");
			}

		}
		else if (a%11==0)
		{
			System.out.println("a is dividible by 11");
		}
		else
		{
			System.out.println("a is not dividible by both 5&11");
		}

	}

}
