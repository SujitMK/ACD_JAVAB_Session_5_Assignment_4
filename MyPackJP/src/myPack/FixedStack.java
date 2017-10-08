package myPack;               // Package declared

public class FixedStack implements Stack{               // Declared the class which implements an interface

	 private int stack[ ];                               // Declared the array of type integer
     private int a;                                        // Declared the variable type of integer
     FixedStack(int size)                             // used a parameterized constructor
     {
             stack=new int[size];                   // assigning an array object to an variable of array type
             a=-1;                                     // set stack pointer to -1
     }
     public void push(int item)             // declared a push method
     {
 	 	// to check if stack pointer equal to the stack length or not
             if(a==stack.length-1)
             {
                     System.out.println("Stack Overflows");  // Printing an info
                     int t[ ]=new int[stack.length * 2];// defines the new stack with double size 
                     for(int i=0;i<stack.length;i++)// pushes all the records new stack
                     t[i]=stack[i];
                     stack=t;// reassign to old stack
                     stack[++a]=item;
             }
             else
                     stack[++a]=item; // push the new record
     }
     
     public int pop()                                          // declared the pop method
     {		// if Stack pointer is less than 0	
             if(a<0)
             {
                     System.out.println("Stack Underflows");
                     return 0;
             }
             // other wise pop the value from stack
             else
                     return stack[a--];
     }
}
