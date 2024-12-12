package packagee;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic operators
int a=10,b=20;
System.out.println("A+B="+(a+b));
System.out.println("A-b="+(a-b));
System.out.println("A*B="+(a*b));
System.out.println("A/B="+(a/b));
System.out.println("A%B="+(a%b));

// Assignment operators
//a=b=20

System.out.println("A=B="+(a=b));
System.out.println("A+=B="+(a+=b));
System.out.println("A-=B="+(a-=b));

//Relational operators
//a=20 b=20
System.out.println("A==B="+(a==b));
System.out.println("A<B="+(a<b));
System.out.println("A<=B="+(a<=b));
System.out.println("A>B="+(a>b));
System.out.println("A>=B="+(a>=b));
System.out.println("A!=B="+(a!=b));

//   Logical operators

//  A   B    A&&B   A||B   !A   !B
//  0   0      0     0      1    1
//  0   1      0     1      1    0
//  1   0      0     1      0    1
//  1   1      1     1      0    0

 String username="abc";
 String password="abc123";
System.out.println(!(username=="abc"));
System.out.println((username=="abc")&&(password=="abc123"));
System.out.println((username=="abc")||(password=="abc123"));
System.out.println((username=="abc")&&(password=="abc123"));

// Unary operators
int c1=10,c2=20;
// c1++ post increment
// ++c1 pre increment

System.out.println(++c1); //11
System.out.println(c1++);  //11
System.out.println(c1);    //12
System.out.println(--c1);  //11
System.out.println(c1--);  //11
System.out.println(c1);    //10

//Ternary operator 
// Syntax variable=condition?exp1:exp2
String v=c2>c1?"c2 is larger":"c1 is larger";
System.out.println(v);


	}

}

