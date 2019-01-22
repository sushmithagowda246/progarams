package javaPrograms;

import org.testng.annotations.Test;

public class Prime {
	@Test
	public static void prim()
	{
		int n=7;
		int count=0;
		for(int i=2;i<7;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime number");
				 count++;
			}	
		}
		if(count==0)
		{
			System.out.println("prime");
		}
	}
}
