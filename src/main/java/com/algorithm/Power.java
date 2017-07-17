package com.algorithm;

/*
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 */
/*
 * 需要考虑 base = 0 || exponent <= 0 的情况，同时double比较的精度问题，还有用位运算代替/2
 * 
 */
public class Power
{
	public double Power1(double base, int exponent)
	{
		if (equal(base, 0.0) || equal(base, 1.0))
		{
			return base;
		}
		if (exponent == 0)
		{
			return 1;
		}
		boolean flag = true;
		int parity = exponent & 0x1;
		if (exponent < 0)
		{
			flag = false;
			exponent *= -1;
		}
		double result = base;
		while (exponent != 1)
		{
			result *= result;
			exponent = exponent >> 1;
		}
		result = parity == 1 ? result *= base : result;
		return flag == false ? 1 / result : result;

	}

	public boolean equal(double a, double b)
	{
		if (-0.00000001 < (a - b) && (a - b) < 0.00000001)
		{
			return true;
		} else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		Power power = new Power();
		System.out.println(power.Power1(0, 0));
	}
}
