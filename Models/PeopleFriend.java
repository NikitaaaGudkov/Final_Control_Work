package Models;
import java.util.List;

public interface PeopleFriend {
    public String GetName();
    public List<String> GetCommands();
    public String GetBirthday();
    public void AddCommands(List<String> newCommands);
} 