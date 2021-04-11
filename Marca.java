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
public class Marca {
    
     public double IngresarMarca(){
        int menu;
                        
        Vehiculo leerDato = new Vehiculo();
        menu = leerDato.leerDatoTipoEntero("Ingrese la marca del vehiculo que desee."+"\n"+"1. Ford"+"\n"+"2. Nissan"+"\n"+"3. Lamborghini"+"\n"+"4. Ferrari "+"\n"+"5. Tesla "+"\n"+"6. Audi "+"\n"+"7. Porsche ");
        
       return 0;
    }

}
