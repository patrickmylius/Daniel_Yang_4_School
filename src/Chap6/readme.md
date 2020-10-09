# CHAPTER SUMMARY - Chapter 6 - Methods.
1. Making programs modular and reusable is one of the central goals in software
engineering. Java provides many powerful constructs that help to achieve this goal.
Methods are one such construct.
2. The method header specifies this modifiers, return value type, method name
and parameters of the method. The static modifer is used for all methods in this chapter.

3. A method may return a value. The returnValueType is the data type of the value
the method returns. If the methods does not return a value, the returnValueType
is the keyword void.

4. The parameter list refers to the type, order, and number of a method's parameters.
The method name and the parameter list together costitute the method signature.
Paramters are optional; that is, a method doesn't need to contain any paramteres.

5. A return statement ca also be used in a void method for terminating the method
and returning to the method's caller. This is usefull occosionally for circumventing the normal
flow of control in a method

6. The arguments that are passed to a method should have the same number, type,
 and order as the parameters in the method signature.
 
 7. When a program calls a method, program control is transferred to the called Method.
 A called method returns control to the caller when its return statement is executed, 
 or when its method-ending closing brace is reached.
 
 8. A value-returning method can also be invoked as a statement in Java. in this case,
 the caller simply ignores the return value.
 
 9. A method can be overloaded. This means that two methods can have the same name,
 as long as their method parameter lists differ.
 
 10. A variable declared in a method is called a local variable.
 The scope of a local variable starts from its decleration and continues to the end of
 the block that contains the variable. A local variable must be declared
 and initialized before it is used.
 
 11. Method abstraction is achieved by seprating the use of a method from
 its implementation. The client can use a method without knowing how it is implemented.
 The details of the implementation are encapsulated in the method and hidden
 from the client who invokes the method. This is known as information hiding or encapsulation.
 

12. Method abstraction modularized programs in a neat, hierachical manner.
Programs written as collections of concise methods are easier to write, debug, maintain
and modify that would otherwise be the case. This writing style also promotes method reusability.

13. When implementing a large program, use the top-down and/or  bottom-up coding approach.
Do not write the entire program at once. This approach may seem to take more time
for coding (because you are repeatedly compiling and running the program),
but it actually saves time and makes debugging easier.

