public class Fibonacci
{

	public  static void metodoFibonacci(int valoreMax)    
	{ 
		System.out.println("******************");
        int[] fibonacci= new int[valoreMax];
		fibonacci[0]=0;
		System.out.println(fibonacci[0]);
		if (valoreMax>1) 
		{
		  	fibonacci[1]=1;                                              
		    System.out.println(fibonacci[1]); 
		}                          
		for (int i=2;i<fibonacci.length;i++ )                     
		{
		   int sommaFibonacci=fibonacci[i-1] + fibonacci[i-2];
		   fibonacci[i]=sommaFibonacci;
		   System.out.println(sommaFibonacci);
		}


	}
}