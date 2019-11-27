package org.fasttrackit;


import java.time.LocalDate;
import java.time.Month;

public class App
{
    public static void main(String[] args) {

        System.out.println("Welcome to animal rescuer!");
        People peopleReference = new People("joe");

        Animal animalReference = new Animal("Rex");
        animalReference.age = 2.4;
        animalReference.favoriteActivity = "Sleeping";
        animalReference.favoriteFood = "Pedigree";
        animalReference.healtLevel = 7;
        animalReference.hungerLevel = 5;
        animalReference.moodLevel = 7.5;

        System.out.println("Hello, here are some informations about your dog:");
        System.out.println("Name: " + animalReference.name);
        System.out.println("Age: "  + animalReference.age);
        System.out.println("Healt level: " + animalReference.healtLevel);
        System.out.println("Mood level: " + animalReference.moodLevel);
        System.out.println("Favorite activity: " + animalReference.favoriteActivity);
        System.out.println("Favorite food: " + animalReference.favoriteFood);

        Adoptive adoptiveReference = new Adoptive("John", 500);

        System.out.println("Informations about the adoptive: ");
        System.out.println("Adoptive's name: " + adoptiveReference.name);
        System.out.println("Adoptive's budget in euro: " + adoptiveReference.budget);

        Food foodReference = new Food("Pedigree");
        foodReference.quantity = 1;
        foodReference.price = 10;
        foodReference.expirationDate = LocalDate.of(2020, Month.AUGUST, 05);

        System.out.println("Informations about the food: ");
        System.out.println("Name: " + foodReference.name);
        System.out.println("Qunatity: " + foodReference.quantity + " kg");
        System.out.println("Price: " + foodReference.price + " euro");
        System.out.println("Expiration date: " + foodReference.expirationDate);

        Activities activityReference = new Activities("Sleeping");

        System.out.println("Activity: " + activityReference.name);

        VeterinaryDoctor doctorReference = new VeterinaryDoctor("Dr. Dolittle", 500000, "Veterinary");


        System.out.println("Doctors name: " + doctorReference.name + " speciality: " + doctorReference.speciality);

        Game gameRef = new Game("Game 1");
        gameRef.adoptiveGameRef.name = adoptiveReference.name;
        gameRef.animalGameRef.name = animalReference.name;
        gameRef.docGameRef.name = doctorReference.name;

        System.out.println("Game participants: ");
        System.out.println("Doctor: " + gameRef.docGameRef.name + " Adoptive: " + gameRef.adoptiveGameRef.name + " Dog: " + gameRef.animalGameRef.name);


    }
}
