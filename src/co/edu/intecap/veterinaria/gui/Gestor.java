/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.gui;

import co.edu.intecap.veterinaria.negocio.Mascota;
import co.edu.intecap.veterinaria.negocio.mascotas.Gato;
import co.edu.intecap.veterinaria.negocio.mascotas.Perro;
import co.edu.intecap.veterinaria.util.Utilidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.xml.bind.Marshaller;

/**
 *
 * @author elperro
 */
public class Gestor extends javax.swing.JDialog {
   
   private final Mascota mascota;
   private final Perro perro;
   private final Gato gato;

   /**
    * Creates new form Gestor
    */
   public Gestor(java.awt.Frame parent, boolean modal) {
      super(parent, modal);
      initComponents();
      mascota = null;
      perro = null;
      gato = null;
   }
   
   public Gestor(java.awt.Frame parent, boolean modal, Perro perro) {
      super(parent, modal);
      initComponents();
      this.gato = null;
      this.perro = perro;
      this.mascota = perro;
      asignarListeners();
      pnActividadGato.setVisible(false);
   }
   
   public Gestor(java.awt.Frame parent, boolean modal, Gato gato) {
      super(parent, modal);
      initComponents();
      this.perro = null;
      this.gato = gato;
      this.mascota = gato;
      asignarListeners();
      pnActividadPerro.setVisible(false);
   }
   
    private void asignarListenerMascota(){
      ActionListener accionMascota = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             JButton btnAccion = (JButton) e.getSource();
             if(btnAccion.equals(btnJugar)){
                if(!validarEnergiaDisponible()){
                   return;
                }
                if(perro != null){
                   perro.jugar();
                }
                if(gato != null){
                   gato.jugar();
                }
             }
             if(btnAccion.equals(btnDormir)){
                mascota.dormir();
             }
              if(btnAccion.equals(btnVacunar)){
                mascota.vacunar();
             }
             
              if(btnAccion.equals(btnComer)){
                if(perro != null){
                   perro.comer(45);
                }
                if(gato != null){
                   gato.comer(35);
                }
             }
              if(btnAccion.equals(btnBeber)){
                if(perro != null){
                   perro.beber(20);
                }
                if(gato != null){
                   gato.beber(10);
                }
             }
              if(btnAccion.equals(btnDefecar)){
                if(perro != null){
                   perro.defecar();
                }
                if(gato != null){
                   gato.defecar();
                }
             }
         }
      };
      btnJugar.addActionListener(accionMascota);
      btnDormir.addActionListener(accionMascota);
      btnVacunar.addActionListener(accionMascota);
      btnComer.addActionListener(accionMascota);
      btnBeber.addActionListener(accionMascota);
      btnDefecar.addActionListener(accionMascota);
   }
   
   private void asignarListenerPerro(){
      ActionListener accionPerro = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JButton btnAccion = (JButton) e.getSource();
            
            if(btnAccion.equals(btnLadrar)){
                perro.ladrar();
             }
              if(btnAccion.equals(btnMorder)){
                 if(!validarEnergiaDisponible()){
                   return;
                  }
                perro.morder();
             }
              if(btnAccion.equals(btnCorrer)){
                 if(!validarEnergiaDisponible()){
                   return;
                  }
                perro.correr(50);
             }
              
         }
      };
      btnLadrar.addActionListener(accionPerro);
      btnMorder.addActionListener(accionPerro);
      btnCorrer.addActionListener(accionPerro);
   }
   
    private void asignarListenerGato(){
      ActionListener accionGato = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             JButton btnAccion = (JButton) e.getSource();
               if(btnAccion.equals(btnAranar)){
                  if(!validarEnergiaDisponible()){
                   return;
                }
                gato.aranar();
             }
              if(btnAccion.equals(btnLamer)){
                 if(!validarEnergiaDisponible()){
                   return;
                }
                gato.lamer();
             }
              if(btnAccion.equals(btnMaullar)){
                gato.maullar();
             }
         }
      };
      btnAranar.addActionListener(accionGato);
      btnLamer.addActionListener(accionGato);
      btnMaullar.addActionListener(accionGato);
   }
    
   private void asignarListeners(){
      this.asignarListenerMascota();
      this.asignarListenerPerro();
      this.asignarListenerGato();
   }
   
   private boolean validarEnergiaDisponible(){
      if(mascota.getEnergia() < 1){
          Utilidad.lanzarAlerta(this, "La mascota no puede jugar por que no tiene energia", "Mascota sin energia", JOptionPane.WARNING_MESSAGE);
          return false;
       }
      return true;
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      btnJugar = new javax.swing.JButton();
      btnDormir = new javax.swing.JButton();
      btnVacunar = new javax.swing.JButton();
      btnComer = new javax.swing.JButton();
      btnBeber = new javax.swing.JButton();
      btnDefecar = new javax.swing.JButton();
      pnActividadPerro = new javax.swing.JPanel();
      btnMorder = new javax.swing.JButton();
      btnLadrar = new javax.swing.JButton();
      btnCorrer = new javax.swing.JButton();
      pnActividadGato = new javax.swing.JPanel();
      btnAranar = new javax.swing.JButton();
      btnLamer = new javax.swing.JButton();
      btnMaullar = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

      btnJugar.setText("Jugar");

      btnDormir.setText("Dormir");

      btnVacunar.setText("Vacunar");

      btnComer.setText("Comer");

      btnBeber.setText("Beber");

      btnDefecar.setText("Defecar");

      btnMorder.setText("Morder");

      btnLadrar.setText("Ladrar");

      btnCorrer.setText("Correr");

      javax.swing.GroupLayout pnActividadPerroLayout = new javax.swing.GroupLayout(pnActividadPerro);
      pnActividadPerro.setLayout(pnActividadPerroLayout);
      pnActividadPerroLayout.setHorizontalGroup(
         pnActividadPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(pnActividadPerroLayout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(btnLadrar)
            .addGap(12, 12, 12)
            .addComponent(btnMorder)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnCorrer)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      pnActividadPerroLayout.setVerticalGroup(
         pnActividadPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(pnActividadPerroLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnActividadPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnMorder)
               .addComponent(btnLadrar)
               .addComponent(btnCorrer)))
      );

      btnAranar.setText("Arañar");

      btnLamer.setText("Lamer");

      btnMaullar.setText("Maullar");

      javax.swing.GroupLayout pnActividadGatoLayout = new javax.swing.GroupLayout(pnActividadGato);
      pnActividadGato.setLayout(pnActividadGatoLayout);
      pnActividadGatoLayout.setHorizontalGroup(
         pnActividadGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(pnActividadGatoLayout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(btnAranar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnLamer)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnMaullar)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      pnActividadGatoLayout.setVerticalGroup(
         pnActividadGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(pnActividadGatoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(pnActividadGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnAranar)
               .addComponent(btnLamer)
               .addComponent(btnMaullar))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(pnActividadPerro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(btnJugar)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnDormir))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(btnComer)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnBeber)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnDefecar)
               .addComponent(btnVacunar))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(pnActividadGato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnJugar)
               .addComponent(btnDormir)
               .addComponent(btnVacunar))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnComer)
               .addComponent(btnBeber)
               .addComponent(btnDefecar))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pnActividadPerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(pnActividadGato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(16, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAranar;
   private javax.swing.JButton btnBeber;
   private javax.swing.JButton btnComer;
   private javax.swing.JButton btnCorrer;
   private javax.swing.JButton btnDefecar;
   private javax.swing.JButton btnDormir;
   private javax.swing.JButton btnJugar;
   private javax.swing.JButton btnLadrar;
   private javax.swing.JButton btnLamer;
   private javax.swing.JButton btnMaullar;
   private javax.swing.JButton btnMorder;
   private javax.swing.JButton btnVacunar;
   private javax.swing.JPanel pnActividadGato;
   private javax.swing.JPanel pnActividadPerro;
   // End of variables declaration//GEN-END:variables
}
