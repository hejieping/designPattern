package com.algorithm;

public class Fibonacci
{
	public int Fibonacci1(int n)
	{
		if (n == 0 || n == 1)
		{
			return n;
		}
		int f1 = 0;
		int f2 = 1;
		int temp = 0;
		for (int i = 0; i < n - 1; i++)
		{
			temp = f1 + f2;
			f1 = f2;
			f2 = temp;
		}
		return f2;
	}

	public static void main(String[] args)
	{
		Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.Fibonacci1(2));
	}
}
