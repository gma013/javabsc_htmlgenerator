package hu.training360.javase.html.container;

import hu.training360.javase.html.other.HtmlStyle;
import hu.training360.javase.html.controller.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class HtmlOl extends HtmlElement {

    List<HtmlElement> docElements = new ArrayList<>();

    private String divStyle;

    public HtmlOl(HtmlStyle style, HtmlLi... liElements) {
        divStyle=style.toString();
        for (HtmlElement i:liElements) {
            docElements.add(i);
        }
    }

    @Override
    public String toString(Integer tabLevel, boolean formatted) {
        StringBuilder sb=new StringBuilder();

        sb.append((formatted?" ".repeat(tabLevel*3):"")+"<ol "+divStyle+">"+(formatted?"\n":""));
        tabLevel=tabLevel+1;
        for (HtmlElement i: docElements) {
            sb.append(i.toString(tabLevel, formatted));
        }
        tabLevel=tabLevel-1;
        sb.append((formatted?" ".repeat(tabLevel*3):"")+"</ol>"+(formatted?"\n":""));

        return sb.toString();
    }


}
