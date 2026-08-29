package ambl.logic;

import mindustry.logic.*;

public class AssembleDialog extends LogicDialog {
    public AssembleVarsList sideVars;

    public AssembleDialog() {
        this.canvas = new AssembleCanvas();
        this.globalsDialog = new AssembleGlobalVarsDialog();
    }
}