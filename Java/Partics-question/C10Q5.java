//Date : 22/04/2025 
/*
 * What is the order of constructor execution for the following inheritance hierarchy 
                    Base 
                                
                   Derived 1
                                    
                   Derived 2

Derived obj = new Derived 2( ); 
Which constructor(s) will be executed & in what order?
 */ 
// Answer: The order of constructor execution for the given inheritance hierarchy 
//will be as follows:
// 1. Base constructor will be executed
// 2. Derived 1 constructor will be executed    
// 3. Derived 2 constructor will be executed
// This is because in Java, when a subclass constructor is called, it implicitly calls the
// constructor of its superclass first before executing its own constructor code.
public class C10Q5 {
    
}
