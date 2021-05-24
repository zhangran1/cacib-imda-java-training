# cacib-imda-java-training
CACIB IMDA Java training demo source code

This repository stores reference source code for CACIB IMDA training.

Please use JDK 11 to test this repository.


### Q&A
Q1. What is MVC
Answer: MVC stands for Model View Controller, it is a web development architecture pattern.
Model: Dealing with data related
View: Presentation layer eg whatever you may see from browser
Controller: It use to process business logic.
References:
https://www.tutorialspoint.com/mvc_framework/mvc_framework_introduction.htm

Q2: Can the method parameter type different from the method signature?
Answer: Yes, the method signature type is not directly associate with method parameter.

Q3: How to autobox long to int type?
Answer: When converting between long with int, Java is using type cast instead of autoboxing.

public class LongToIntExample1{  
public static void main(String args[]){  
long l=500;  
int i=(int)l;  
System.out.println(i);  
}}  

public class LongToIntExample2{  
public static void main(String args[]){  
Long l= new Long(10);  
int i=l.intValue();  
System.out.println(i);  
}}  

Reference: 
https://www.javatpoint.com/java-long-to-int

Q4. Distinction between jar, war, class, java files?
Answer: 
.java file: Java source code. It is use to store the program we are written in Java. 

.class file: It is a complied .java file. After we use javac complie .java file, the output will be complile code with .class file. We will be able to use java to execute .class file.

jar(java archive files): It is an archive file includes Java compiled file, Meta data etc.  jar file can be deployed in a specific operating system/container and run by Java Runtime Environment(JRE). For example after we are getting complied "demo.jar" file. We may use the following command to run:
"java -jar demo.jar"

war(web application resources): A file use to distribute the resources like Jar, JSP, xml and other resource. The war file need to be deployed in to a web server to run.

We may run jar file with JRE, we need to run war file with a web server.

Q5: Flow of compilation in Java IDE?
Answer: For simple program demoed during the training course, IDE performed two steps when you click run the program:
Step 1: use javac compile the code to generate the .class file
Step 2: use java to execute the complied code


Q6: What's the difference between pass-by-values, and pass-by-reference?
Answer: 
Java is always Pass-by-Value. However, the context changes depending upon whether we're dealing with Primitives or Objects:

For Primitive types, parameters are pass-by-value
For Object types, the object reference is pass-by-value

Reference: https://www.baeldung.com/java-pass-by-value-or-pass-by-reference

Q7: What are metadata:
Answer: It is the data describe other data. 
Reference: https://en.wikipedia.org/wiki/Java_Metadata_Interface

Q8: Should your variable always be private:
Answer: It is depends on the use cases.  

For ease of access purpose, some constant values may be store in a specific class and declare with final, it will allow other program to access it. 

For a class dealing with personal data like "date of birth", the data shall not be easily accessible from external program. In this recommended to declare the variable as private and control accessibility via getters.
 
