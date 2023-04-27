/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ASUS ROG
 */
public class Listamedicamento {   
    private String nombrem; 
    private String Tipom; 
    private String cantidadm; 
    private String distrubuidoram; 
    private String sucursalm;

    public Listamedicamento() {
    }

    public Listamedicamento(String nombrem, String Tipom, String cantidadm, String distrubuidoram, String sucursalm) {
        this.nombrem = nombrem;
        this.Tipom = Tipom;
        this.cantidadm = cantidadm;
        this.distrubuidoram = distrubuidoram;
        this.sucursalm = sucursalm;
    }

    public String getNombrem() {
        return nombrem;
    }

    public void setNombrem(String nombrem) {
        this.nombrem = nombrem;
    }

    public String getTipom() {
        return Tipom;
    }

    public void setTipom(String Tipom) {
        this.Tipom = Tipom;
    }

    public String getCantidadm() {
        return cantidadm;
    }

    public void setCantidadm(String cantidadm) {
        this.cantidadm = cantidadm;
    }

    public String getDistrubuidoram() {
        return distrubuidoram;
    }

    public void setDistrubuidoram(String distrubuidoram) {
        this.distrubuidoram = distrubuidoram;
    }

    public String getSucursalm() {
        return sucursalm;
    }

    public void setSucursalm(String sucursalm) {
        this.sucursalm = sucursalm;
    }
                                  


                                                                                                                                                                                                      
}
 


