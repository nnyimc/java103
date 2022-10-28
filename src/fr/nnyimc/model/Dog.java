package fr.nnyimc.model;

import java.time.LocalDate;

public class Dog extends Pet {

    public Dog(String fido, LocalDate of) {
        super();
    }
    public void bark() {
        System.out.println("Ruff ruff");
    }

}
