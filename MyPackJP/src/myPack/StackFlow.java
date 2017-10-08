package myPack;                          // Package declared

public class StackFlow {                             // Declared the main class

	public static void main(String[] args) {             // Declared the main method
		
		        //initializing the Fixed and variable Stack Classes
				FixedStack fs=new FixedStack(3);
				VariableStack vs=new VariableStack(5);
	
				Stack stack;                       // declared the variable of Stack type
				
				// Pushing the Records to Fixed Stack 
				// Pushing more than stack Size show stack overflows
				for(int i=0;i<5;i++)
					fs.push(i);//Pushing records to Stack
					System.out.println("Fixed length Stack are:");
					for(int i=0;i<5;i++)
						System.out.println(fs.pop());// Popping records from Stack
					
				//Pushing records into Variable Stack
				for(int i=0;i<8;i++)
						vs.push(i);//Pushing records to Stack
					System.out.println("Dynamic length Stack are:");
					for(int i=0;i<8;i++)
						System.out.println(vs.pop());// Popping records from Stack
					
				// Push and pop method using the Interface to Fixed Stack 
				stack=fs;
				for(int i=0;i<4;i++)
					stack.push(i);//Pushing records to Stack
				System.out.println("Fixed length Stack using interface reference");
				for(int i=0;i<4;i++)
					System.out.println(stack.pop());// // printing records from Stack using POP
				// Push and pop method using the Interface to Variable Stack 
				stack=vs;
				for(int i=0;i<8;i++)
				stack.push(i); //Pushing records to Stack
				System.out.println("Dynamic length Stack using interface reference");
				for(int i=0;i<8;i++)
					System.out.println(stack.pop()); // printing records from Stack using POP

	}

}
