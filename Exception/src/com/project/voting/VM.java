package com.project.voting;

public class VM {
	
	public VM coice(int c) throws WrongSelectionException {
			
		if(c>0 && c<=5) {
			
			System.out.println("Your response is submitted Sucessfully!");
			return this;
			
		}else {
			
			throw new WrongSelectionException("Invalid selection ie."+c);
			
		}
		
	}

}
