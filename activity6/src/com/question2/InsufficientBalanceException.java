//example of user define exception
package com.question2;

public class InsufficientBalanceException extends Exception {
	
  private String message;
  
  public InsufficientBalanceException(String message) {
      this.message = message;
  }
  public String getMessage() {
      return message;
	
	

	
		
		
	}

}
