import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int c=0;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	long noOfTestCases=Long.parseLong(s.nextLine());
	String str=s.nextLine();
	String arr[]=str.split(" ");
	int sort[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		sort[i]=Integer.parseInt(arr[i]);
	}
	insertionSort(sort);
	System.out.println(c);
	}
	 public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                c++;
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
}
