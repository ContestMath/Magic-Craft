package spell;

public abstract class Mana {
    public String name;
    public ManaChannel channel;
    public Mana(String newname, ManaChannel input_channel) {
        name = newname;
        channel = input_channel;
    }
    public abstract void trigger();

}
