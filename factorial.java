/*
Program to store large factorial in an array
*/
import java.io.*;
class store{


 static int MAXIMUM=400;
private	int number;
private	int res[];
private	int size;
	store(int number)
	{
		res=new int[MAXIMUM];
		
		this.number=number;
		calculator();
	}
	void showFact()
	{
		System.out.print("Factorial of "+number+" is: ");
		for(int i=size-1;i>=0;i--)
			System.out.print(res[i]);

		System.out.println("");
	}
private	void calculator()
{
	res[0]=1;
		size=1;
		for(int i=2;i<=number;i++)
		{
			int carry=0;
			for(int j=0;j<size;j++)
			{
				int product=i*res[j]+carry;
				res[j]=product%10;
				carry=product/10;
			}
			System.out.println(carry);
			while(carry!=0)
			{
				res[size]=carry%10;
				carry=carry/10;
				size++;
			}

		}

}


}
public class factorial{
	
	public static void main(String args[]) throws IOException
	
 {
 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	int n;
  System.out.print("Please Enter the Number: ");
 	n=Integer.parseInt(br.readLine());
 	store s=new store(n);
 	s.showFact();

 }
}
