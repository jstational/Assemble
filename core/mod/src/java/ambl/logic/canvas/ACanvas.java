package ambl.logic.canvas;

import mindustry.logic.*;
import arc.scene.ui.*;
import arc.*;
import ambl.logic.*;
import arc.scene.event.*;
import arc.input.*;

public class ACanvas extends LCanvas {
    public ACanvas() {
        canvas = this;

        Core.scene.addListener(new InputListener() {
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int p, KeyCode button) {
                if(button == KeyCode.mouseLeft) {}
            }
        });

        rebuild();
    }

    @Override
    public void rebuild() {}
}