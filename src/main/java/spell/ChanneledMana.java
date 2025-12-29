package spell;

import net.minecraft.util.Tuple;
import java.util.ArrayList;
import java.util.List;

public class ChanneledMana {
    public ChanneledMana() {
        manas = new ArrayList<>() {};
        for (Mana mana : ManaTypes.List) {
            manas.add(new Tuple<>(mana, 0f));
        }
    }
    public List<Tuple<Mana, Float>> manas;
}
