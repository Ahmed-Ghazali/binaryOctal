import java.util.Scanner;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class Binary_Octal
{
	public static void main (String rgs[])
	{
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("input binary number 1: ");
		String x = myscanner.nextLine();
		String [] str = x.split("");
		int [] binary = new int [str.length];
		for(int i = 0; i<binary.length;i++)
		{
			binary[i]=Integer.parseInt(str[i]);
			if (binary[i] == 1 || binary[i] == 0)
			{
				
			}
			else
			{
				System.out.println("Number inputted must be binary");
			}
			if (!(str.length == 4 || str.length==5))
			{
				System.out.println("Number inputted must be 4-5 bits long");
				break;
			}
		}
		
		System.out.print("input binary number 2: ");
		String y = myscanner.nextLine();
		String [] str1 = y.split("");
		int [] binary1 = new int [str1.length];
		
		for(int i = 0; i<binary1.length;i++)
		{
			binary1[i]=Integer.parseInt(str1[i]);
			if (binary1[i] == 1 || binary1[i] == 0)
			{
				
			}
			else
			{
				System.out.println("Number inputted must be binary");
			}
			if (!(str1.length == 4 || str1.length==5))
			{
				System.out.println("Number inputted must be 4-5 bits long");
				break;
			}
		}
		System.out.println("Decimal Num 1: "+converter(binary));
	}
	
	
	public static int converter(int binary)
	{
		int A = 0;
		//int B = 0;
		int CC = binary;
		//int [] DD = binary1;
		int p = 0;
		int C = 0;
		//int D;
	while (true)
	{
	C=CC;
	{
		if(C == 0)
		{
	      	break;
	      } 
		else 
		{   
	          A =A + (C%10)*2^p;
	          C = C/10;
	          p++;
	          
	       }
		}
	System.out.println("Decimal Num 1: "+ A);
	break;
	}
	return A;
	}
}
