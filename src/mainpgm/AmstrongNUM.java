package mainpgm;

public class AmstrongNUM {

	public static void main(String[] args) {

int num=153;
int rem;
int arm=0;
int n=num;

while(n>0)
{
 rem=n%10;
 arm=arm+(rem*rem*rem);
 n=n/10;
}
if(num==arm)
{
 System.out.println(num + " is an amstrong number");
}
else
{
	System.out.println("not an amstrong");
}

	}

} 
