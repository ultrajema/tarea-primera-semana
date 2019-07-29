/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento.pkg1;

/**
 *
 * @author Carrillo
 */
public class Intento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.print("gemita bonito");
       String direccion = "moyuta";
       int numero = 57570335;
      // System.out.print("su direccion es " + direccion + "su numero telefonico es " + numero);
       
      String[] english = {" hello","hello","hello","hello","hello","hello","hello","hello","hello","hello"};

        for(int i=0;i<english.length; i++)
        {
            //System.out.print(english[i]);
        }
       String[] clases = {" matematica 9 am", "idioma 10 am","ciencias sociales 11 am"};
       for (int u=0; u<clases.length; u++){
           //System.out.print(clases[u]);
       }
       for(int i = 1; i<=9; i++){
            //Espacios en blanco
            for(int f = 1; f<=9-i; f++){
               // System.out.print(" ");
            }
 
            //Asteriscos
            for(int a=1; a<=(i*2)-1; a++){
               // System.out.print("*");
            }
           // System.out.println();
        }
       for(int l = 0, g = (9*2)-1; g>0; l++, g -= 2){

            //Espacios en blanco
            for(int j=0; j < l; j++){
                //System.out.print(" ");
            }

            //Asteriscos
            for(int j=g; j > 0; j--){
                //System.out.print("*");
            }
           // System.out.println();
        }
       int x = 144;
       int y = 999;
       
       System.out.print(x+y);
       //System.out.print(x-y);
       //System.out.print(x*y);
       //System.out.print(x/y);
    }
   int quetzales = 350;
            //float euros = 0,12f;
}
