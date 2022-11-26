
//1 none@gmail.com  	password = 4321
//2 java@gmail.com	password = 4321
//3 chandio@gmail.com   password = 4321
//4 mehdi@gmail.com     pas =      4321
//5 hello@gmail.com     password = 4321

import java.util.*;
class Email{
public static void main(String[]arg){
String email, pwd;
System.out.print("\nEnter your email:");
Scanner obj=new Scanner(System.in);
email=obj.nextLine();
System.out.print("Enter your password:");
pwd=obj.nextLine();
if (email.equals("none@gmail.com")&&(pwd.equals("4321")))
{
System.out.println("Your Email has open");
System.out.println("Your Email is ready");
System.out.println("My email address is none@gmail.com");
}

else if (email.equals("java@gmail.com")&&(pwd.equals("4321"))){
System.out.println("welcome to your screen");
}
else if (email.equals("Pakistan@gmail.com")&&(pwd.equals("4321")))
{
System.out.println("My name is ibrahim Samoon");
System.out.println("My e-mail address is ibrahimsamo938@gmail.com");
}
else if (email.equals("ibrahimsamo938@gmail.com")&&(pwd.equals("4321")))
{
System.out.println("Welcome to screen");
System.out.println("My name is Ali");
}
else if (email.equals("hello@gmail.com")&&(pwd.equals("4321")))
{
System.out.println("Thatta");
System.out.println("This is my Email");
}
else
{
System.out.print("wrong email or password");}
}}




