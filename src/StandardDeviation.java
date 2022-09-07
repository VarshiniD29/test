
import java.util.Scanner;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class StandardDeviation {

	//static double startTime = System.nanoTime();
	 public double calculateStd(double[] nums)
	 {
		
		 Scanner sc=new Scanner(System.in);   
	    	double[] nums1 = new double[5];
			System.out.println("Enter Elements: "); 
		 
		    for (int i = 0; i < nums1.length; i++)
		    {
		        nums1[i] = sc.nextInt();
		    }   
		    
		    DescriptiveStatistics stats = new DescriptiveStatistics();
		    for (int i = 0; i < nums1.length; i++) 
		    {
		        stats.addValue(nums1[i]);
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
	 std.calculateStd(null);
	 //System.out.println(total);
}
	
	
}

