package ambl;

import mindustry.mod.*;
import mindustry.*;
import ambl.ui.*;
import arc.scene.ui.*;

public class Assemble extends Mod {
    public static Dialog mbw = new Dialog();
    public static Dialog replacem;

    @Override
    public void init() {
        /** assemble isnt compatible with mobile, even if i tried, ui would be garbage! */
        if(Vars.mobile || Vars.ios || Vars.android || Vars.testMobile) {
            if(replacem == null) {
                mbw.show();
            } else {
                replacem.show();
            }
        } else {
            Vars.ui.logic = new ADialog();
        }
    }


}