import java.util.*;


class MyClass {

public static void main(String[] args){


Scanner sc = new Scanner(System.in);

System.out.print("Enter your name : ");

String name =sc.nextLine();


System.out.print("Enter marks of English : ");

int english =sc.nextInt();


System.out.print("Enter marks of math ");

int math =sc.nextInt();


int total = english+math;

System.out.println("Total marks : "+total);


int avg = total/2;

System.out.println("Average marks of " +name+ " is : "+avg);


}

}
