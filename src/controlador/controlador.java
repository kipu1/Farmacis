/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import farmacis.Datos;
import javax.swing.JOptionPane;
import modelo.medicamentos;

/**
 *
 * @author ASUS ROG
 */
public class controlador {
    private medicamentos modelo;
    private Datos dato;

    public controlador(medicamentos modelo, Datos dato) {
        this.modelo = modelo;
        this.dato = dato;
        dato.setVisible(true);
        dato.setLocationRelativeTo(null);
    }

    public void inicioControl(){
        dato.getbOK().addActionListener(l -> abrir());
        dato.getBenviar().addActionListener(l -> crear());
        dato.getBcancelar().addActionListener(l -> cerrar());
    }
    
     public void crear(){
        medicamentos medicamento = new medicamentos();
        
        String nombrem = dato.getNombrem().getText();
        String tipom = dato.getTipom().getSelectedItem().toString();
        String cantidadm = dato.getCantidadm().getText();
        String distribuidoram;
        if(dato.getCOFARMA().isSelected()){
                distribuidoram="COFARMA";
            }else if(dato.getEMPSEPHAR().isSelected()){
                distribuidoram="EMPSEPHAR";
            }else{
                distribuidoram="CEMEFAR";
            }
        
        String sucursal = null;
        if(dato.getPRINCIPAL().isSelected()){
            sucursal="Calle de la Rosa n.28";
        }else 
        {
            sucursal ="Calle Alcazabilla n.3";
        }
        
        medicamento.setNombrem(nombrem);
        medicamento.setTipom(tipom);
        medicamento.setCantidadm(cantidadm);
        medicamento.setDistrubuidoram(distribuidoram);
        medicamento.setSucursalm(sucursal);
       
        
        try {
            medicamento.setMedicina(nombrem, tipom, cantidadm, distribuidoram, sucursal);
            JOptionPane.showMessageDialog(null, "Pedido enviado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       limpiar();
    }
    
   
   private void abrir() {
        if (validar()==true) {
       
            String distribuidoram;
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente","INFORMATION_MESSAGE" ,JOptionPane.INFORMATION_MESSAGE); 

           if(dato.getCOFARMA().isSelected()){
                distribuidoram="COFARMA";
            }else if(dato.getEMPSEPHAR().isSelected()){
                distribuidoram="EMPSEPHAR";
            }else{
                distribuidoram="CEMEFAR";
            }
        
            
            dato.getMuestra().setVisible(true);
            dato.getMuestra().setSize(800, 500);
            dato.getMuestra().setLocationRelativeTo(dato);
//         
            Enviar();

        } 
       
    }
    public void Enviar(){

            String nombre = dato.getNombrem().getText();
            String tipo = dato.getTipom().getSelectedItem().toString();
            String cantidad = dato.getCantidadm().getText();
            String distribuidoram;
            if(dato.getCOFARMA().isSelected()){
                distribuidoram="COFARMA";
            }else if(dato.getEMPSEPHAR().isSelected()){
                distribuidoram="EMPSEPHAR";
            }else{
                distribuidoram="CEMEFAR";
            }
            
            String sucursal;
            if(dato.getPRINCIPAL().isSelected()){
                sucursal="Calle de la Rosa n. 28";
            }else{
                sucursal ="Calle Alcazabilla n. 3";
            }
            dato.getLbcantidad().setText(cantidad);
            dato.getLbtipo().setText(tipo);
            dato.getLbmedicamento().setText(nombre);
            dato.getLbdireccion().setText(sucursal);
            dato.getDistrubuidoram().setText(distribuidoram);
                 
        }

   public boolean validar(){
        boolean validar=true;
       if(dato.getNombrem().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un nombre ","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);
            validar=false;
        } 
        if(dato.getTipom().getSelectedIndex()==0){
            System.out.println("Seleccione una opcion");
            JOptionPane.showMessageDialog(null, "Ingrese un Tipo de medicamento","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);
            validar=false;
          
        }
        if(dato.getCantidadm().getText().isEmpty() ){
           
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);
            validar=false;
            
        }
          if(!dato.getCantidadm().getText().matches("[0-9]+")){
          JOptionPane.showMessageDialog(null, "Ingrese numero positivos","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);
            validar=false;
      }
        if(dato.getCEMEFAR().isSelected()==false && dato.getCOFARMA().isSelected()==false && dato.getEMPSEPHAR().isSelected()==false){
          JOptionPane.showMessageDialog(null, "Elija una distribuidora","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);
            validar=false;  
        }
        if(dato.getPRINCIPAL().isSelected()==false && dato.getSECUNDARIA().isSelected()==false){
          JOptionPane.showMessageDialog(null, "Elija una sucursal","ERROR_MESSAGE" ,JOptionPane.ERROR_MESSAGE);
            validar=false;  
        }
    
        return validar;
    }
//   public static boolean validar_numeros(String datos){
//    return datos.matches("[0-9]{1,3}");
//} 
  private void limpiar(){
       dato.getNombrem().setText("");
      dato.getTipom().setSelectedIndex(0);
       dato.getCantidadm().setText("");
    dato.getDistribuidoram().clearSelection();
    dato.getPRINCIPAL().setSelected(false);
    dato.getSECUNDARIA().setSelected(false);
    
     }
   public void cerrar(){
        limpiar();
        dato.getMuestra().dispose();
    }
}   