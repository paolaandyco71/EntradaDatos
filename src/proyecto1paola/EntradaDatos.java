/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1paola;
import java.util.Scanner;//Esta libreria toma los datos que digita el usuario por consola PASO 1*/

/**
 *
 * @author LAB03
 */
public class EntradaDatos {
    
    public static void main(String[]arg)
            
    {
        //Aqui estamos creando el objeto escaner - PASO 2
        //Este objeto solo se crea una vez.
        Scaner sc=new Scaner(System.in);//se crea el lector
        
        //Pedimos los datos al usuario - PASO 3
        
        
        System.out.println("Por favor ingrese un nombre");
        
        //Se lee el nombre y se almacena - PASO 4
        String nombre=sc.nextLine();
        
        //Procesamos los detos del usuario,en este caso,lo imprimimos
         System.out.println("Bienvenido"+nombre+"Por favor digite su edad");
         int edad=sc.nextLine();
         System.out.println("Usted tiene "+edad+"años");
         
        
        
       
        
        
                
                
        
       
       
    }
            
            
           
            
            
            
    {
        
    }
    
}
