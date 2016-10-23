package com.mitocode.tema21;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HilosApp {

	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);
		completionService.submit(new CHilo(3000));
		completionService.submit(new CHilo(2000));
		
		//while(!task1.isDone() && !task2.isDone()){
			
		//}				
		
		while(true){
			System.out.println(completionService.take().get());	
		}
								
	}

}
