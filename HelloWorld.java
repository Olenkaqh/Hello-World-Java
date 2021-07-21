/* 
This programs prints Hello, World! when executed
Main method must be inside class in order for the class to run as a program
main is public static void 
public - means methods can be access by anyone
static - means method belongs to the class not the object(Global)
void - no return type for method

 */

 /********COMPILE *********/
 /*in command line find location of file 
    command: javac HelloWorld.java
    this command will allow to compile java class
    creates class file that contains class code or byte code
 */
 /********RUN PROGRAM *********/
    /* 
    to get the output of the program we use the name of the file
    command: java HelloWorld
    result: Hello, World!
    */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    } //end of main 
} //end of HelloWorld class