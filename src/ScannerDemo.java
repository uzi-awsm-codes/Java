import java.util.Scanner;

public class ScannerDemo {

public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
int a,b,c;
String str1,str2;
char ch;
System.out.println("Enter 2 numbers");
a=scanner.nextInt();
b=scanner.nextInt();
System.out.println("Enter a word");
str1=scanner.next();
System.out.println("Enter a character");
ch=scanner.next().charAt(0);
scanner.nextLine();
System.out.println("Enter a sentence");
str2=scanner.nextLine();
c=a+b;
System.out.println("Sum ="+c);
System.out.println("String ="+str1);
System.out.println("Line ="+str2);
System.out.println("char ="+ch);
scanner.close();

}

}










