
package mca;
import java.util.Scanner;

class patterntriangle{

public void printdisplay(int n){
for (int i=1;i<=n;i++)
		{
		for( int j=1;j<=i;j++)
			{
 			System.out.print(j+" ");
 			 }
 		System.out.println();

		}

}

}

class pattern1
{
 public static void main(String[] args)
   {
patterntriangle pt=new patterntriangle();
Scanner sc=new Scanner(System.in);
System.out.println("enter the no  of rows");
int rows=sc.nextInt();
pt.printdisplay(rows);

	
	}
}
