/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacis;

import controlador.controlador;
import modelo.medicamentos;

/**
 *
 * @author ASUS ROG
 */
public class Farmacis {
 public static void main(String[] args) {
      Datos dato = new Datos();
        medicamentos modelo = new medicamentos();
        controlador controladorm =new controlador(modelo, dato);
        controladorm.inicioControl();
    }
}
