import java.util.Scanner; 
public class Main
{
    public static void main(String[] args) 
    {
    Scanner input=new Scanner(System.in);
    int ciclo;
    do
    {  
          System.out.println("Digita valore su qui applicare fibonacci");
          ciclo=input.nextInt();
	      Fibonacci.metodoFibonacci(ciclo);
	    
	}
	while(ciclo<200);	
	
} 




}