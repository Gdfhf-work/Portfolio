/*
 * Autor: MCS Solutions
 * Localidad: Mazatlan, Sinaloa, Mexico
 * Fecha: 10/10/2022
 */
package ventana;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objetos.*;
import operaciones.Disjktra;
import java.io.*;
import javax.swing.JFrame;


public class Gui extends javax.swing.JFrame {
    Grafo grafo = new Grafo();
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    Dispensadora ventanaPago = new Dispensadora();
    /**
     * Creamos el form
     */
    public Gui() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panel_Round_JWC1 = new swing.Panel_Round_JWC();
        panel_Round_JWC2 = new swing.Panel_Round_JWC();
        panel_Round_JWC4 = new swing.Panel_Round_JWC();
        img_Autosize_JWC1 = new swing.Img_Autosize_JWC();
        btn_Salir = new swing.Btn_Round_JWC();
        btn_Pagar = new swing.Btn_Round_JWC();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        img_Autosize_JWC3 = new swing.Img_Autosize_JWC();
        btn_RutasSIR = new swing.Btn_Round_JWC();
        img_Autosize_JWC2 = new swing.Img_Autosize_JWC();
        btn_RutasNY = new swing.Btn_Round_JWC();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lineas de metro de New York"));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_Round_JWC1.setBackground(new java.awt.Color(75, 112, 154));
        panel_Round_JWC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC2.setBackground(new java.awt.Color(221, 217, 199));

        javax.swing.GroupLayout panel_Round_JWC2Layout = new javax.swing.GroupLayout(panel_Round_JWC2);
        panel_Round_JWC2.setLayout(panel_Round_JWC2Layout);
        panel_Round_JWC2Layout.setHorizontalGroup(
            panel_Round_JWC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_Round_JWC2Layout.setVerticalGroup(
            panel_Round_JWC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_Round_JWC1.add(panel_Round_JWC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 650, 800));

        panel_Round_JWC4.setBackground(new java.awt.Color(255, 255, 255));
        panel_Round_JWC4.setEsqInferiorDerecha(30);
        panel_Round_JWC4.setEsqSuperiorDerecha(30);

        img_Autosize_JWC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NYC.png"))); // NOI18N

        javax.swing.GroupLayout panel_Round_JWC4Layout = new javax.swing.GroupLayout(panel_Round_JWC4);
        panel_Round_JWC4.setLayout(panel_Round_JWC4Layout);
        panel_Round_JWC4Layout.setHorizontalGroup(
            panel_Round_JWC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_Autosize_JWC1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_Round_JWC4Layout.setVerticalGroup(
            panel_Round_JWC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Round_JWC4Layout.createSequentialGroup()
                .addComponent(img_Autosize_JWC1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_Round_JWC1.add(panel_Round_JWC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 610, 90));

        btn_Salir.setBackground(new java.awt.Color(110, 195, 136));
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
        panel_Round_JWC1.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, 140, 60));

        btn_Pagar.setBackground(new java.awt.Color(110, 195, 136));
        btn_Pagar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Pagar.setText("Pagar ($60 por boleto)");
        btn_Pagar.setActionCommand("");
        btn_Pagar.setArco_esquina(25);
        btn_Pagar.setColor_Normal(new java.awt.Color(110, 195, 136));
        btn_Pagar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PagarActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(btn_Pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 400, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MCS Solutions");
        panel_Round_JWC1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, 170, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("V 1.2");
        panel_Round_JWC1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 770, 80, -1));

        img_Autosize_JWC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N
        panel_Round_JWC1.add(img_Autosize_JWC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, 50, 60));

        btn_RutasSIR.setBackground(new java.awt.Color(110, 195, 136));
        btn_RutasSIR.setForeground(new java.awt.Color(255, 255, 255));
        btn_RutasSIR.setText("Rutas Staten Island [SIR]");
        btn_RutasSIR.setArco_esquina(25);
        btn_RutasSIR.setColor_Normal(new java.awt.Color(110, 195, 136));
        btn_RutasSIR.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_RutasSIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RutasSIRActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(btn_RutasSIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 400, 70));

        img_Autosize_JWC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Copy.png"))); // NOI18N
        panel_Round_JWC1.add(img_Autosize_JWC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 770, 40, 40));

        btn_RutasNY.setBackground(new java.awt.Color(110, 195, 136));
        btn_RutasNY.setForeground(new java.awt.Color(255, 255, 255));
        btn_RutasNY.setText("Rutas de New York");
        btn_RutasNY.setActionCommand("");
        btn_RutasNY.setArco_esquina(25);
        btn_RutasNY.setColor_Normal(new java.awt.Color(110, 195, 136));
        btn_RutasNY.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        btn_RutasNY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RutasNYActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(btn_RutasNY, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 400, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 630, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(panel_Round_JWC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_Round_JWC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Linea de metro de New York"); // NOI18N

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void dibujarGrafo(){
        jPanel1.paint(jPanel1.getGraphics());
        dibujarArista();
        dibujarNodos();
    }
    public void dibujarNodos(){
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){            
            nodo.getCirculo().dibujarCirculo(jPanel1.getGraphics());
        }
    }
    public void dibujarArista(){
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){            
            ArrayList<Enlace> listaEnlace = nodo.getListaNodoAdyacente();
            if(listaEnlace != null){
                for(Enlace enlace:listaEnlace){
                    enlace.getArista().getLineaQuebrada().dibujarLineaQuebrada(jPanel1.getGraphics());
                }
            }            
        }
    }
    private int ingresarPeso(){
        String peso = JOptionPane.showInputDialog("Digite la distancia entre puntos");
        int intPeso = 0;
        try{
            intPeso = Integer.parseInt(peso);            
        }catch(Exception ex){
            intPeso = ingresarPeso();
        }
        return intPeso;
    }
    
    private void exportarGrafo(){
        try{
            FileOutputStream writeData = new FileOutputStream("linea1.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            ArrayList<Nodo> nodos = new ArrayList<Nodo>();
            nodos = this.grafo.getListaNodos();
            writeStream.writeObject(nodos);
            writeStream.flush();
            writeStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void eliminarNodo(int x,int y){
        if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
            Nodo temp = grafo.buscarNodo(x, y);
            grafo.eliminarAristasEntrante(temp);
            if(grafo.eliminarNodo(temp)){
                JOptionPane.showMessageDialog(null,"Eliminado");
                dibujarGrafo();
            }
        }
    }
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        int x = evt.getX();
        int y = evt.getY();
        if(evt.isMetaDown()){      //$ Click Derecho      
//            eliminarNodo(x, y);
//            JOptionPane.showMessageDialog(this,"Clic derecho");
            if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
            if(nodoInicio == null){
                grafo.reiniciarGrafoParaDisjktra();
                grafo.reiniciarColores();
                nodoInicio = grafo.buscarNodo(x, y);//nodoInicio lo pongo a apuntar al nodo donde hice clic
                nodoInicio.getCirculo().setColor(Color.magenta);//Lo hago cambiar de color
//                JOptionPane.showMessageDialog(null,"Seleccione otro nodo para crear una arista");
            }else{//si nodoInicio ya estaba apunto a un nodo, lo preparo para crear arista             
                nodoFin = grafo.buscarNodo(x, y);
                Disjktra disjktra = new Disjktra(grafo);
                disjktra.ejecutar(nodoInicio);
                disjktra.marcarRutaCorta(nodoFin, Color.red);
//                crearArista();            
//                                
//                
                nodoInicio = null;//null para poder crear mas arista
                nodoFin = null;//null para poder crear mas arista
            }
        }
            
            
        }else{
//            if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
//                if(nodoInicio == null){
//                    nodoInicio = grafo.buscarNodo(x, y);//nodoInicio lo pongo a apuntar al nodo donde hice clic
//                    nodoInicio.getCirculo().setColor(Color.BLUE);//Lo hago cambiar de color
//    //                JOptionPane.showMessageDialog(null,"Seleccione otro nodo para crear una arista");
//                }else{//si nodoInicio ya estaba apunto a un nodo, lo preparo para crear arista             
//                    nodoFin = grafo.buscarNodo(x, y);                
//                    crearArista();            
//
//                    nodoInicio.getCirculo().setColor(Color.yellow);//lo regreso a su color original
//
//                    nodoInicio = null;//null para poder crear mas arista
//                    nodoFin = null;//null para poder crear mas arista
//                }
//            }else{//Si no he hecho clic sobre un nodo
//                crearNodo(x, y);//creo un nodo apartir de unas coordenadas
//            }
        }
        dibujarGrafo();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_RutasSIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RutasSIRActionPerformed
        cargarGrafo("linea2");
    }//GEN-LAST:event_btn_RutasSIRActionPerformed

    private void btn_PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PagarActionPerformed
        ventanaPago();
        this.setVisible(false);
    }//GEN-LAST:event_btn_PagarActionPerformed

    private void btn_RutasNYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RutasNYActionPerformed
        cargarGrafo("linea1");
    }//GEN-LAST:event_btn_RutasNYActionPerformed
   
    //Abre la ventana Dispensadora
    public void ventanaPago(){
        ventanaPago.setLocationRelativeTo(null);
        ventanaPago.setAlwaysOnTop(true);
        ventanaPago.pack();
        ventanaPago.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaPago.setVisible(true);
        ventanaPago.cleanUp();
    }
  
    private void crearArista(){
        int intPeso = ingresarPeso();
        Arista arista = new Arista();
        arista.setPeso(intPeso);
        Coordenadas c = new Coordenadas(100000,100000);
        c.addCoordenada(nodoInicio.getCirculo().getX() + (nodoInicio.getCirculo().getDiametro()/2),nodoInicio.getCirculo().getY() + (nodoInicio.getCirculo().getDiametro()/2));
        c.addCoordenada(nodoFin.getCirculo().getX() + (nodoInicio.getCirculo().getDiametro()/2),nodoFin.getCirculo().getY() + (nodoInicio.getCirculo().getDiametro()/2));
        LineaQuebrada lq = new LineaQuebrada(c);
        arista.setLineaQuebrada(lq);               
        grafo.crearEnlacesNoDirigido(nodoInicio, nodoFin,arista);       
       
    }
    
    private void crearNodo(int x, int y){
        Coordenadas c = new Coordenadas(100000,100000, x, y);
        String dato = JOptionPane.showInputDialog("Digite un dato o Nombre de la coordenada");
        if(dato != null){
            dato = dato.toUpperCase();//por que lo quiero todo en mayusculas
            Nodo nodo = new Nodo(dato,c);
            nodo.getCirculo().setDiametro(12);
            nodo.getCirculo().setEtiqueta(nodo.getDato()+"");
            if(grafo.adjuntarNodo(nodo)){
                nodo.getCirculo().dibujarCirculo(jPanel1.getGraphics());
            }else{
            }
            nodoInicio = null;
            nodoFin = null; 
        }
    }
    
    public void cargarGrafo(String linea){
        try{
            FileInputStream readData = new FileInputStream(linea + ".ser");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList<Nodo> nodos = (ArrayList<Nodo>) readStream.readObject();
            readStream.close();
            this.grafo.setListaNodos(nodos);
            dibujarGrafo();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public swing.Btn_Round_JWC btn_Pagar;
    public swing.Btn_Round_JWC btn_RutasNY;
    public swing.Btn_Round_JWC btn_RutasSIR;
    private swing.Btn_Round_JWC btn_Salir;
    private swing.Img_Autosize_JWC img_Autosize_JWC1;
    private swing.Img_Autosize_JWC img_Autosize_JWC2;
    private swing.Img_Autosize_JWC img_Autosize_JWC3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private swing.Panel_Round_JWC panel_Round_JWC1;
    private swing.Panel_Round_JWC panel_Round_JWC2;
    private swing.Panel_Round_JWC panel_Round_JWC4;
    // End of variables declaration//GEN-END:variables
}
