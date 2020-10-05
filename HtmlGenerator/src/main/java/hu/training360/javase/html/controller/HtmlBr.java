package hu.training360.javase.html.controller;

public class HtmlBr  extends HtmlElement {

    @Override
    public String toString(Integer tlevel, boolean formatted) {
        return (formatted?" ".repeat(tlevel*3):"")+"<br>"+(formatted?"\n":"");
    }
}
