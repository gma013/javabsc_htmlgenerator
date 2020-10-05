package hu.training360.javase.html.controller;

import hu.training360.javase.html.other.HtmlStyle;

public class HtmlH2 extends HtmlElement {
    private String text;

    public HtmlH2(HtmlStyle style, String text) {
        this.text = text;
        this.style=style.toString();
    }

    @Override
    public String toString(Integer tabLevel, boolean formatted) {
        return (formatted?" ".repeat(tabLevel*3):"")+"<h2 "+style+">"+text+"</h2>"+(formatted?"\n":"");
    }

}
