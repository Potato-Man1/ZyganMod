package zygan;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import zygan.content.*;


import static mindustry.Vars.*;

public class ZyganMod extends Mod{
	public ZyganMod(){}
	
	@Override
	public void loadcontent(){
		new ZyganBlocks.load();
		new ZyganBullets.load();
	}
}
