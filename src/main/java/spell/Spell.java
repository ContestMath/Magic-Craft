package spell;

import net.minecraft.util.Tuple;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

import java.util.List;

public abstract class Spell extends Entity {
    private final ChanneledMana manas;
    public final List<Tuple<Mana, Integer>> manaChannels;
    private final float manaDrain = 0.1f;

    public Spell(EntityType<? extends Spell> entityType, Level level, ChanneledMana manas, List<Tuple<Mana, Integer>> manaChannels) {
        super(entityType,level);
        this.manaChannels = manaChannels;
        this.manas = manas;
    }

    public void addMana(Tuple<Mana, Float> add_mana) {
        for (Tuple<Mana, Float> spell_mana:manas.manas) {
            if (spell_mana.getA().equals(add_mana.getA())) {
                spell_mana.setB(Math.max(spell_mana.getB() + add_mana.getB(), 0));
                break;
            }
        }
        checkManaDeath();
    }

    public void addAllMana(Float to_add) {
        for (Tuple<Mana, Float> spell_mana:manas.manas) {
            spell_mana.setB(spell_mana.getB() + to_add);
        }
    }

    private void checkManaDeath() {
        for (Tuple<Mana, Float> tuple : manas.manas) {
            if (tuple.getB() > 0) return;
        }
        kill();
    }

    @Override
    public void baseTick() {
        if (!level().isClientSide) {
            addAllMana(-manaDrain);
        }
        super.baseTick();
    }
}
