package io.github.chaosawakens.tileentity.spawner;

import io.github.chaosawakens.entity.EntEntity;
import io.github.chaosawakens.entity.HerculesBeetleEntity;
import io.github.chaosawakens.registry.ModEntityTypes;
import io.github.chaosawakens.tileentity.CATileEntities;

public class TileEntityHerculesBeetleSpawner extends TileEntityBossSpawner<HerculesBeetleEntity> {

    public TileEntityHerculesBeetleSpawner() {
        super(CATileEntities.HERCULES_BEETLE_SPAWNER.get(), ModEntityTypes.HERCULES_BEETLE.get());
    }

    @Override
    protected int getRange() {
        return LONG_RANGE;
    }
}