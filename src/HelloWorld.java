import fr.nnyimc.model.Dog;
import fr.nnyimc.model.Person;
import fr.nnyimc.model.Pet;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, nice meeting you!");

        Person dev = new Person("John", "Doe", LocalDate.of(1984, 12, 12));
        Person ops = new Person("Ada", "Lovelace", LocalDate.of(1980, 3, 14));

        dev.setSpouse(ops);

        Dog fido = new Dog("Fido", LocalDate.of(2020, 1, 4));
        dev.setPet(fido);

        System.out.println(dev);
        System.out.println(ops);

    }
}
