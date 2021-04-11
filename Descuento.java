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
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Descuento {
    
    public void definirDescuento(){
        Vehiculo impuestoo = new Vehiculo();
        double impuestoFinal = impuestoo.calcularImpuesto();
        String nombreCliente;
        double costoPorCarro, descuento, total;
        int  cantidadCarros, porcentajeDescuento, tipoCliente, valorVehiculo;
        
        DecimalFormat formatter = new DecimalFormat("#,###");
        
        nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");
        
        tipoCliente = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el tipo de cliente"+"\n"+" 1. Cancelo el vehiculo a tiempo "+"\n"+" 2. Es de servicio publico "+"\n"+" 3. Trasladado de cuenta "+"\n"+" 4. las 3 opciones")
        );
        
         valorVehiculo = Integer.parseInt(
            JOptionPane.showInputDialog(null," 1. Costo Ford: 58.490.000 "+"\n"+" 2. Costo Nissan: 142.000.000 "+"\n"+" 3.  Costo Lamborghini: 233.692.515 "+"\n"+" 4. Costo Ferrari: 334.137.328 "+"\n"+" 5. Costo Tesla: 245.000.000 "+"\n"+" 6. Costo Audi: 142.000.000 "+"\n"+" 7. Costo Porsche: 180.000.000")
        );
         
        cantidadCarros = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Ingrese el número de vehiculos que se llevara:")
        );
        
        
        costoPorCarro = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Ingrese el precio por el auto: ")
        );
        
        
        switch(tipoCliente){
            case 1:
                porcentajeDescuento =5;
                break;
            case 2:
                porcentajeDescuento = 6;
                break;
            case 3:
                porcentajeDescuento = 3;
                break;
             case 4:
                porcentajeDescuento = 11;
                break;
            default:
                porcentajeDescuento = 0;
                break;
        }
        
         total = (cantidadCarros * costoPorCarro);
        descuento = (total * porcentajeDescuento) / 100;
        
        JOptionPane.showMessageDialog(
            null, 
            "Factura a nombre de: " + nombreCliente + "\n"
            + "Tipo de cliente: " + tipoCliente + "\n"
            + "Total de carros: " + cantidadCarros + "\n"
            + "Costo por carro: $" + formatter.format(costoPorCarro) + "\n"
            + "Subtotal: $" + formatter.format(total) + "\n"
            + "Descuento: - $" + formatter.format(descuento) + "\n"
            + "Total a pagar: $" + formatter.format(total - descuento)
        );
        
    
    }

   

}

