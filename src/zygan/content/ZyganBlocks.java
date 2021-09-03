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

import zygan.content.*;

import static mindustry.type.ItemStack.with;

public class ZyganBlocks implements ContentList {
	public static Block ultimateduo, makria, burst;

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
        }};
	    
       makria = new ItemTurret("makria"){{
	    requirements(Category.turret, with(Items.copper, 35), true);
	    shootType = makriaBullet(10f);
	    spread = 1f;
            shots = 1;
            alternate = true;
            reloadTime = 80f;
            restitution = 0.03f;
            range = 500;
            shootCone = 9f;
            ammoUseEffect = Fx.casing1;
            health = 200;
            inaccuracy = 0.0001f;
            rotateSpeed = 5f;
        }};
	    
       burst = new ItemTurret("burst"){{
            requirements(Category.turret, with(Items.copper, 100, Items.graphite, 80, Items.titanium, 50));
            ammo(
                Items.pyratite, Bullets.standardIncendiary,
                Items.silicon, Bullets.standardHoming,
                Items.thorium, Bullets.standardThorium
            );

            size = 2;
            range = 190f;
            reloadTime = 0.0001f;
            restitution = 0.03f;
            ammoEjectBack = 3f;
            cooldown = 0f;
            recoilAmount = 3f;
            shootShake = 1f;
            burstSpacing = 3f;
            shots = 4;
            ammoUseEffect = Fx.casing2;
            health = 240 * size * size;
            shootSound = Sounds.shootBig;
	    
        }};
    }
}
