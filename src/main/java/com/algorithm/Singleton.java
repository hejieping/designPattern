package com.algorithm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ���һ���ֻ࣬�����ɸ����һ��ʵ��
 */
//ֻ�����ڵ��߳�
class Singleton1
{
	private Singleton1()
	{
	}

	private static Singleton1 instance = null;

	public static Singleton1 Instance()
	{
		if (instance == null)
		{
			instance = new Singleton1();
		}
		return instance;
	}
}

// ���ö��̣߳�����ÿ�η��ʶ���Ҫ�������������ǳ���ʱ
class Singleton2
{
	private Singleton2()
	{
	}

	private static Lock lock = new ReentrantLock();
	private static Singleton2 instance = null;

	public static Singleton2 Instance()
	{
		lock.lock();
		try
		{
			if (instance == null)
			{
				instance = new Singleton2();
			}
			return instance;
		} finally
		{
			// TODO: handle finally clause
			lock.unlock();
		}
	}

}

// ��ȷ��������ʵ�ָ��ӣ����׳���
class Singleton3
{
	private Singleton3()
	{
	}

	private static Lock lock = new ReentrantLock();
	private static Singleton3 instance = null;

	public static Singleton3 Instance()
	{
		if (instance == null)
		{
			lock.lock();
			try
			{
				if (instance == null)
				{
					instance = new Singleton3();
				}
			} finally
			{
				// TODO: handle finally clause
			}
		}
		return instance;
	}

}

// ���þ�̬���캯������࣬��instance������Ѿ�����ʵ�����Ӷ������ڴ�ʹ����
class Singleton4
{
	private Singleton4()
	{
	}

	private static Singleton4 instance = new Singleton4();

	public static Singleton4 Instance()
	{
		return instance;
	}
}

// ��ȷ��ֻ��Instanced����ʱ�Ŵ���ʵ��
class Singleton5
{
	private Singleton5()
	{
		System.out.println("create singleton5");
	}

	public static Singleton5 Instance()
	{
		return Nested.instances;
	}

	private static class Nested
	{
		public static Singleton5 instances = new Singleton5();
	}
}

public class Singleton
{
	public static void main(String[] args)
	{
		Singleton5.Instance();
		Singleton5.Instance();
		Singleton5.Instance();
	}
}
