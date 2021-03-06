package zygan.content;

import arc.*;
import arc.graphics.*;
import arc.math.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.game.EventType.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.io.*;
import mindustry.world.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.graphics.*;

import static mindustry.Vars.*;

public class ZyganBullets implements ContentList{
    public static BulletType makriaBullet;
  
    @Override
    public void load(){
        makriaBullet = new ArtilleryBulletType(2f, 10, "shell"){{
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
