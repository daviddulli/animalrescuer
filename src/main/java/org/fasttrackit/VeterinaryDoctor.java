package org.fasttrackit;

public class VeterinaryDoctor extends Adoptive{

    String speciality;

    public VeterinaryDoctor(String name, float budget, String speciality) {
        super(name, budget);
        this.speciality = speciality;
    }
}
