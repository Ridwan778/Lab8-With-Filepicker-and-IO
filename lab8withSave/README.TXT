PMethods To Know:

Unit Testing - (Tip - assertEquals can do everything that other methods can do)
1. assertTrue, assertFalse, assertEquals, assertNull, assertNotNull.

Switch(value){
Case-1(value):

Case-2(value):
…….
}
Enum
   In lab- 5 for complex version, lab 6 for simple version
   //simple enum with no values
   Public enum days{
    SATURDAY,SUNDAY, …
   }

   //instance of an enum
   days d = days.SATURDAY;

SubClasses(not abstract):
extends - subclasses, abstract classes and exceptions

Super:
1. super(author) in constructor
2. super.getDetails()
3. Overriding and overloading methods

Abstract:
1. Protected methods(only for subclasses nothing else)
2. Abstract class cannot be made an instance of
3. Abstract method needs to code but its child has to provide an version that does something.

CLASS - public abstract class Animal

METHOD - abstract public void act(List<Animal> newAnimals);

Error:
1. Checked and unchecked exception
2. Throws in method name
3. Try catch
4. Multiple catch for a single try

public class myException extends RuntimeException {
  
  public myException()
    {
        super(" Exception Caught ");
    }


GUI:
JFrame - 
ContentPane-
FilePicker/FileChooser-
JButton -
Timer - 