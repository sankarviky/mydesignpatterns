package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 24;
		App app=new App();
		app.performCyclometricComplexity(num1, num2);
	}

	void performCyclometricComplexity(int num1,int num2){
		int solution = 0;
    	if(num1!=0 && num2 !=0) {           //check for non zero
    		if(num1 % 3 == 0) {    			//check first number for divisiblity of 3
    			if(num2 % 2 == 0) {             //check second number for divisiblit of 2
    				if(num1 > num2) {           //check for large number
    					solution= (num1/3) - (num2/2);
    				}else {
    				    solution = (num2/2)- (num1/3);
    				}
    			
    		}
    			else {
    				System.out.println("Not divisible by two");
    			}
    		}else { 
    			System.out.println("Not divisible by three");
    		
    			
    		}
    		
    	}
    	System.out.println("The solution is"+solution);
    }
}
