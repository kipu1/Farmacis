/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ASUS ROG
 */
public class medicamentos extends Listamedicamento {
    public ArrayList<Listamedicamento> listmed = new ArrayList<>();

    public medicamentos() {
    }

    public medicamentos(String nombrem, String Tipom, String cantidadm, String distrubuidoram, String sucursalm) {
        super(nombrem, Tipom, cantidadm, distrubuidoram, sucursalm);
    }

    public void setMedicina(String nombrem, String Tipom, String cantidadm, String distrubuidoram, String sucursalm){
        
        Listamedicamento medicamento = new Listamedicamento();
        medicamento.setNombrem(nombrem);
        medicamento.setTipom(Tipom);
        medicamento.setCantidadm(cantidadm);
        medicamento.setDistrubuidoram(distrubuidoram);
        medicamento.setSucursalm(sucursalm);
        
        listmed.add(medicamento);
    }
    
  
}

