package anudip;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a and b are the numbers to find the HCF
		int a=60, b=36, hcf=1;
		
		//running loop from 1 to the smallest of both number
		for(int i = 1; i <= a && i <= b; i++)  
		{
			
		//returns true if both conditions are satisfied   
		if(a%i==0 && b%i==0)
			
		//storing the variable i in the variable HCF 
		hcf = i;  
		}  
		
		//prints the HCF 
		System.out.printf("HCF of %d and %d is: %d", a, b, hcf);  
		}  
		
			

	}


