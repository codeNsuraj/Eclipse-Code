package com.practice;

public interface Hi {
	
	Hi get();
	
	
	public static Hi dd() {
		return new Hi;
	}
	
	class a{
		
		public Hi dd() {
			return (Hi) this;
		}
		
	}
	

}
