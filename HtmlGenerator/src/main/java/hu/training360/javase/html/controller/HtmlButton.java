package hu.training360.javase.html.controller;

import hu.training360.javase.html.enums.Button;
import hu.training360.javase.html.other.HtmlStyle;

public class HtmlButton extends HtmlElement {
    // alap propokon felül:
    private boolean disabled;
    private String name;    // nincs még használva
    private String type="button";
    private String caption;

    public HtmlButton(HtmlStyle style, String caption, String onClick, boolean disabled) {
        this(style,caption,onClick, disabled,"");  // TODO itt lehetne egyedi generálású ID-t átadni, ha nem definiált (bár gyakorlati haszna talán nem lenne)
    }

    public HtmlButton(HtmlStyle style, String caption, String onClick, boolean disabled, String id) {
        this(style,caption,onClick,disabled,id,Button.Types.button); //
    }

    public HtmlButton(HtmlStyle style, String caption, String onClick, boolean disabled, String id, Button.Types buttonType) {
        this.caption = caption;
        this.onClick=onClick;
        this.disabled = disabled;
        this.style=style.toString();
        this.type = buttonType.name();
        this.id=id;
    }



        @Override
    public String toString(Integer tabLevel, boolean formatted) {
        return (formatted?" ".repeat(tabLevel*3):"")+"<button id=\""+this.id+"\" type=\""+this.type+"\" onclick=\""+onClick+"\""+(disabled ?" disabled":"")+" "+style+">"+caption+"</button>"+(formatted?"\n":"");
    }
}
