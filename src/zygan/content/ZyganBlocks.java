package zygan.content;

import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.with;

public class ZyganBlocks implements ContentList {
	public static Block ultimateduo;

	@Override
    public void load(){

    	ultimateduo = new ItemTurret("ultimateduo"){{
            requirements(Category.turret, with(Items.copper, 35), true);
            ammo(
                Items.copper, Bullets.standardCopper,
                Items.graphite, Bullets.standardDense,
                Items.pyratite, Bullets.standardIncendiary,
                Items.silicon, Bullets.standardHoming
            );

            spread = 1f;
            shots = 5;
            alternate = true;
            reloadTime = 10f;
            restitution = 0.03f;
            range = 130;
            shootCone = 9f;
            ammoUseEffect = Fx.casing1;
            health = 500;
            inaccuracy = 0.0001f;
            rotateSpeed = 25f;

            limitRange();
        }};
    }
}