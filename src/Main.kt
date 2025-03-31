package com.example.tutorialseu_arraylists

import java.security.Principal

//ArrayLists are used to create dynamic arrays and arrays are type of collections. Which means the size of an
//ArrayList can be increased or decreased according to your requirement.
//The ArrayList class provides both read and write functionalities.
//The ArrayList follows the sequence of insertion order.
//An ArrayList is non synchronized and it may contain duplicate elements.

//Constructor of ArrayList
//ArrayList<E>(): Is used to create an empty ArrayList.
//ArrayList (capacity: Int): Is used to create an Array List of specified capacity.
//ArrayList (elements: Collection<E>): Is used to create an ArrayList filled with the elements of a collection

//Functions of ArrayList
// open fun add(element:E): Boolean -> used to add the specific element into the collection.
// open fun clear() -> used to remove all elements from the collection.
// open fun get(index: Int): E -> used to return the element at specified index in the list.
// open fun remove(element: E): Boolean -> used to remove a single instance of the specific element from current collection, if it is available.
// there are of course many more functions in the ArrayList Class.

//Empty ArrayList
/*fun main(){
    val arrayList = ArrayList<String>() //Creating an empty arraylist
    arrayList.add("One")                //Adding an object in arraylist
    arrayList.add("Two")
    arrayList.add("Three")
    println("........print ArrayList.......")
    for (i in arrayList){
        println(i)
    }
}

//ArrayList using collections
fun main(){
    val arrayList:ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")
    list.add("Three")

    arrayList.addAll(list)

    println("......printing ArrayList......")

    val itr = arrayList.iterator()

    while(itr.hasNext()){
        println(itr.next())
    }
    println("size of arrayList = "+ arrayList.size)
}

//ArrayList - get()
fun main(args: Array<String>){
    val arrayList:ArrayList<String> = ArrayList<String>()
    arrayList.add("Laura")
    arrayList.add("Caroline")
    arrayList.add("Pavani")
    arrayList.add("Tabarin")
    for(i in arrayList){
        println(i)
    }
    println("......arrayList.get(1)......")
    println(arrayList.get(1))
    println("......arrayList.get(3).......")
    println(arrayList.get(3))
}


//Lambda Expression -> Allows to write concise and short codes that does advanced things.
//Lambda Expression -> is a function which has no name but is not the same as anonymous function which also has no name.
//Lambda Expressions and anonymous functions are 'functions literals',i.e. functions that are not declared, but passed immediately as an expression.
//Lambda is defined with curly braces {} which takes variables as parameter (if any) and a body of a function.
//The body of a function is written after the variable (if any) followed by -> operator.
//Syntax: { variable(s) -> body_of_lambda}

//Normal Function: addition of two numbers for comparison
fun addNumber(a: Int, b: Int) {
    val add = a + b
    println(add)
} // output 15

//Lambda expression: addition of two numbers for comparison
val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
println(sum(10, 5))

//shorter version
val sum = {a: Int, b: Int -> println(a + b)}
sum(10, 5)

//Visibility Modifier -> are the keywords which are used to restrict the use of classes, interfaces, methods, and properties in Kotlin.
//These modifiers are used at multiple places such as class header or method body.
//Visibility Modifiers are categorized into four different types: *public, *private, * protected, *internal
//A public modifier element is accessible from everywhere in the project.
//I is a default modifier in Kotlin. If any class, interface etc. are not specified with any access/visibility modifier then that class,
//interface etc. is used in a public scope.
//All public declarations can be placed at the top of the file.
//If a member of a class is not specified then it is by default public.
//Syntax for public modifier
public class Example{
}
class Demo{
}
public fun hello()
fun demo()
public val x = 5
val y = 10

//Private Modifier -> allows the element to be accessible only within the block in which properties, fields, etc. are declared.
//The private modifier declaration does not allow access outside the scope.
//A private package can be accessible within that specific file.
//Syntax for Private Modifier
private class Example{
    private val x = 1
    private doSomenthing(){
    }
}
//In above class Example, val x and function doSomething() are declared as private. The class "Example" is accessible from the
// same source file, "val x" and "fun doSomething()"are accessible within Example class.

//Internal Modifier -> is a feature in Kotlin, which is not available in Java.
//The internal Modifier makes the field visible only the module in which it is implemented.
//All the fileds are declared as internal which are accessible only inside the module in which they are implemented.
//Syntex Internal Modifier
internal class Example{
    internal val x = 5
    Internal fun getValue(){

    }
}
internal val y = 10

//Open Keyword
//In Kotlin all classes are final by default, so they can't be inherited by default
//Side note: in Java it's the opposite, there you have to make your class final explicitly
//So to make a class inheritable to other classes you must mark it with the open keyword, else you get an error "type is final so can't be inherited"
//Protected Modifier with a class or an interface allows visibility to its class or subclass only.
//A protected declaration (when overridden) in its subclass is also protected unless it is explicitly changed.
//The Protected modifier CANNOT be declared at top level. (for Packages)
//Syntax of Protecte Modifier
open class Base{
    protected val i = 0
}
class Derived: Base(){
    fun getValue(): Int{
        return i
    }
}

//Overriding of protected types
open class Base{
    open protected val i = 5
}
class Another: Base(){
    fun getValue(): Int{
        return i
    }
    override val i = 10
}

//Example of Visibility Modifier
open class Base(){
    var a = 1 //public by default
    private var b = 2 //private to Base class
    protected open val c = 3 //visible to the Base and the Derived class
    internal val d = 4 //visible inside the same module
    protected fun e(){} //visible to the Base and the Derived class
}

class Derived: Base(){
    //a, c, d, and e() off the Base class are visible
    //b is not visible
    override val c = 9 //c is protected
}

fun main(args: Array<String>){
    val base = Base()
    //base.a and base.d are visible
    //base.b, base.c and base.e() are not visible
    val derived = Derived()
    //derived.c is not visible
}

//Nested class and Inner class -> a class which is created inside another class and a class which is created inside another class with keyword inner.
//In Kotlin, a nested class is by default static, so its data members and members function can be accessed without creating an object of the class.
//Nested classes cannot access the data members of outer classes.
//Syntax of Nested Class
class OuterClass{
    //outer class code

    class NestedClass{
        //nested class code
    }
}

//Nested Class Example
class OuterClass{
    private var name: String = "Mr X"
    class NestedClass{
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo(){
            print("name is ${name}") // cannot access the outer class member

    println("Id is ${id}")
        }
    }
}
fun main(args: Array<String>){
    //nested class must be initialized
    println(OuterClass.NestedClass().description)// accessing property

    var obj = OuterClass.NestedClass() //object creation
    obj.foo() //access member function
}
//Output: code inside nested class
//Id is 101


//inner Class
//An Inner class is a class which is created inside another class with keyword inner.
//In other words, we can say that a nested class which is marked as "inner is called inner class.
//Inner class cannot be declared inside interfaces or non-inner nested classes.
//The advantage of inner class over nested class is that, it is able to access members of its outer class even it is private.
//The inner class keeps a reference to an object of its outer class.
//Syntax of Inner class
class OuterClass{
    //outer class code

    inner class InnerClass{
        //inner class code
    }
}

//Inner Class Example
class OuterClass{
    private var name: String = "Mr X"
    inner class InnerClass{
        var description: String = "code inside inner class"
        private var id: Int = 101
        fun foo (){
            println("name is ${name}") //access the private outer class member
            println(Ïd is ${id})
        }
    }
}

fun main(args: Array<String>){
    println(OuterClass().InnerClass().description) //accessing property
    var obj = OuterClass().InnerClass() //object creation
    obj.foo() //access member function
}
//output: code inside inner class
//name is Mr X
//Id is 101

//Unsafe and Safe Cast Operator
//Unsafe Cast Operator: as
//Sometimes it is not possible to cast a variable, and it throws an exception, this is called an unsafe cast.
//The unsafe cast is performed by the infix operator as.
//Example:
//A nullable string (String?) cannot be cast to non-nullable string (String), this throw an exception.
fun main (args: Array<String>){
    val obj: Any? = null
    val str: String = obj as String
    println(str)
} //Output: Exception in thread "main" kotlin.TypeCastException: null cannot be cast to non-null type kotlin.String.
//Generates a ClassCastException
//Trying to cast an integer value of the Any type into a string type leads to a ClassCastException.
val obj: Any = 123
val str: String = obj as String
//Throws java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

//To make it works we need to do a Nullable for Casting
//Source and target variable needs to be a nullable for casting to work:
fun main(args: Array<String>){
    val obj: Any? = "String unsafe cast"
    val str:String? = obj as String? //Works
    println(str)
} //Output: String unsafe cast

//Safe Cast Operator: as?
//as? provides a safe cast operation to safely cast to a type.
//It returns a null if casting is not possible rather than trowing a ClassCastException
//Example of Safe Cast Operator
fun main(array: Array<String>){
    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString)
    println(safeInt)
} //Output: Kotlin
//          null

//Exception Handling -> Handling runtime problems which occur in the program and would otherwise lead to program termination.
//Examples of exceptions: *running out of memory, *array out of bound, *condition like divided by zero.
//To handle this type of problem during program execution the technique of exception handling is used.
//Exception handling is a technique which handles the runtime problems and maintains the flow of program execution. -> It means
// the program may not execute what is expected but will not crash anymore.


//Throwable Class
//There are four different keywords used in exception handling. These are: *try, *catch, *finally, *throw
//try: the try block contains a set of statements which might generate an exception. It must be followed by either catch of finally or both.
//catch: the catch block is used to catch the exception throw from try block.
//finally: finally block always execute whether exception is handled or not. So it is used to execute important code statement. (like closing buffers)
//throw: the throw keyword is used to throw an exception explicitly.

//Unchecked Exception -> is that exception which is thrown due to mistakes in our code.
//This exception type extends the RuntimeException class.
//The Unchecked exception is checked at run time.

//Example of unchecked exception
//ArithmeticException: thrown when we divide a number by zero.
//ArrayIndexOutOfBoundExceptions: thrown when an array has been tried to access with incorrect index value.
//SecurityException: thrown by the security manager to indicate a security violation.
//NullPointerException: thrown when invoking a method or property on a null object.

//Checked Exception -> is checked at compile time.
//This exception type extends the Throwable class.

//Example of checked exceptions:
//IOException
//SQLException

//try-catch block is used for exception handling in the code.
//Syntax of try with catch block
try{
// code that may throw the exception
} catch(e.SomeExcetion){
//code that handles the exception
}


//Examples without exception handling:
val str = getNumber("10") //The variable 'str' is getting the int value of "10".
println(str)
fun getNumber(str:String): Int{
    return try{
        Integer.parseInt(str)
    }catch (e:ArithmeticException){
        0
    }
}// Output: 10

//Example with exception handling:
val str = getNumber("10.5") //The variable 'str' is getting the int value of "10.5".
println(str)
fun getNumber(str: String):Int{
    return try{
        Integer.parseInt(str)
    }catch(e.ArithmeticException){
        0
    }
} Output: 0



//Multiple catch block Examples
fun main(args: Array<String>){
    try{
        val a = IntArray(5)
        a[5] = 10/0
    }catch(e:ArithmeticException){
        println("Arithmetic exception catch")
    }catch (e:ArrayIndexOutOfBoundsException){
        println("Array Index out of bound exception")
    }catch (e:Exception){
        println("parent exception class")
    }
    println("code after try catch...")
}// Output: Arithmetic exception catch
//          code after try catch...

//Syntax of nested try block
..
        try{
    //code block
    try { //code block
    } catch (e: SomeException) {
        //exception
    }
} catch(e.SomeException){
    //exception
}
..

//Finally block
//finally block such block which is always executes whether exception is handled or not.
//It is used to execute important code statement.

//Finally block Example
fun main(arg: Array<String>){
    try{
        val data = 10/5
        println(data)
    }catch (e:NullPointerException){
        println(e)
    }finally {
        println("finally block always executes")
    }
    println("below code...")
}//Output:  2
//          finally block always executes
//          below code...

//throw keyword
//The throw keyword is used to throw an explicit exception.
//It is used to throw a custom exception.
//To throw an exception object we will use the throw-exception.
//Syntax of throw keyword:
throw SomeException()
 */
//throw example
fun main(arg: Array<String>){
    validate(15) //Another function
    println("code after validation check...")
}
fun validate(age: Int){
    if(age<18)
        throw ArithmeticException("under age")
    else
        println("eligible for drive")
} //Output: Exception in thread "main" java.lang.ArithmeticException: under age