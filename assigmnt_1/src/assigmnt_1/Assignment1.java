package assigmnt_1;
import java.util.Scanner;
public class Assignment1 extends test{
	 public static void main(String[] args) {
		    Scanner myObj = new Scanner(System.in);
		    System.out.println("Calculation For Man-Hours");  
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		    
		    System.out.println("Enter weight actor and weight use case");    	 
		    int t1 = myObj.nextInt();
		    int t2 = myObj.nextInt();
		    int totaluucp = t1 + t2;					//total uucp    
		    System.out.println("Total UUCP: " + totaluucp); 
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		    
		    Scanner myObj1 = new Scanner(System.in);
		    System.out.println("Enter Technical Factor");	    
		    int tfactor = myObj1.nextInt();          
		    double totaltcf = (0.01 * tfactor) + 0.6;	
		    double totalszuc = totaluucp * totaltcf;      //total szuc
		    System.out.println("Total SzUC: " + totalszuc); 
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		    
		    Scanner myObj2 = new Scanner(System.in);
		    System.out.println("Enter Experience Factor");
		    int efactor = myObj2.nextInt(); 	         
		    double totalefac = (-0.03 * efactor) + 1.4;	 //total efactor
		    double totalucp = totalszuc * totalefac;
		    System.out.println("Total UCP: " + totalucp); 
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		    
		    Scanner myObj3 = new Scanner(System.in);
		    System.out.println("Enter Man-Hours "); 
		    int er = myObj3.nextInt();    				//total man hour ucp
		    double totalman = er * totalucp;
		    System.out.println("Total Man Hours: " + totalman);  
		    double totalrisk = (1.0 + 0.05) * totalman;	//total man hour risk
		    System.out.println("Total Adjusted Man Hours: " + totalrisk); 
		    
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
		    Scanner myObj4 = new Scanner(System.in);
		    System.out.println("Enter Estimate Report ");    
		    int report = myObj4.nextInt();       //total man hour report	
		    double totalreport = totalrisk + report;
		    System.out.println("Total Estimate Report: " + totalreport); 
		
		    test your = new test();
		    //your.laptop_method();
	
		  }
		}
class test  {
	  test() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
	    System.out.println("Done Calculation.");
	  }
	
	}