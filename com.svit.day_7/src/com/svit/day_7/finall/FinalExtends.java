package com.svit.day_7.finall;


public class FinalExtends extends FinalBike{
	//we get error because we are extending final class 
	void run() {
		System.out.println("Running safely with 100kmph");
	}
	
	public static void main(String[] args) {
		
		FinalExtends f1 = new FinalExtends();
		f1.run();
		
	}

}