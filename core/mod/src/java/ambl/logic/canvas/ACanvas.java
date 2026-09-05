package ambl.logic.canvas;

import mindustry.logic.*;
import arc.scene.ui.*;
import arc.*;
import ambl.logic.*;
import arc.scene.event.*;
import arc.input.*;

public class ACanvas extends LCanvas {
    public boolean dragging;

    public ACanvas() {
        canvas = this;
        statements = new ALayout();

        Core.scene.addListener(new InputListener() {
            @Override
            public boolean touchDown(InputEvent e, float x, float y, int p, KeyCode button) {
                if(button == KeyCode.mouseLeft) {
                    dragging = true;
                }

                return super.touchDown(e, x, y, p, button);
            }

            @Override
            public void touchUp(InputEvent e, float x, float y, int p, KeyCode button) {
                if(button == KeyCode.mouseLeft) {
                    dragging = false;
                }
            }
        });

        rebuild();
    }

    @Override
    public void rebuild() {}
}