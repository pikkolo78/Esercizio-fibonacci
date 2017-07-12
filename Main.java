import java.util.Scanner; 
public class Main
{
    public static void main(String[] args) 
    {
    Scanner input=new Scanner(System.in);
    int ciclo=-1;
    do
    { 
    	
        try
    	{
          System.out.println("Digita valore positivo su cui applicare fibonacci, o premi 0 per uscire");
          ciclo=input.nextInt();
          if (ciclo>0) 
          {
          	Fibonacci.metodoFibonacci(ciclo);
          }
          else if(ciclo<0)
          {
          	System.out.println("Input negativo, riprova");
          }
        }
        catch (Exception ext)
        {
        	
        	System.out.println("Input non valido, riprova");
        	input.next();
        }

	}
	while(ciclo !=0);
	System.out.println("bye bye");	
	
} 




}