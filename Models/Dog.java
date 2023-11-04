package Models;
import java.util.List;

public class Dog extends HomeAnimal{
    public Dog(String name, List<String> commands, String birthday) {
        this.name = name;
        this.commands = commands;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Собака -" + name + "\t" + "Дата рождения - " + birthday;
    }
}
