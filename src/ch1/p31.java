package ch1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//110650038

public class p31 
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("1+2=" + (1+2));
        System.out.println("3*4=" + (3*4));

        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;

        System.out.println("變數num1的值是" + num1);
        System.out.println("變數num2的值是" + num2);
        System.out.println("num1+num2的值是" + sum);

        num1 = num1 + 1;

        System.out.println("變數num1的值+1是" + num1);
	}

}
