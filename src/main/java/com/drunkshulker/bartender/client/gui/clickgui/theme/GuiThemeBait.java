package com.drunkshulker.bartender.client.gui.clickgui.theme;

public class GuiThemeBait implements GuiTheme{

    @Override
    public int bgFill() {
        return 0x88000000;
    }

    @Override
    public int bgBorder() {
        return 0x88D50000;
    }

    @Override
    public int headerNormal() {
        return 0x33E20000;
    }

    @Override
    public int headerHover() {
        return 0x88E20000;
    }

    @Override
    public String headerText() {
        return "FFA11E";
    }

    @Override
    public int hoverFill() {
        return 0x66000000;
    }

    @Override
    public String textNormal() {
        return "B5B5B5";
    }

    @Override
    public String textHover() {
        return "FFFFFF";
    }

    @Override
    public int dropSlot() {
        return 0x66000000;
    }
}