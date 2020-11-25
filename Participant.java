import java.util.ArrayList;

public class Participant {
    private String name;
    private ArrayList<String> gifts;

    public Participant(String name)
    {
        this.name = name;
    }

    public Participant(String name, ArrayList<String> gifts)
    {
        this.name = name;
        this.gifts = gifts;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getGifts()
    {
        return gifts.toString();
    }

    public void setGifts()
    {
        
    }
}
