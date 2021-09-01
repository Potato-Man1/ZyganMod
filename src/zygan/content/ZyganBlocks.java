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
	    size = 2;
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
	    
	lancer = new PowerTurret("lancer"){{
            requirements(Category.turret, with(Items.copper, 60, Items.lead, 70, Items.silicon, 50));
            range = 165f;
            chargeTime = 20f;
            chargeMaxDelay = 15f;
            chargeEffects = 7;
            recoilAmount = 0.1f;
            reloadTime = 40f;
            cooldown = 0.03f;
            powerUse = 6f;
            shootShake = 2f;
            shootEffect = Fx.lancerLaserShoot;
            smokeEffect = Fx.none;
            chargeEffect = Fx.lancerLaserCharge;
            chargeBeginEffect = Fx.lancerLaserChargeBegin;
            heatColor = Color.blue;
            size = 2;
            health = 280 * size * size;
            targetAir = false;
            shootSound = Sounds.laser;

            shootType = new LaserBulletType(140){{
                colors = new Color[]{Pal.lancerLaser.cpy().a(0.4f), Pal.lancerLaser, Color.white};
                hitEffect = Fx.hitLancer;
                hitSize = 2;
                lifetime = 16f;
                drawSize = 400f;
                collidesAir = true;
                length = 300f;
                ammoMultiplier = 1f;
            }};
        }}; 
    }
}
