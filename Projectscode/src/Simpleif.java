
	import java.util.Scanner;
	public class Simpleif {
	 public static void main(String [] args)
	 {
		 int marksObtained,passingMarks;
		 passingMarks=40;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Input marks scored by you");                                                                        
		 marksObtained=sc.nextInt();
		 if(marksObtained<passingMarks)
		 {
			 System.out.println("Student is below average");
		 }
		 else if(marksObtained==passingMarks)
		 {
			 System.out.println("Student is  average");
		 }
		 else
		 {
			 System.out.println("Student is above average");
		 }
		 
	 }
	}


