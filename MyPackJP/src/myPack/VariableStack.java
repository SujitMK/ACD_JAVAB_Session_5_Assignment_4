package myPack;               // Package declared

public class VariableStack implements Stack{               // Declared the class which implements an interface                   

	 private int stack[ ];                      // Declared the array of type integer
     private int a;                           // Declared the variable type of integer

  
    VariableStack(int size)                           //  // used a parameterized constructor
    {
            stack=new int[size];                       // assigning an array object to an variable of array type
            a=-1;                                       // set stack pointer to -1
    }
   
    public void push(int item)                           // declared a push method
    {
    	// to check if stack pointer equal to the stack length or not
            if(a==stack.length-1)
            {
           	 // if Stack pointer reached end display below message
                //   System.out.println("Stack Overflows.");
                    int t[ ]=new int[stack.length * 2];// defines the new stack with double size 
                    for(int i=0;i<stack.length;i++) // pushes all the records new stack
                            t[i]=stack[i];
                    stack=t; // reassign to old stack
                    stack[++a]=item; // push the new record
            }
            else
                    stack[++a]=item; // push the new record
    }
  
    public int pop()
    {		// if Stack pointer goes below 0  then show below message	
            if(a<0)
            {
                    System.out.println("Stack Underflows.");
                    return 0;
            }
            // other wise pop the value from stack
            else
                    return stack[a--];
    }
}
