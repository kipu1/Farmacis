/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacis;

import javax.accessibility.AccessibleContext;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS ROG
 */
public class Datos extends javax.swing.JFrame {

    /**
     * Creates new form Datos
     */
    public Datos() {
        initComponents();
    }

    public JRadioButton getCEMEFAR() {
        return CEMEFAR;
    }

    public void setCEMEFAR(JRadioButton CEMEFAR) {
        this.CEMEFAR = CEMEFAR;
    }

    public JRadioButton getCOFARMA() {
        return COFARMA;
    }

    public void setCOFARMA(JRadioButton COFARMA) {
        this.COFARMA = COFARMA;
    }

    public JRadioButton getEMPSEPHAR() {
        return EMPSEPHAR;
    }

    public void setEMPSEPHAR(JRadioButton EMPSEPHAR) {
        this.EMPSEPHAR = EMPSEPHAR;
    }

    public JCheckBox getPRINCIPAL() {
        return PRINCIPAL;
    }

    public void setPRINCIPAL(JCheckBox PRINCIPAL) {
        this.PRINCIPAL = PRINCIPAL;
    }

    public JCheckBox getSECUNDARIA() {
        return SECUNDARIA;
    }

    public void setSECUNDARIA(JCheckBox SECUNDARIA) {
        this.SECUNDARIA = SECUNDARIA;
    }

    public JComboBox<String> getTipom() {
        return Tipom;
    }

    public void setTipom(JComboBox<String> Tipom) {
        this.Tipom = Tipom;
    }

    public JButton getbOK() {
        return bOK;
    }

    public void setbOK(JButton bOK) {
        this.bOK = bOK;
    }

    public JButton getBcancelar() {
        return bcancelar;
    }

    public void setBcancelar(JButton bcancelar) {
        this.bcancelar = bcancelar;
    }

    public JButton getBenviar() {
        return benviar;
    }

    public void setBenviar(JButton benviar) {
        this.benviar = benviar;
    }

    public JTextField getCantidadm() {
        return cantidadm;
    }

    public void setCantidadm(JTextField cantidadm) {
        this.cantidadm = cantidadm;
    }

    public JLabel getDistribuidor() {
        return distrubuidoram;
    }

    public void setDistribuidor(JLabel distribuidor) {
        this.distrubuidoram = distribuidor;
    }

    public ButtonGroup getDistribuidora() {
        return distribuidoram;
    }

    public void setDistribuidora(ButtonGroup distribuidora) {
        this.distribuidoram = distribuidora;
    }

    public JDialog getjDialog1() {
        return muestra;
    }

    public void setjDialog1(JDialog jDialog1) {
        this.muestra = jDialog1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

   

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

//    public JLabel getjLabel7() {
//        return jLabel7;
//    }
//
//    public void setjLabel7(JLabel jLabel7) {
//        this.jLabel7 = jLabel7;
//    }
//
//    public JLabel getjLabel8() {
//        return jLabel8;
//    }
//
//    public void setjLabel8(JLabel jLabel8) {
//        this.jLabel8 = jLabel8;
//    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLbcantidad() {
        return lbcantidad;
    }

    public void setLbcantidad(JLabel lbcantidad) {
        this.lbcantidad = lbcantidad;
    }

    public JLabel getLbdireccion() {
        return lbdireccion;
    }

    public void setLbdireccion(JLabel lbdireccion) {
        this.lbdireccion = lbdireccion;
    }

    public JLabel getLbmedicamento() {
        return lbmedicamento;
    }

    public void setLbmedicamento(JLabel lbmedicamento) {
        this.lbmedicamento = lbmedicamento;
    }

    public JLabel getLbtipo() {
        return lbtipo;
    }

    public void setLbtipo(JLabel lbtipo) {
        this.lbtipo = lbtipo;
    }

    public JTextField getNombrem() {
        return nombrem;
    }

    public void setNombrem(JTextField nombrem) {
        this.nombrem = nombrem;
    }

    public JDialog getMuestra() {
        return muestra;
    }

    public void setMuestra(JDialog muestra) {
        this.muestra = muestra;
    }

    public ButtonGroup getDistribuidoram() {
        return distribuidoram;
    }

    public void setDistribuidoram(ButtonGroup distribuidoram) {
        this.distribuidoram = distribuidoram;
    }

    public JLabel getDistrubuidoram() {
        return distrubuidoram;
    }

    public void setDistrubuidoram(JLabel distrubuidoram) {
        this.distrubuidoram = distrubuidoram;
    }

   

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        distribuidoram = new javax.swing.ButtonGroup();
        muestra = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbmedicamento1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbdireccion2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        distrubuidoram1 = new javax.swing.JLabel();
        benviar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        lbdireccion3 = new javax.swing.JLabel();
        lbcantidad1 = new javax.swing.JLabel();
        distrubuidoram = new javax.swing.JLabel();
        lbcantidad = new javax.swing.JLabel();
        lbtipo = new javax.swing.JLabel();
        lbmedicamento = new javax.swing.JLabel();
        lbdireccion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tipom = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cantidadm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        COFARMA = new javax.swing.JRadioButton();
        EMPSEPHAR = new javax.swing.JRadioButton();
        CEMEFAR = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        PRINCIPAL = new javax.swing.JCheckBox();
        SECUNDARIA = new javax.swing.JCheckBox();
        bOK = new javax.swing.JButton();

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("unidades de");

        lbmedicamento1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbmedicamento1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Para la farmacia situada en la");

        lbdireccion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbdireccion2.setForeground(new java.awt.Color(0, 0, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Distribuidor ");

        distrubuidoram1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        distrubuidoram1.setForeground(new java.awt.Color(0, 0, 255));

        benviar.setText("Enviar");

        bcancelar.setText("Cancelar");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        lbdireccion3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbcantidad1.setBackground(new java.awt.Color(204, 255, 255));
        lbcantidad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbcantidad1.setForeground(new java.awt.Color(0, 0, 255));

        distrubuidoram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        distrubuidoram.setForeground(new java.awt.Color(0, 0, 255));

        lbcantidad.setBackground(new java.awt.Color(204, 255, 255));
        lbcantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbcantidad.setForeground(new java.awt.Color(0, 0, 255));

        lbtipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbtipo.setForeground(new java.awt.Color(0, 0, 255));

        lbmedicamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbmedicamento.setForeground(new java.awt.Color(0, 0, 255));

        lbdireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbdireccion.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distrubuidoram, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbmedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(lbdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(benviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bcancelar)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(184, 184, 184)
                            .addComponent(lbdireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbdireccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(lbcantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(249, 249, 249)
                                    .addComponent(distrubuidoram1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbmedicamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(87, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(distrubuidoram, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lbcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbmedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(benviar)
                    .addComponent(bcancelar))
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbcantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(distrubuidoram1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbmedicamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbdireccion3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(lbdireccion2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addContainerGap(215, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout muestraLayout = new javax.swing.GroupLayout(muestra.getContentPane());
        muestra.getContentPane().setLayout(muestraLayout);
        muestraLayout.setHorizontalGroup(
            muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        muestraLayout.setVerticalGroup(
            muestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(muestraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setText("DATOS DE FARMACIA");

        jLabel2.setText("Nombre del medicamento: ");

        nombrem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombremKeyPressed(evt);
            }
        });

        jLabel3.setText("Tipo de medicamento: ");

        Tipom.setEditable(true);
        Tipom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Analgésicos", "Antialérgicos", " Antidiarreicos y laxantes", "Antiinfecciosos" }));
        Tipom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipomActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad de producto: ");

        cantidadm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadmActionPerformed(evt);
            }
        });
        cantidadm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadmKeyPressed(evt);
            }
        });

        jLabel5.setText("Distribuidora farmaceutica: ");

        distribuidoram.add(COFARMA);
        COFARMA.setText("COFARMA");

        distribuidoram.add(EMPSEPHAR);
        EMPSEPHAR.setText("EMPSEPHAR");

        distribuidoram.add(CEMEFAR);
        CEMEFAR.setText("CEMEFAR");

        jLabel6.setText("Sucursal: ");

        PRINCIPAL.setText("PRINCIPAL");

        SECUNDARIA.setText("SECUNDARIA");

        bOK.setText("OK");
        bOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(PRINCIPAL)
                        .addGap(18, 18, 18)
                        .addComponent(SECUNDARIA))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nombrem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Tipom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cantidadm)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(COFARMA)
                                .addGap(18, 18, 18)
                                .addComponent(EMPSEPHAR)
                                .addGap(18, 18, 18)
                                .addComponent(CEMEFAR))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(bOK)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombrem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Tipom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cantidadm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(EMPSEPHAR)
                            .addComponent(CEMEFAR)
                            .addComponent(COFARMA)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(PRINCIPAL)
                            .addComponent(SECUNDARIA))))
                .addGap(75, 75, 75)
                .addComponent(bOK)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOKActionPerformed
// if(!validar_numeros(cantidadm.getText().trim())){
//            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
//        }
    }//GEN-LAST:event_bOKActionPerformed

    private void TipomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipomActionPerformed

    }//GEN-LAST:event_TipomActionPerformed

    private void cantidadmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadmActionPerformed


    }//GEN-LAST:event_cantidadmActionPerformed

    private void cantidadmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadmKeyPressed
char caracter= evt.getKeyChar();
if(Character.isLetter(caracter)){
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
}
    }//GEN-LAST:event_cantidadmKeyPressed

    private void nombremKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombremKeyPressed
        char caracter= evt.getKeyChar();
if(Character.isDigit(caracter)){
    evt.consume();
    JOptionPane.showMessageDialog(null, "Solo ingrese letras");
}
    }//GEN-LAST:event_nombremKeyPressed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcancelarActionPerformed
public static boolean validar_numeros(String datos){
    return datos.matches("[0-9]{1,3}");
}
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Datos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CEMEFAR;
    private javax.swing.JRadioButton COFARMA;
    private javax.swing.JRadioButton EMPSEPHAR;
    private javax.swing.JCheckBox PRINCIPAL;
    private javax.swing.JCheckBox SECUNDARIA;
    private javax.swing.JComboBox<String> Tipom;
    private javax.swing.JButton bOK;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton benviar;
    private javax.swing.JTextField cantidadm;
    private javax.swing.ButtonGroup distribuidoram;
    private javax.swing.JLabel distrubuidoram;
    private javax.swing.JLabel distrubuidoram1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbcantidad;
    private javax.swing.JLabel lbcantidad1;
    private javax.swing.JLabel lbdireccion;
    private javax.swing.JLabel lbdireccion2;
    private javax.swing.JLabel lbdireccion3;
    private javax.swing.JLabel lbmedicamento;
    private javax.swing.JLabel lbmedicamento1;
    private javax.swing.JLabel lbtipo;
    private javax.swing.JDialog muestra;
    private javax.swing.JTextField nombrem;
    // End of variables declaration//GEN-END:variables
}
