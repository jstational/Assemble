package ambl.logic;

import mindustry.logic.*;
import arc.input.*;
import ambl.logic.canvas.*;

public class ADialog extends LogicDialog {
    public AVarsList sideVars;

    public ADialog() {
        canvas = new ACanvas();

        clearChildren();
        shouldPause = true;

        /** reset position to 0, 0 */
        keyDown(KeyCode.num0, () -> {

        });

        /** open add block */
        keyDown(KeyCode.period, () -> {

        });

        /** open global vars */
        keyDown(KeyCode.tab, () -> {

        });

        /** exit */
        keyDown(KeyCode.enter, () -> {

        });
    }
}