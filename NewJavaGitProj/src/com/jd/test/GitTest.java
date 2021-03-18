package com.jd.test;

public class GitTest {

	static int[] arr = new int[] {1,2,3,4,5};
	
	public boolean search(int[] a, int b)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == b) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		GitTest t = new GitTest();
		System.out.println("Positive case: "+t.search(arr, 2));
		System.out.println("Negative case: "+t.search(arr, 8));
	}
}
