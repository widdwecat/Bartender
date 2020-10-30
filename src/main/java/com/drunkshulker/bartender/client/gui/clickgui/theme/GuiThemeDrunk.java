package com.drunkshulker.bartender.client.gui.clickgui.theme;

public class GuiThemeDrunk implements GuiTheme{
    @Override
    public int bgFill() {
        return 0x66000000;
    }

    @Override
    public int bgBorder() {
        return 0x888700C6;
    }

    @Override
    public int headerNormal() {
        return 0x338700C6;
    }

    @Override
    public int headerHover() {
        return 0x888700C6;
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
        return "FFA11E";
    }

    @Override
    public String textHover() {
        return "FFFFFF";
    }

    @Override
    public int dropSlot() {
        return 0x667A7A7A;
    }
}