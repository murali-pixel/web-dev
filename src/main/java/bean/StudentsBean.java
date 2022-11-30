package bean;
/* A JavaBean is a specially constructed Java class written in the Java and coded according to the JavaBeans API specifications.

Following are the unique characteristics that distinguish a JavaBean from other Java classes:

It provides a default, no-argument constructor.
It should be serializable and that which can implement the Serializable interface.
It may have a number of properties which can be read or written.
It may have a number of "getter" and "setter" methods for the properties.

JavaBeans Properties:

A JavaBean property is a named attribute that can be accessed by the user of the object. The attribute can be of any Java data type, including the classes that you define.
A JavaBean property may be read, write, read only, or write only. JavaBean properties are accessed through two methods in the JavaBean's implementation class:


getPropertyName()

For example, if property name is firstName, your method name would be getFirstName() to read that property. This method is called an accessor.

setPropertyName()

For example, if property name is firstName, your method name would be setFirstName() to write that property. This method is called a mutator.

A read-only attribute will have only a getPropertyName() method, and a write-only attribute will have only a setPropertyName() method.
*/

public class StudentsBean implements java.io.Serializable {
  
	private static final long serialVersionUID = 1L;
	
    private String firstName = null;
    private String lastName = null;
    private int age = 0;

   public StudentsBean() {
   }
   public String getFirstName(){
      return firstName;
   }
   public String getLastName(){
      return lastName;
   }
   public int getAge(){
      return age;
   }
   public void setFirstName(String firstName){
      this.firstName = firstName;
   }
   public void setLastName(String lastName){
      this.lastName = lastName;
   }
   public void setAge(int age){
      this.age = age;
   }
}

/*

Accessing JavaBeans

The useBean action declares a JavaBean for use in a JSP. Once declared, the bean becomes a scripting variable that can be accessed by both scripting elements and other custom tags used in the JSP. The full syntax for the useBean tag is as follows:

<jsp:useBean id = "bean's name" scope = "bean's scope" typeSpec/>

Here values for the scope attribute can be a page, request, session or application based on your requirement. The value of the id attribute may be any value as a long as it is a unique name among other useBean declarations in the same JSP.
 
 
Accessing JavaBeans Properties

Along with <jsp:useBean...> action, you can use the <jsp:getProperty/> action to access the get methods and the <jsp:setProperty/> action to access the set methods. 

*/ 
