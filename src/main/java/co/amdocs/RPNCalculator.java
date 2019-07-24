package co.amdocs;

import java.util.Stack;

public class RPNCalculator {
 
     Stack<Double> number =new Stack<Double>();
     private double operand1,operand2,result;
	double solve(String expression) {
		
		String[] tokens=expression.split(" ");
		/*for(String token : tokens) {
			if(token.equals("+")) {
				firstOperand=number.pop();
				secondOperand=number.pop();
				result=firstOperand+secondOperand;
				number.push(result);
			}
			else if(token.equals("-")) {
				firstOperand=number.pop();
				secondOperand=number.pop();
				result=secondOperand - firstOperand;
				number.push(result);
			}
			else if(token.equals("*")) {
				firstOperand=number.pop();
				secondOperand=number.pop();
				result=firstOperand * secondOperand;
				number.push(result);
			}
			else if(token.equals("/")) {
				firstOperand=number.pop();
				secondOperand=number.pop();
				result=secondOperand / firstOperand;
				number.push(result);
			}
			else {
				number.push(Double.parseDouble(token));
			}
			
		}*/
		for(String token:tokens) {
			if(token.equals("+")|token.equals("-")) {
				Operation Operator =OperatorFactory.getOpearatorObject(token);
				 operand1=number.pop();
				 operand2=number.pop();
				 result=Operator.operation(operand1,operand2);
			    number.push(result);
			}
			else {
				number.push(Double.parseDouble(token));
			}
			
		}
		
		return number.pop();
	
	}
}
