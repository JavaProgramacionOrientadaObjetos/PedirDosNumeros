/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;
/**
 *
 * @author alejandro
 */
 
 
 
public class Numeros {
    

    public static void main(String args[]) {
      
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        boolean resultado= true;
        
        
       

        System.out.println("Ingrese el primer número entre 0 y 20 ");
        a=sc.nextInt();
        System.out.println(" primer numero: " + a);
        
        
         System.out.println("Ingrese el segundo número entre 0 y 20 ");
            b=sc.nextInt();
         System.out.println(" segundo numero: " + b);
        
        if(a<0 || a > 20){
        
            resultado = false;
        }
   
        else if(b<0 || b > 20){
        
            resultado = false;
        }
        
        else{
        
            resultado=true;
        
        }
        
        
        if(resultado==true){
        
         if (a>b)
        System.out.println ("El mayor es: "+a);
        if (a<b)
        System.out.println ("El mayor es: "+b);
             if
           (a==b) 
              System.out.println ("Los números son iguales.");
   
        }
        else {
        
        
            System.out.println("alguno de los valores es un dato no valido \n por lo tanto el programa se cerrara");
        
            System.exit(0);
        }
  
        
        /*
do
{
       
        
        resultado=true;
        if (a>20)
        
        if (a<0)
        resultado=false;
        if (! resultado)
        System.out.println("Incorrecto");
        
    }
    while
        (! resultado);



          System.out.println("Ingrese un número");
          b=sc.nextInt();
        resultado=true; 
        if (b>20)
        resultado=false;
        if (b<0)
        resultado=false;
        if (! resultado)
        System.out.println("Incorrecto");
        if (a > 0 && b > 0 )
                if (a > 20 && b > 20) {
        } else {
        
                    
                    
    if (a>b)
        System.out.println ("El mayor es: "+a);
    if (a<b)
        System.out.println ("El mayor es: "+b);
    if
           (a==b) 
              System.out.println ("Los números son iguales.");
        }
    

*/
        }
}
    
    
    
    
    
    
    
    

