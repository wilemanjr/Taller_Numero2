/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleresjava_c1;

import java.util.Scanner;

/**
 *
 * @author wilson manjarres
 */
public class TalleresJava_C1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        while(opc != 6){
            System.out.println("Ejercicio 1.");
            System.out.println("Ejercicio 2.");
            System.out.println("Ejercicio 3.");
            System.out.println("Ejercicio 4.");
            System.out.println("Ejercicio 10.");
            System.out.println("Salir 6.");
            System.out.print("Digite la opcion que desea realizar: ");
        opc = entrada.nextInt();
        switch(opc){
            case 1: enteros(5,2);
            break;
            case 2: System.out.print("Digite el primer numero: ");
            int a = entrada.nextInt();
            System.out.print("Digite el segundo numero: ");
            int b = entrada.nextInt();
            DosEnteros(a,b);
            break;
            case 3: System.out.print("Digite el primer numero: ");
            double a1 = entrada.nextDouble();
            System.out.print("Digite el segundo numero: ");
            double b1 = entrada.nextDouble();
            System.out.print("Digite el tercer numero: ");
            double c = entrada.nextDouble();
            ValDecimal(a1,b1,c);
            break;
            case 4: System.out.print("Digite el radio de la circunferencia: ");
            double radio = entrada.nextDouble();
            ACircunferencia(radio);
            break;
            case 10: System.out.print("Digite el peso en kilogramos: ");
            double kilo = entrada.nextDouble();
            ConverPeso(kilo);
            break;
            case 6: System.exit(0);
            break;
            default: System.out.println("Error, digite nuevamente la opcion.");
        
        }
        
        }
    }
    
    public static void enteros (int num1, int num2){
        System.out.printf("x=%d\n",num1);
        System.out.printf("El valor de %d + %d es %d\n",num1,num1,(num1+num1));
        System.out.printf("x=%d\n",num1);
        System.out.printf("%d - %d\n",(num1+num2),(num2+num1));
    }
    
    public static void DosEnteros(int a, int b){
        System.out.printf("La suma de %d + %d = %d\n",a,b,(a+b));
        System.out.printf("El producto de %d * %d = %d\n",a,b,(a*b));
        System.out.printf("La resta de %d - %d = %d\n",a,b,(a-b));
    }
    
    
    public static void ValDecimal(double a1, double b1, double c){
        System.out.printf("La suma de %.2f + %.2f + %.2f = %.2f\n",a1,b1,c,(a1+b1+c));
        System.out.printf("El promedio de %.2f , %.2f , %.2f = %.2f\n",a1,b1,c,((a1+b1+c)/3));
        System.out.printf("El producto de %.2f * %.2f * %.2f = %.2f\n",a1,b1,c,(a1*b1*c));
        System.out.printf("El cociente de %.2f / %.2f / %.2f = %.2f\n",a1,b1,c,(a1/b1/c));
        System.out.printf("El modulo de %.2f , %.2f , %.2f = %.2f\n",a1,b1,c,(a1%b1%c));
    
    }

    public static void ACircunferencia(double radio) {
        System.out.printf("La longitud de la circunferencia es: %.2f\n",2*3.1416*radio);
        System.out.printf("El area de la circunferencia es: %.2f\n",3.1416*(radio*radio));
    }

    public static void ConverPeso(double kilo) { 
        System.out.printf("%.2f kilos son %.2f gramos\n",kilo,kilo*1000);
        System.out.printf("%.2f kilos son %.2f libras\n",kilo,kilo*2.20462);
        System.out.printf("%.2f kilos son %.2f toneladas\n",kilo,kilo*0.001);
    }
}
