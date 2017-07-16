package com.algorithm;

/*
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
/*
* 1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1

row.length
col.length
��ӡ����
r
c-1
r-1
c-2

r-2
c-3
r-3
c-4
....
*���չ��ɴ�ӡ����Ҫ������forѭ����Խ�����
 */
import java.util.ArrayList;

/**
 * @author jieping
 *
 */
public class printMatrix
{
	public static ArrayList<Integer> printMatrix1(int[][] matrix)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (matrix == null)
		{
			return list;
		}
		int colLength = matrix.length;
		int rowLength = matrix[0].length;
		int ctrlNum = 0;
		int x = 0;
		int y = 0;
		while (true)
		{
			if (rowLength - ctrlNum <= 0)
			{
				return list;
			}
			for (int i = 0; i < rowLength - ctrlNum; y++, i++)
			{
				list.add(matrix[x][y]);
			}
			y--;
			x++;
			if (colLength - ctrlNum - 1 <= 0)
			{
				return list;
			}
			for (int i = 0; i < colLength - ctrlNum - 1; i++, x++)
			{
				list.add(matrix[x][y]);
			}
			x--;
			y--;
			if (rowLength - ctrlNum - 1 <= 0)
			{
				return list;
			}
			for (int i = 0; i < rowLength - ctrlNum - 1; y--, i++)
			{
				list.add(matrix[x][y]);
			}
			y++;
			x--;
			if (colLength - ctrlNum - 2 <= 0)
			{
				return list;
			}
			for (int i = 0; i < colLength - ctrlNum - 2; i++, x--)
			{
				list.add(matrix[x][y]);
			}
			ctrlNum += 2;
			x++;
			y++;
		}
	}

	public static void main(String[] args)
	{
		int[][] arrays = new int[4][4];
		int c = 1;
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				arrays[i][j] = c++;
			}
		}
		ArrayList<Integer> list = printMatrix1(arrays);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
	}

}
