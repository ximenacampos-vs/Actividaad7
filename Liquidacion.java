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
import javax.swing.JOptionPane;

public class Liquidacion {
    
    double valorComercial;
    double montoMarca;
    double montoLinea;
    double montoModelo;

    public double getMontoMarca() {
        return montoMarca;
    }
    public void setMontoMarca(double montoMarca) {
        this.montoMarca = montoMarca;
    }
    public double getMontoLinea() {
        return montoLinea;
    }
    public void setMontoLinea(double montoLinea) {
        this.montoLinea = montoLinea;
    }
    public double getMontoModelo() {
        return montoModelo;
    }
    public void setMontoModelo(double montoModelo) {
        this.montoModelo = montoModelo;
    }
    public double getValorComercial() {
        return valorComercial;
    }
    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }
    
    public void solicitarDatos(){
        Liquidacion nuevoCarro = new Liquidacion();
        
        Marca ob1 = new Marca();
        Linea ob2 = new Linea();
        Modelo ob3 = new Modelo();
    
        double montoMarca = ob1.IngresarMarca();
        double montoLinea = ob2.IngresarLinea();
        double montoModelo = ob3.IngresarModelo();
        
        nuevoCarro.setMontoMarca(montoMarca);
        nuevoCarro.setMontoLinea(montoLinea);
        nuevoCarro.setMontoModelo(montoModelo);
        
        double valorComercial = calcularLiquidacion();
                
        nuevoCarro.setValorComercial(valorComercial);
    }
    
    public double calcularLiquidacion(){            
        valorComercial = montoMarca + montoLinea + montoModelo;
        
        return valorComercial;
    }
    
    public void mostrarLiquidacion(){                          
        
        Descuento descuento = new Descuento();
        descuento.definirDescuento();
                
    }
        
}

