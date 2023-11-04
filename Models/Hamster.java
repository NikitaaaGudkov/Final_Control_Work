package Models;
import java.util.List;

public class Hamster extends HomeAnimal{
    public Hamster(String name, List<String> commands, String birthday) {
        this.name = name;
        this.commands = commands;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Хомяк -" + name + "\t" + "Дата рождения - " + birthday;
    }
}
