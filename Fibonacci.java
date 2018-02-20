package day06;

import java.util.Scanner;

public class Fibonacci {
	
	int[] fibonacci;
	int size;
	
	int scannerInput() {
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();		
		return size;
	}//end of scannerInput
	
	void generatefibonacci(int size){
		if(size>=0) {
		fibonacci=new int[size];
		int n0=0;
		int n1=1;
		
		if(size<=12) {//check if array size is valid
			if(size==0) {//check for no size array
			System.out.println("There is no array..");
			run();
			
			}else if(size==1){//check for size 1 array and set the 1st value				
			fibonacci[0]=n0;
			
			}else if(size==2){//check for size 2 array and set 1st 2 values
			fibonacci[0]=n0;
			fibonacci[1]=n1;
			
			}else {//check more than size 2				
			fibonacci[0]=n0;
			fibonacci[1]=n1;
			for(int i=2;i<fibonacci.length;i++) {
				int n2=n0+n1;
				fibonacci[i]=n2;
				n0=n1;
				n1=n2;
				}
			}
			
			if(size!=0) {
			displayFibonacci();
			}
			
			if(size!=0) {
			checkMax();
			}
		}else {
			System.out.println("Invalid array size");
			run();
		}
		}else {
			System.out.println("Invalid array size");
			run();
		}
	}//end of generatefibonacci
	
	void run() {
		System.out.println("Please Enter Array Size: ");
		scannerInput();
		generatefibonacci(size);		
	}//run
	
	void displayFibonacci() {//print out the array
		for(int i=0;i<fibonacci.length;i++) {
			System.out.print(fibonacci[i]+" ");
		}
		System.out.println();
	}//end of displayFibonacci
	
	void checkMax() {//check if the value inside array is within the requested upper limit
		System.out.println("Enter Max Value: ");
		int max=scannerInput();
		for(int i=0;i<fibonacci.length;i++) {
			if(fibonacci[i]<=max) {
			System.out.print(fibonacci[i]+" ");
		}
		}
	}//end of checkMax

	public static void main(String[] args) {
		Fibonacci refFib=new Fibonacci();
		refFib.run();		
	}

}
