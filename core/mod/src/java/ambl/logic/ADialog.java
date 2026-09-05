package ambl.logic;

import mindustry.logic.*;
import arc.input.*;
import ambl.logic.canvas.*;
import ambl.logic.lists.*;

public class ADialog extends LogicDialog {
    public AVarsList vars;
    public AClassList classes;

    public ADialog() {
        canvas = new ACanvas();

        clearChildren();
        shouldPause = true;
    }
}