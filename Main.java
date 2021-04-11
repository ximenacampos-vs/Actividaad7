/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividaad7;

/**
 *
 * @author ximena
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
           Main main = new Main(); 
        
        main.mostrar();       
    }
    
    public void mostrar(){
        Liquidacion mostrar = new Liquidacion(); 
        //Carro mostrar1 = new Carro();
                
        mostrar.solicitarDatos();
        mostrar.mostrarLiquidacion();
    }

       
    }
    


