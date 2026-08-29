package ambl.logic.lbt;

import arc.scene.ui.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.graphics.g2d.*;

// when tapped, will invert collapse
public class AssembleTreeItem extends CheckBox {
    public Seq<AssembleTreeItem> children;
    public static final TextureRegion upArrow;
    public static final TextureRegion downArrow;

    public AssembleTreeItem(String label, String text, boolean touchable) {
        this.label = label;
        this.text = text;
        this.setDisabled(!touchable);
        if(!touchable) {
            this.style.checkBoxOn == null
            this.style.checkBoxOff == null
            this.style.checkBoxOnDisabled == null
            this.style.checkBoxOffDisabled == null
            this.invalidateHierarchy()
        }
    }

    public void setAlwaysCollapsedState(boolean state) {
        if(state) {

        } else {

        }
    }
}