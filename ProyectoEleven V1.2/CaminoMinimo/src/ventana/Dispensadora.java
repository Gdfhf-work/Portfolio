/*
 * Autor: MCS Solutions
 * Localidad: Mazatlan, Sinaloa, Mexico
 * Fecha: 27/10/2022
 */
package ventana;

import java.awt.Font;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import javax.swing.JFrame;
import objetos.Billete;
import operaciones.Modelo;

public class Dispensadora extends javax.swing.JFrame {
    
    private Modelo modelo;
    
    public Dispensadora() {
        initComponents();
        ArrayList<Billete> cantidadBilletes = new ArrayList();
    
        //Importando los valores de billetes
        //Y la cantidad que se tiene
        cantidadBilletes.add(new Billete(100, 5));
        cantidadBilletes.add(new Billete(50, 4));
        cantidadBilletes.add(new Billete(20, 2));
        cantidadBilletes.add(new Billete(10, 10));
        cantidadBilletes.add(new Billete(5, 10));
        cantidadBilletes.add(new Billete(2, 10));
        cantidadBilletes.add(new Billete(1, 50));
        //Importando los datos de los billetes al modelo
        modelo = new Modelo(cantidadBilletes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Round_JWC4 = new swing.Panel_Round_JWC();
        panel_Round_JWC1 = new swing.Panel_Round_JWC();
        img_Autosize_JWC1 = new swing.Img_Autosize_JWC();
        panel_Round_JWC2 = new swing.Panel_Round_JWC();
        cambioText1 = new javax.swing.JLabel();
        panel_Round_JWC3 = new swing.Panel_Round_JWC();
        cambioText2 = new javax.swing.JLabel();
        panel_Round_JWC5 = new swing.Panel_Round_JWC();
        cambioText3 = new javax.swing.JLabel();
        panel_Round_JWC6 = new swing.Panel_Round_JWC();
        cambioText4 = new javax.swing.JLabel();
        panel_Round_JWC7 = new swing.Panel_Round_JWC();
        cambioText5 = new javax.swing.JLabel();
        panel_Round_JWC8 = new swing.Panel_Round_JWC();
        cambioText7 = new javax.swing.JLabel();
        panel_Round_JWC10 = new swing.Panel_Round_JWC();
        cambioText6 = new javax.swing.JLabel();
        panel_Round_JWC9 = new swing.Panel_Round_JWC();
        cambioRegresado = new javax.swing.JLabel();
        btnCobrar = new swing.Btn_Round_JWC();
        ingresoDinero = new javax.swing.JTextField();
        img_Autosize_JWC2 = new swing.Img_Autosize_JWC();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ingresoMoneda = new javax.swing.JTextField();
        btnMoneda = new swing.Btn_Round_JWC();
        btn_Salir = new swing.Btn_Round_JWC();

        panel_Round_JWC4.setBackground(new java.awt.Color(255, 255, 255));
        panel_Round_JWC4.setEsqInferiorDerecha(75);
        panel_Round_JWC4.setEsqSuperiorDerecha(75);

        javax.swing.GroupLayout panel_Round_JWC4Layout = new javax.swing.GroupLayout(panel_Round_JWC4);
        panel_Round_JWC4.setLayout(panel_Round_JWC4Layout);
        panel_Round_JWC4Layout.setHorizontalGroup(
            panel_Round_JWC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panel_Round_JWC4Layout.setVerticalGroup(
            panel_Round_JWC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_Round_JWC1.setBackground(new java.awt.Color(0, 52, 90));

        img_Autosize_JWC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.png"))); // NOI18N

        panel_Round_JWC2.setBackground(new java.awt.Color(255, 255, 255));
        panel_Round_JWC2.setEsqInferiorDerecha(75);
        panel_Round_JWC2.setEsqSuperiorDerecha(75);

        cambioText1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout panel_Round_JWC2Layout = new javax.swing.GroupLayout(panel_Round_JWC2);
        panel_Round_JWC2.setLayout(panel_Round_JWC2Layout);
        panel_Round_JWC2Layout.setHorizontalGroup(
            panel_Round_JWC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cambioText1)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panel_Round_JWC2Layout.setVerticalGroup(
            panel_Round_JWC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(cambioText1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        img_Autosize_JWC1.add(panel_Round_JWC2);
        panel_Round_JWC2.setBounds(0, 30, 290, 60);

        panel_Round_JWC3.setBackground(new java.awt.Color(255, 255, 255));
        panel_Round_JWC3.setEsqInferiorDerecha(75);
        panel_Round_JWC3.setEsqSuperiorDerecha(75);

        cambioText2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout panel_Round_JWC3Layout = new javax.swing.GroupLayout(panel_Round_JWC3);
        panel_Round_JWC3.setLayout(panel_Round_JWC3Layout);
        panel_Round_JWC3Layout.setHorizontalGroup(
            panel_Round_JWC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cambioText2)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panel_Round_JWC3Layout.setVerticalGroup(
            panel_Round_JWC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Round_JWC3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(cambioText2)
                .addGap(14, 14, 14))
        );

        img_Autosize_JWC1.add(panel_Round_JWC3);
        panel_Round_JWC3.setBounds(0, 110, 290, 60);

        panel_Round_JWC5.setBackground(new java.awt.Color(255, 255, 255));
        panel_Round_JWC5.setEsqInferiorDerecha(75);
        panel_Round_JWC5.setEsqSuperiorDerecha(75);

        cambioText3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout panel_Round_JWC5Layout = new javax.swing.GroupLayout(panel_Round_JWC5);
        panel_Round_JWC5.setLayout(panel_Round_JWC5Layout);
        panel_Round_JWC5Layout.setHorizontalGroup(
            panel_Round_JWC5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cambioText3)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panel_Round_JWC5Layout.setVerticalGroup(
            panel_Round_JWC5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cambioText3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        img_Autosize_JWC1.add(panel_Round_JWC5);
        panel_Round_JWC5.setBounds(0, 190, 290, 60);

        panel_Round_JWC6.setBackground(new java.awt.Color(255, 255, 255));
        panel_Round_JWC6.setEsqInferiorDerecha(75);
        panel_Round_JWC6.setEsqSuperiorDerecha(75);

        cambioText4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout panel_Round_JWC6Layout = new javax.swing.GroupLayout(panel_Round_JWC6);
        panel_Round_JWC6.setLayout(panel_Round_JWC6Layout);
        panel_Round_JWC6Layout.setHorizontalGroup(
            panel_Round_JWC6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cambioText4)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panel_Round_JWC6Layout.setVerticalGroup(
            panel_Round_JWC6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cambioText4)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        img_Autosize_JWC1.add(panel_Round_JWC6);
        panel_Round_JWC6.setBounds(0, 270, 290, 60);

        panel_Round_JWC7.setBackground(new java.awt.Color(255, 255, 255));
        panel_Round_JWC7.setEsqInferiorDerecha(75);
        panel_Round_JWC7.setEsqSuperiorDerecha(75);

        cambioText5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout panel_Round_JWC7Layout = new javax.swing.GroupLayout(panel_Round_JWC7);
        panel_Round_JWC7.setLayout(panel_Round_JWC7Layout);
        panel_Round_JWC7Layout.setHorizontalGroup(
            panel_Round_JWC7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cambioText5)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panel_Round_JWC7Layout.setVerticalGroup(
            panel_Round_JWC7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cambioText5)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        img_Autosize_JWC1.add(panel_Round_JWC7);
        panel_Round_JWC7.setBounds(0, 350, 290, 60);

        panel_Round_JWC8.setBackground(new java.awt.Color(255, 255, 255));
        panel_Round_JWC8.setEsqInferiorDerecha(75);
        panel_Round_JWC8.setEsqSuperiorDerecha(75);

        cambioText7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout panel_Round_JWC8Layout = new javax.swing.GroupLayout(panel_Round_JWC8);
        panel_Round_JWC8.setLayout(panel_Round_JWC8Layout);
        panel_Round_JWC8Layout.setHorizontalGroup(
            panel_Round_JWC8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cambioText7)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panel_Round_JWC8Layout.setVerticalGroup(
            panel_Round_JWC8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cambioText7)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        img_Autosize_JWC1.add(panel_Round_JWC8);
        panel_Round_JWC8.setBounds(0, 510, 290, 60);

        panel_Round_JWC10.setBackground(new java.awt.Color(255, 255, 255));
        panel_Round_JWC10.setEsqInferiorDerecha(75);
        panel_Round_JWC10.setEsqSuperiorDerecha(75);

        cambioText6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout panel_Round_JWC10Layout = new javax.swing.GroupLayout(panel_Round_JWC10);
        panel_Round_JWC10.setLayout(panel_Round_JWC10Layout);
        panel_Round_JWC10Layout.setHorizontalGroup(
            panel_Round_JWC10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cambioText6)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panel_Round_JWC10Layout.setVerticalGroup(
            panel_Round_JWC10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cambioText6)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        img_Autosize_JWC1.add(panel_Round_JWC10);
        panel_Round_JWC10.setBounds(0, 430, 290, 60);

        panel_Round_JWC9.setPreferredSize(new java.awt.Dimension(300, 100));

        cambioRegresado.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        cambioRegresado.setText("$");

        javax.swing.GroupLayout panel_Round_JWC9Layout = new javax.swing.GroupLayout(panel_Round_JWC9);
        panel_Round_JWC9.setLayout(panel_Round_JWC9Layout);
        panel_Round_JWC9Layout.setHorizontalGroup(
            panel_Round_JWC9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cambioRegresado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panel_Round_JWC9Layout.setVerticalGroup(
            panel_Round_JWC9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Round_JWC9Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(cambioRegresado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnCobrar.setBackground(new java.awt.Color(0, 147, 137));
        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        ingresoDinero.setEditable(false);
        ingresoDinero.setBackground(new java.awt.Color(255, 255, 255));
        ingresoDinero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ingresoDinero.setForeground(new java.awt.Color(0, 0, 0));
        ingresoDinero.setText("0");

        img_Autosize_JWC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        img_Autosize_JWC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_Autosize_JWC2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MCS Solutions");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("V 1.2");

        ingresoMoneda.setBackground(new java.awt.Color(255, 255, 255));
        ingresoMoneda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ingresoMoneda.setForeground(new java.awt.Color(0, 0, 0));

        btnMoneda.setBackground(new java.awt.Color(0, 147, 137));
        btnMoneda.setText("Meter moneda/Billete");
        btnMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonedaActionPerformed(evt);
            }
        });

        btn_Salir.setBackground(new java.awt.Color(0, 147, 137));
        btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Salir.setText("Salir");
        btn_Salir.setArco_esquina(25);
        btn_Salir.setColor_Normal(new java.awt.Color(110, 195, 136));
        btn_Salir.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_Round_JWC1Layout = new javax.swing.GroupLayout(panel_Round_JWC1);
        panel_Round_JWC1.setLayout(panel_Round_JWC1Layout);
        panel_Round_JWC1Layout.setHorizontalGroup(
            panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Round_JWC1Layout.createSequentialGroup()
                .addGroup(panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel_Round_JWC1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(jLabel2))
                        .addGroup(panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_Round_JWC9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_Round_JWC1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(img_Autosize_JWC2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(panel_Round_JWC1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ingresoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ingresoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_Autosize_JWC1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_Round_JWC1Layout.setVerticalGroup(
            panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img_Autosize_JWC1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Round_JWC1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ingresoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_Round_JWC9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(img_Autosize_JWC2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Round_JWC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Round_JWC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Round_JWC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Establece el cambio dentro de los paneles de texto
    //De un ArrayList de String
    private void mostrarCambio(ArrayList<String> cambio){
        cambio.remove(cambio.get(cambio.size() - 1));
        ListIterator<String> iterator = cambio.listIterator();
        limpiarCambioText();
        try{
            cambioText1.setText(iterator.next());
            cambioText2.setText(iterator.next());
            cambioText3.setText(iterator.next());
            cambioText4.setText(iterator.next());
            cambioText5.setText(iterator.next());
            cambioText6.setText(iterator.next());
            cambioText7.setText(iterator.next());
        }catch(NoSuchElementException e){
            
        }
        //cambioText1
    }
    
    //Limpia los textos donde se devuelve el dinero
    private void limpiarCambioText(){
        cambioText1.setText("");
        cambioText2.setText("");
        cambioText3.setText("");
        cambioText4.setText("");
        cambioText5.setText("");
        cambioText6.setText("");
        cambioText7.setText("");
    }
    
    //Metodo para establecer el texto
    //Del campo de texto "cambioRegresado"
    private void setCambioRegresadoText(String texto, int size){
        cambioRegresado.setText(texto);
        cambioRegresado.setFont(new Font(cambioRegresado.getFont().getFamily(), Font.BOLD, size));
    }
    
    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        try{
            //Visualiza el cambio
            modelo.setChange(Integer.parseInt(ingresoDinero.getText()));
            //Realiza el algoritmo del cambio
            //Y lo devuelve en un ArrayList
            ArrayList<String> cambio = modelo.entregarDinero();
            //Devuelve el ultimo elemento de la lista,
            //el cual contiene el cambio total
            //en forma de String
            setCambioRegresadoText(cambio.get(cambio.size() - 1), 36);
            mostrarCambio(cambio);
        }catch(NumberFormatException e){
            //No hay solamente numeros
            setCambioRegresadoText("Numero Invalido", 20);
        }catch(IllegalArgumentException e){
            //Introdujo menos del costo del boleto
            setCambioRegresadoText(e.getMessage(), 20);
        }catch(NullPointerException e){
            setCambioRegresadoText("No tenemos dinero", 20);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCobrarActionPerformed

    //Metodo para validar que las monedas sean correctas
    private boolean validarMonedas(int coin){
        if(coin == 1 || coin == 2 || coin == 5 || coin == 10 || coin == 20 || coin == 50 || coin == 100){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Accion del boton que simula la introduccion de una moneda
    private void btnMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonedaActionPerformed
        try{
            int cashIn = Integer.parseInt(ingresoMoneda.getText());
            //Si las monedas no son validas
            if(!validarMonedas(cashIn)){
                throw new IllegalArgumentException("Ingrese una moneda o billete valido");
            }
            //Aumenta al dinero ya introducido
            //Lo que se le esta introduciendo
            int cashOut = Integer.parseInt(ingresoDinero.getText());
            cashOut += cashIn;
            limpiarCambioText();
            setCambioRegresadoText("$", 36);
            ingresoDinero.setText(Integer.toString(cashOut));
        }catch(NumberFormatException e){
            //Si se inntroduce un valor no numerico
            setCambioRegresadoText("Ingrese un valor de una moneda o billete", 12);
        }catch(IllegalArgumentException e){
            //Si se introduce un valor no aceptado
            setCambioRegresadoText(e.getMessage(), 15);
        }catch(Exception e){
            setCambioRegresadoText(e.getMessage(), 10);
        }
    }//GEN-LAST:event_btnMonedaActionPerformed

    //Limpia los cuadros de texto
    //Cuando se hace click en la imagen
    private void img_Autosize_JWC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_Autosize_JWC2MouseClicked
        cleanUp();
    }//GEN-LAST:event_img_Autosize_JWC2MouseClicked

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.setVisible(false);
        Gui Gui = new Gui();
        Gui.setVisible(true);
    }//GEN-LAST:event_btn_SalirActionPerformed

    
    //Metodo para limpiar todos los cuadros de texto
    public void cleanUp(){
        limpiarCambioText();
        ingresoDinero.setText("0");
        ingresoMoneda.setText("");
        setCambioRegresadoText("$", 36);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dispensadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dispensadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dispensadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dispensadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dispensadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Btn_Round_JWC btnCobrar;
    private swing.Btn_Round_JWC btnMoneda;
    private swing.Btn_Round_JWC btn_Salir;
    public javax.swing.JLabel cambioRegresado;
    private javax.swing.JLabel cambioText1;
    private javax.swing.JLabel cambioText2;
    private javax.swing.JLabel cambioText3;
    private javax.swing.JLabel cambioText4;
    private javax.swing.JLabel cambioText5;
    private javax.swing.JLabel cambioText6;
    private javax.swing.JLabel cambioText7;
    private swing.Img_Autosize_JWC img_Autosize_JWC1;
    private swing.Img_Autosize_JWC img_Autosize_JWC2;
    private javax.swing.JTextField ingresoDinero;
    private javax.swing.JTextField ingresoMoneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private swing.Panel_Round_JWC panel_Round_JWC1;
    private swing.Panel_Round_JWC panel_Round_JWC10;
    private swing.Panel_Round_JWC panel_Round_JWC2;
    private swing.Panel_Round_JWC panel_Round_JWC3;
    private swing.Panel_Round_JWC panel_Round_JWC4;
    private swing.Panel_Round_JWC panel_Round_JWC5;
    private swing.Panel_Round_JWC panel_Round_JWC6;
    private swing.Panel_Round_JWC panel_Round_JWC7;
    private swing.Panel_Round_JWC panel_Round_JWC8;
    private swing.Panel_Round_JWC panel_Round_JWC9;
    // End of variables declaration//GEN-END:variables
}
