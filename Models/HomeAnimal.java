package Models;
import java.util.List;

public abstract class HomeAnimal implements PeopleFriend{
    protected String name;
    protected List<String> commands;
    protected String birthday;
    @Override
    public String GetName() {
        return name;
    }
    @Override
    public List<String> GetCommands() {
        return commands;
    }
    @Override
    public String GetBirthday() {
        return birthday;
    }
    @Override
    public void AddCommands(List<String> newCommands) {
        this.commands.addAll(newCommands);
    }
}
