
package com.mycompany.calcularsalario;
import java.util.Scanner;
public class Calcularsalario {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op1,op2,op3,op4,op5,r;
        System.out.print("ingresa salario: ");
        op1=leer.nextInt();
        System.out.print("ingresa salario: ");
        op2=leer.nextInt();
        System.out.print("ingresa salario: ");
        op3=leer.nextInt();
        System.out.print("ingresa salario: ");
        op4=leer.nextInt();
        System.out.print("ingresa salario: ");
        op5=leer.nextInt();
        r=op1+op2+op3+op4+op5;
        System.out.println("el total es: "+r);
    }
}
