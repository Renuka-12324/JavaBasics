public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        //string length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());

//string methods
String txt1 = "Hello World";
System.out.println(txt1.toUpperCase());   
System.out.println(txt1.toLowerCase()); 

//string concatination
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
System.out.println(firstName.concat(lastName));

      }
}
