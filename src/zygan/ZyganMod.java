package zygan;

import zygan.content.*;
import mindustry.ctype.*;
import mindustry.mod.*;

import static mindustry.Vars.*;

public class ZyganMod extends Mod{
	public ZyganMod(){}
	
	@Override
	public void loadcontent(){
		new ZyganBlocks.load();
		new ZyganBullets.load();
	}
}
