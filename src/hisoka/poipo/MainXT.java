package hisoka.poipo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
		
		int[]E1 = {};
		int[]F1  ={};
		//System.out.println("Hasil Soal 2 : "+solution2a(A,B));
		System.out.println("Hasil Soal 2 EF : "+solution2a(E1,F1));
		
		printMessage("===========Soal 3================");
		int[]E = {1,2,5,8,9};
		int[]F = {1, 2, 5, 9, 9};
		//System.out.println("Hasil Soal 3 : "+solution3(F,5));
		//testSol3();
		
		/*
		printMessage("===========Soal 4================");
		System.out.println("IntegerMIN "+ Integer.MIN_VALUE);
		
		*/
		
		//printMessage("===========Soal 5================");
		/*int[] G = {1, 7, 5, 4, 9, 9};
		int[] H = {1, 3, 5, 3, 4};
		System.out.println("Hasil Soal 5 : "+solution5(G));
		System.out.println("Hasil Soal 5 : "+solution5(H));*/
		testSolution5();
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
	
	 /******************************************************************************/
    public static void testSolution5()
    {
    	
    	int[]A = {1,2};
    	int[]B = {1,3,6,3,5,5,3,7,7};
    	int[]C = {1, 4, 5, 6, 7, 2}; 
    	int[]D = {1,2,3,4,5,6,7,8,9,10,11,2,45,56,67,78,89,90,123,124,1245566778};
    	int[]D1 = {1,2,3,4,5,6,7,8,9,10,11,2,45,56,67,78,89,90,2,123,124,1245566778};
    	int[]E = {1, 5, 3, 3, 7} ;
    	int[]F= {1, 3, 5};
    	int[]G = {1,5,3};
    	int[]H = {1, 2, 6, 3, 4, 5};

    	System.out.println("Test Soal 5");
    	System.out.println("A : "+solution5c(A));
    	System.out.println("B : "+solution5c(B));
    	System.out.println("C : "+solution5c(C));
    	System.out.println("D : "+solution5c(D));
    	System.out.println("D1 : "+solution5c(D1));
    	System.out.println("E : "+solution5c(E));
    	System.out.println("F : "+solution5c(F));
    	System.out.println("H : "+solution5c(H));
    }
	 
    
    public static boolean solution5c(int[] A)
	{
		int count = 0;
		int[]B = Arrays.copyOf(A, A.length); 
		Arrays.sort(B);		
		for(int i=0; i<A.length; i++)
		{
			if(A[i] != B[i]) count++;
		}
		
		if(count > 2) return false;
		return true;
	}
	
    
    
    
	public static boolean solution5a(int[] A) 
	{
		int max = A[0], maxIndex = 0;
		
	    //find the maximum element in the array
	    for(int i=0;i<A.length;i++)
	    {
	        if(A[i] > max)
	        {
	            max = A[i];
	            maxIndex = i;
	        }
	    }

	    //check whether all the elements before max are less than it
	    // if not you need more swaps to sort
	    for(int j=0;j<maxIndex;j++)
	    {
	        if(A[j]>max)
	            return false;
	    }


	    //check the smallest element after maximum element
	    /*for(int j=maxIndex; j<A.length; j++)
	    {
	    	if(A[maxIndex])
	    }
	    */
	    for(int j=maxIndex+1;j<A.length-1;j++)
	    {
	        if(!(max > A[j] && A[j+1] <A[j]))
	            return false;
	    }

	    if(A.length<=3)
	      {
	          int hisoka = 0;
		    for(int i=0; i+2<=3; i++)
		    {
		    	if(A[i]>A[i+1])
		    	{
		    		int temp = A[i];
		    		A[i] = A[i+1];
		    		A[i+1] = temp;
		    		for(int j=0; j+1<=3; j++)
		    		{
		    			if(A[j] > A[j+1]) return false;
		    			else return true;
		    		}
		    	}
		    }
	      }
	    
	    
	    //check what is next smallest element
	    int[] B = new int[A.length+1];
	    System.arraycopy(A, 0, B, 0, A.length);
	    B[A.length] = 2000000000;
	    for(int j=maxIndex+1;j<B.length-1;j++)
	    {
	        if(!(max > B[j] && B[j+1] <B[j]))
	            return false;
	    }
	    
	    //check middle element error
	    int count = 0;
	    for(int i =0; i+1<A.length; i++)
	    {
	    	
	    	if(A[i] > A[i+1]) 
			{
	    		int temp = A[i];
	    		int temp2 = 0;
	    		for(int j=0; j<A.length; j++)
	    		{
	    			if(temp < A[j])
	    			{
	    				int[] C = new int[A.length+1];
	    				System.arraycopy(A, 0, C, 0, A.length);
	    				C[i] = A[i+1];
	    				int temp3 = C[j];
	    				C[j] = temp;
	    				C[j+1]  = temp3;
	    				//check one more time
	    				for(int k =0; k<C.length; k++)
	    				{
	    					if(k+2<C.length){
	    					if(C[k] > C[k+1]) count++;
	    					}
	    				}
	    				if(count == 0) return false;
	    			}
	    		}
			}
	    }
	    

	    return true;
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
	
	/*****************************************************************************************************/	
	public static void testSol3()
	{
		int[]A = {0,1,2,5,5,5,5,7,8,9};
		int[]B = {0,-1,2,5,7,8,-9};
		System.out.println("Hasil Soal 3 A :  "+solution3(A,0));
		System.out.println("Hasil Soal 3 A :  "+solution3(B,0));
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
            return l;
        }
        return -1;
    }
	
/*****************************************************************************************************/

	public static void testSolution2b()
	{
		
	}
	
	public static int solution2b(int[] A, int[] B)
	{
		Set<Integer> s = new HashSet<Integer>();
		 
		for (int i=0;  i<A.length; i++) {
		  s.add(A[i]);
		}
		 
		int commonMin = Integer.MAX_VALUE;
		for (int i=0; i<B.length; i++) {
		  if (s.contains(B[i])) {
		    if (B[i] < commonMin){
		      commonMin = B[i];
		    }
		  }
		}
		 
		return commonMin;
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
			System.out.println("indexB = "+indeksB);
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
