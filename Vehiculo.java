/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividaad7;

import javax.swing.JOptionPane;
/**
 *
 * @author ximena
 */
public class Vehiculo {
    
    
    private String Marca;
    private String Linea;
    private int Modelo;
    private double Impuesto;

    public Vehiculo() {
    }

    public Vehiculo(String Marca, String Linea, int Modelo, double Impuesto) {
        this.Marca = Marca;
        this.Linea = Linea;
        this.Modelo = Modelo;
        this.Impuesto = Impuesto;
        
    }

    //Metodos de encapsulamiento
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public String getLinea() {
        return Linea;
    }
    public void setLinea(String Linea) {
        this.Linea = Linea;
    }
    public int getModelo() {
        return Modelo;
    }
    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }
    public double getImpuesto() {
        return Impuesto;
    }
    public void setImpuesto(double Impuesto) {
        this.Impuesto = Impuesto;
    }
    
    public String leerDatoTipoCadena (String mensaje){
            String valor = "";
            valor = JOptionPane.showInputDialog(null,mensaje);
            return (valor);
    }
    
    public int leerDatoTipoEntero (String mensaje){
            int valor = 0;
            try{
                valor = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
                return (valor);
            }
            catch (Exception errorIngreso){
                errorIngreso.printStackTrace();
                return (0);
            }
    }

    


    
}


