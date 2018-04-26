package net.darkhax.gamestages.data;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import net.minecraft.nbt.NBTTagCompound;

public class FakePlayerData implements IStageData {

    private final Set<String> stages = new HashSet<>();
    private final String fakePlayerName;

    public FakePlayerData (final String fakePlayerName, final Set<String> stages) {

        this.stages.addAll(stages);
        this.fakePlayerName = fakePlayerName;
    }

    @Override
    public Collection<String> getStages () {

        return this.stages;
    }

    @Override
    public boolean hasStage (@Nonnull final String stage) {

        return this.stages.contains(stage);
    }

    @Override
    public void addStage (@Nonnull final String stage) {

        // unsupported
    }

    @Override
    public void removeStage (@Nonnull final String stage) {

        // unsupported
    }

    @Override
    public void clear () {

        // unsupported
    }

    @Override
    public void readFromNBT (NBTTagCompound tag) {

        // unsupported
    }

    @Override
    public NBTTagCompound writeToNBT () {

        // unsupported
        return null;
    }

    public String getFakePlayerName () {
        
        return fakePlayerName;
    }
}
