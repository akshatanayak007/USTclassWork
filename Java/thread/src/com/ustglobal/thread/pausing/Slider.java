package com.ustglobal.thread.pausing;

public class Slider {

	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {
			System.out.println("Sliding");
			
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}
