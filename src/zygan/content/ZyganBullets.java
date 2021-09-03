package zygan.content

import arc.*;
import arc.graphics.*;
import arc.math.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.game.EventType.*;
import mindustry.type.*;
import mindustry.graphics.*;

import static mindustry.Vars.world;

public class ZyganBullets implements ContentList{
    public static BulletType makriaBullet;
  
    @Override
    public void load(){
        makriaBullet = new ArtilleyBulletTyoe(2f, 10, "shell")){{
            hitEffect = Fx.flakExplosion;
            knockback = 0.8f;
            lifetime = 75f;
            width = height = 11f;
            collidesTiles = false;
            splashDamageRadius = 25f;
            splashDamage = 33f;
            reloadMultiplier = 1.2f;
            ammoMultiplier = 3f;
            homingPower = 0.5f;
            homingRange = 50f;
        }};
    }
}
