package ubuntu;


import java.util.Scanner;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class StandardDeviation {

	//static double startTime = System.nanoTime();
	 public double calculateStd(double[] nums)
	 {
		
//	    	List<Integer> nums1=new ArrayList<Integer>(5);
		 
//			System.out.println("Please enter the number of Elements: "); 
//			 int noe =  sc.nextInt();  
		    
		    DescriptiveStatistics stats = new DescriptiveStatistics();
		    for (int i = 0; i < nums.length; i++) 
		    {
		        stats.addValue(nums[i]);
		    }
		  System.out.println("StandardDeviation is:" + stats.getStandardDeviation());
			double s77 = stats.getStandardDeviation();
		return s77;
		
		} 
	// static double stop = System.nanoTime();
	 //static double total = stop - startTime;
	

	 public static void main(String args[])
	 {
	 StandardDeviation std = new StandardDeviation();
	 
	 	double[] nums = new double[5];
	 	Scanner sc=new Scanner(System.in);   
	 	
		System.out.println("Enter Elements: "); 
	 
	    for (int i = 0; i < nums.length; i++)
	    {
	        nums[i] = sc.nextInt();
	    } 
	 std.calculateStd(nums);
	 //System.out.println(total);
}
	
	
}

