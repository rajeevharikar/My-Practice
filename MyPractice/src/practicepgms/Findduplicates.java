package practicepgms;

import java.util.HashSet;
import java.util.Iterator;

public class Findduplicates {
	
	public static void main(String[] args) {
		
		 int[] arr1 = {1, 2, 3, 4, 5,6};
	     int arr2[] = {2,2, 1, 2,5,5,5};
	     int arr3[] = new int[6];
	     int ci=0;
	      for(int i=0; i<arr1.length;i++,ci++)
	      {
	    	  for(int j=0;j<arr2.length;j++)
	    	  {
	    		  if(arr1[i]==arr2[j])
	    		  {
	    			 arr1[i]=arr3[i];
	    			 System.out.println(arr3[ci]);
	    			 		 
	    		   }
	    		  }
	    	  }
	    		
	         }
	    
	      }
	      
	      
	 

