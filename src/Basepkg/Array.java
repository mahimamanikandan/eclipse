package Basepkg;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]=new int[5];
		int i,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first array :");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the second array");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(a[i]!=b[i])
			{
				f=0;
			}
		}
		if(f==1)
		{
			System.out.println("Array are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}


	}

}
