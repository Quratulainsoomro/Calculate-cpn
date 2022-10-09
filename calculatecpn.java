import java.util.*; 
 class calculatecpn 
 { 
public static void main(String args[]) { 
System.out.println("Enter the Marks to calculate the CPN:"); 
Scanner mark = new Scanner(System.in); 
int testmarks; 
float matric, inter; 
double cpn; 
System.out.println("Enter the Matric Percentage:"); 
 matric = mark.nextFloat(); 
 System.out.println(matric); 
 System.out.println("Enter the Inter:"); 
 inter = mark.nextFloat(); 
 System.out.println(inter); 
 System.out.println("Enter the Test Marks:"); 
 testmarks = mark.nextInt(); 
 System.out.println(testmarks); 
 cpn = matric * 0.10 + inter * 0.30 + testmarks * 0.60; 
 System.out.println("The CPN is:"); 
 System.out.println(cpn); 
  } 
 }