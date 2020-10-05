package hu.training360.javase.html.controller;

import hu.training360.javase.html.other.HtmlStyle;

public class HtmlP extends HtmlElement {
    private String text;

    public HtmlP(HtmlStyle style, String text) {
        this.text = text;
        this.style=style.toString();
    }

    @Override
    public String toString(Integer tabLevel, boolean formatted) {
        return (formatted?" ".repeat(tabLevel*3):"")+"<p "+style+">"+text+"</p>"+(formatted?"\n":"");
    }

}
