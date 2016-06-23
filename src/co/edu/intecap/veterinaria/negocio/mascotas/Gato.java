/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.negocio.mascotas;

import co.edu.intecap.veterinaria.negocio.Animal;
import co.edu.intecap.veterinaria.negocio.Mascota;

/**
 *
 * @author elperro
 */
public class Gato extends Mascota implements Animal {
   
   private boolean pelo;
   private boolean garras;

   @Override
   public void comer(double comida) {
      this.setPeso(this.getPeso() + Math.round(((comida * 0.05)/3)*2));
      this.setEnergia(this.getEnergia() + Math.round((30/3)*2));
      this.validarEnergia();
   }

   @Override
   public void defecar() {
      System.out.println("Ya fui al baño, hice en la arena");
      this.setPeso(this.getPeso() * Math.round((0.03/3)*2));
   }

   @Override
   public void beber(double bebida) {
      this.setPeso(this.getPeso() + Math.round(((bebida * 0.01)/3)*2));
   }
   
   @Override
   public void jugar() {
      super.jugar();
      this.setPeso(this.getPeso() / Math.round((0.15/3)*2));
   }
   
   public void aranar(){
      System.out.println("Arañe a mi dueño y me importa un pepino...");
      this.setEnergia(this.getEnergia() - Math.round((10/3)*2));
      this.validarEnergia();
   }
   
   public void lamer(){
      
      System.out.println("Me estoy aseando y me siento limpio");
      this.setEnergia(this.getEnergia() - Math.round((20/3)*2));
      this.validarEnergia();
   }
   
   public void maullar(){
      System.out.println("Miau...Miau...Miau...");
   
   }

   /**
    * @return the pelo
    */
   public boolean isPelo() {
      return pelo;
   }

   /**
    * @return the garras
    */
   public boolean isGarras() {
      return garras;
   }

   /**
    * @param pelo the pelo to set
    */
   public void setPelo(boolean pelo) {
      this.pelo = pelo;
   }

   /**
    * @param garras the garras to set
    */
   public void setGarras(boolean garras) {
      this.garras = garras;
   }
   
   
   
}
