package hisoka.poipo;

import java.util.Arrays;

public class MainXT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "Hellow Hyosoka poipo";
		String test2="";
		printMessage(solution1a(test2));
		
		printMessage("===========Soal 2================");
		int[]A = {1,3,2,1};
		int[]B = {4,2,5,3,2};
		
		int[]C = {1,3,2,1};
		int[]D = {4,5};
		System.out.println("Hasil Soal 2 : "+solution2a(A,B));
		System.out.println("Hasil Soal 2 : "+solution2a(C,D));
		
		printMessage("===========Soal 3================");
		int[]E = {1,2,5,8,9};
		int[]F = {1, 2, 5, 9, 9};
		System.out.println("Hasil Soal 3 : "+solution3(F,5));
		
		
		/*
		printMessage("===========Soal 4================");
		System.out.println("IntegerMIN "+ Integer.MIN_VALUE);
		
		
		
		printMessage("===========Soal 5================");
		int[] G = {1, 7, 5, 4, 9, 9};
		int[] H = {1, 3, 5, 3, 4};
		System.out.println("Hasil Soal 5 : "+solution5(G));
		System.out.println("Hasil Soal 5 : "+solution5(H));
		*/
	}
	
	public int solution4(Tree T) {
        // write your code in Java SE 8
        if(T.l == null && T.r == null) return 0;       
        
        return countV(T,-100000);
    }
	
	class Tree {
		  public int x;
		  public Tree l;
		  public Tree r;
		}
	
	 public int countV(Tree T, int maxValue) {
	        if(T == null) {
	            return 0;
	        }
	        int num = 0;
	        if(T.x >= maxValue) {
	            num = 1;
	            maxValue = T.x;
	        }
	        return num + countV(T.l, maxValue) + countV(T.r, maxValue);
	    }
	
	public static boolean solution5(int[] A) {
        // write your code in Java SE 8
		int count = 0;
		for(int i=0; i<A.length; i++)
		{
			if(i+1 < A.length)
			{
				
				if(A[i] > A[i+1]) 
				{ 
				  count++;				    
				  if (count > 2) return false;
				  if(A[i-1] == A[i+1])
				  {
					  for(int j = i+1; j<A.length; j++)
					  {
						  if(A[i+1] != A[j]) return false;
					  }
				  }
				}
			}
		}
		
		return true;
    }
	
	
	
	public static int solution3(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r)%2 == 0 ? (l+r)/2 : ((l+r)/2)+1 ;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return A[l];
        }
        return -1;
    }
	
	public static int solution2a(int[] A, int[] B) {
        // write your code in Java SE 8
		int result = -1;
		Arrays.sort(A);	
		Arrays.sort(B);
		int indeksB = 0;
		for(int i=0; i<A.length; i++)
		{			
			indeksB = Arrays.binarySearch(B, A[i]);
			if(indeksB != -1 && A[i] == B[indeksB])
			{				
				result = A[i];
				break;
			}
		}
		
		return result;
    }
	
	public static int solution2(int[] A, int[] B) {
        // write your code in Java SE 8
		int result = -1;
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i=0; i<A.length; i++)
		{
			
		}
		
		return result;
    }
	
	 public static String solution1a(String S) {
	        // write your code in Java SE 8
		 StringBuilder result = new StringBuilder();  
		 String[] temp = S.split(" ");
		 String tempS = "";
		 for(int i=0; i<temp.length; i++)
		 {
			 tempS = new StringBuilder(temp[i]).reverse().toString();
			 System.out.println(tempS);
			 result.append(tempS+" ");
		 }
		 
		 displayArrayS(temp);
		 return result.toString().trim();
	    }
	
	 public static String solution1(String S) {
	        // write your code in Java SE 8
		 String result = "";
		 int k = S.indexOf(" ");
		 int oldk = 0;
		 
		 
		 while(k != -1)
		 {
			 String temp = S.substring(oldk, k);
			 printMessage(temp);
			 oldk = k;
			 k = S.indexOf(" ", oldk);
			 System.out.println(k);
		 }
		 return result;
	    }
	
	 public static void displayArrayS(String[] A)
		{
			for (String a: A)
			{
				System.out.print(a+" ");
			}
			System.out.print("\n");
		}
	
	public static void displayArray(int[] A)
	{
		for (int a: A)
		{
			System.out.print(a+" ");
		}
		System.out.print("\n");
	}

    public static void printMessage(String mess)
	{
		System.out.println(mess);
	}
}
