package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setAge(20);
        person.setName("Duvitas");
        FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
    }
}
