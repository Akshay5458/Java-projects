package packagee;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		int a=23,b=45;
		System.out.println("A==B="+(a==b));
		
		// 2
		
		int a1=55,b1=70;
		System.out.println("A<50="+(a1<50));
		System.out.println("A<B="+(a1<b1));

		// 3
		
		int a2=20,b2=30,c;
		
		a2=a2+b2; //20+30=10 a2=50
		b2=a2-b2; //50-30=20 b2=20
		a2=a2-b2; //50-20=30 a2=30
		System.out.println("A="+a2+ "\n" + "B="+b2);
		
		// 4
		
		int a3=17;

		System.out.println("the second digit=" +a3%10);
		

	}

}
