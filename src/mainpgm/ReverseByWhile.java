package mainpgm;

public class ReverseByWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rev=0,rem,num=100;
while(num>0)
{
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;


}
System.out.println("reverse= "+rev);

	}

}
