package Models;
import java.util.Date;
import java.util.List;

public abstract class HomeAnimal implements PeopleFriend{
    protected String name;
    protected List<String> commands;
    protected Date birthday;
    @Override
    public String GetName() {
        return name;
    }
    @Override
    public List<String> GetCommands() {
        return commands;
    }
    @Override
    public Date GetBirthday() {
        return birthday;
    }
    @Override
    public void AddCommands(List<String> newCommands) {
        this.commands.addAll(newCommands);
    }
}
