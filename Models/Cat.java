package Models;
import java.util.List;

public class Cat extends HomeAnimal{
    public Cat(String name, List<String> commands, String birthday) {
        this.name = name;
        this.commands = commands;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Кошка -" + name + "\t" + "Дата рождения - " + birthday;
    }
}
