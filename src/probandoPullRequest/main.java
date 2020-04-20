package probandoPullRequest;


public class main {

	public static void main(String[] args) 
	{
		int x = 11;
		int y = 11;
		int z = 11;
		int j = 0;
		
		char a = '4';
		char b = '4';
		char c = '4';
		
		double r = 12.987;
		double s = 12.987;
		double t = 12.987;
		
		boolean A = true;
		boolean B = false;
		boolean D = true;
//		
//		if(!A>B) z = 50;
		if (B=A) j = 5000;
		
		if (x==y) z = -13;
		if (x>z) a = 'A';
		if (!(x>z)) a = 'A';
		if (b<=c) r = 0.0;
		if (r!=s) t = c/2;
		
//		if (x!=(r!=z)) z = 1000;
//		if(x=y) z = 222;
		if (x!=0) z = 333;
//		if (x) z = 444;
		
		x = y = z = 77;
		if((x==y)&&(x==77)) z = 33;
		if((x>y)||(z>22)) z= 22;
//		if(x && y  &&z) z = 11;
//		if((x=1) && (y=2) && (z=3)) r = 12.00;
//		if((x==2)&&(y=3)&&(z=4)) r = 14.56;
		
		
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("r = " + r);
		System.out.println("s = " + s);
		System.out.println("t = " + t);
		System.out.println("j = " + j);
		
		x = 9;
		y = 8;
		if(x==7 && y<=++x) y = 35;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		otro();
	}
	
	public static void otro()
	{
		int a = 7;
		int b = 8;
		int c = 98;
		
		if(a==7||b<=(++a)) b = 9;
		
		if(a==8||b<=(++a)) b = 10;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
	}

}
