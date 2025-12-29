package spell;

import spell.channels.ArcaneChannel;
import spell.channels.FireChannel;

import java.util.ArrayList;
import java.util.List;

public class ManaTypes {
    public static final List<Mana> List = new ArrayList<Mana>() {
        final Mana Arcane = new Mana("arcane", new ArcaneChannel()) {
            public void trigger() {

            }
        };
        final Mana Fire = new Mana("fire", new FireChannel()) {
            public void trigger() {

            }
        };
    };
}
