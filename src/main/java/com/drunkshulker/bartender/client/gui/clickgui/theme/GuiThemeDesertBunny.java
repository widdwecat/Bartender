package com.drunkshulker.bartender.client.gui.clickgui.theme;

public class GuiThemeDesertBunny implements GuiTheme{
    @Override
    public int bgFill() {
        return 0x66000000;
    }

    @Override
    public int bgBorder() {
        return 0x880094FF;
    }

    @Override
    public int headerNormal() {
        return 0x3313287C;
    }

    @Override
    public int headerHover() {
        return 0x8813287C;
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
        return "6BE6FF";
    }

    @Override
    public String textHover() {
        return "FFFFFF";
    }

    @Override
    public int dropSlot() {
        return 0x66004A7F;
    }
}