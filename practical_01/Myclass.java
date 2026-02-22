import java.util.*;
class MyClass {

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter value for a : ");

int a=sc.nextInt();


System.out.println("Enter value for b : ");

int b=sc.nextInt();


System.out.println("Enter value for c : ");

int c=sc.nextInt();

System.out.println("Enter value for d : ");

int d=sc.nextInt();

int expresion = a + b * c % d;


System.out.println("Result of expession a + b * c % d : " +expresion);



}

}
