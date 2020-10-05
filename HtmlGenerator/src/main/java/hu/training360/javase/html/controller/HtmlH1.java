package hu.training360.javase.html.controller;

import hu.training360.javase.html.other.HtmlStyle;

public class HtmlH1 extends HtmlElement {
    private String text;

    public HtmlH1(HtmlStyle style, String text) {
        this.text = text;
        this.style=style.toString();
    }

    @Override
    public String toString(Integer tabLevel, boolean formatted) {
        return (formatted?" ".repeat(tabLevel*3):"")+"<h1 "+style+">"+text+"</h1>"+(formatted?"\n":"");
    }


}
