package zygan;

import zygan.content.*;
import mindustry.ctype.*;
import mindustry.mod.*;

import static mindustry.Vars.*;

public class ZyganMod extends Mod{
    public final ContentList[] zyganContent = {
		new ZyganBlocks()
	};

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        for(ContentList list : zyganContent){
            list.load();
        }
    }
}