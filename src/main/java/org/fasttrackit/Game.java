package org.fasttrackit;

public class Game {

   String name;
   Adoptive adoptiveGameRef = new Adoptive("John", 500);
   VeterinaryDoctor docGameRef = new VeterinaryDoctor("Doc", 50000000, "vet");
   Animal animalGameRef = new Animal("Rex");

   public Game(String name) {
      this.name = name;
   }
}
