package com.algorithm;

/*
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η�
 */
/*
 * ��Ҫ���� base = 0 || exponent <= 0 �������ͬʱdouble�Ƚϵľ������⣬������λ�������/2
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
