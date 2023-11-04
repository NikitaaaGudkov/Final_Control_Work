package Models;
import java.util.Date;
import java.util.List;

public interface PeopleFriend {
    public String GetName();
    public List<String> GetCommands();
    public Date GetBirthday();
    public void AddCommands(List<String> newCommands);
} 