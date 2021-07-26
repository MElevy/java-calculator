package com.calculator;
import java.util.Scanner;
public class calc {
  public static void main (String[] args){
    /*Scanner scan=new Scanner(System.in);
    Scanner sc=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);*/
    int b;int a;String c;
    int d=1;
    while (d==1){
      Scanner scan=new Scanner(System.in);
      Scanner sc=new Scanner(System.in);
      Scanner sc2=new Scanner(System.in);
      System.out.print("enter a number:");
      a=scan.nextInt();
      System.out.print("enter another number:");
      b=sc2.nextInt();
      System.out.print("valid operations are:mul, div, add, sub and exit:");
      c=sc.nextLine();
      switch (c){
        case "mul":{
         System.out.println(a*b);
         break; 
        }case "div":{
          System.out.println(a/b);
          break;
        }case "add":{
          System.out.println(a+b);
          break;
        }case "sub":{
          System.out.println(a-b);
          break;
        }case "exit":{
          scan.close();
          sc.close();
          sc2.close();
          d=2;
          break;
        }
      }
      sc.close();
      scan.close();
      sc2.close();
    }
  }
}