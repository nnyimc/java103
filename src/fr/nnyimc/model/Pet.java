package fr.nnyimc.model;

import java.time.LocalDate;

public class Pet {
    private String name;
    LocalDate dob;

    public Pet() {}
    public Pet(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }

}
