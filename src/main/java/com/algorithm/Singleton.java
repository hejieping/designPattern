package problem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 设计一个类，只能生成该类的一个实例
 */
//只适用于单线程
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

// 适用多线程，但是每次访问都需要加锁，而加锁非常耗时
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

// 正确，但代码实现复杂，容易出错
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

// 利用静态构造函数，简洁，但instance过早就已经创建实例，从而降低内存使用率
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

// 正确，只有Instanced调用时才创建实例
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
