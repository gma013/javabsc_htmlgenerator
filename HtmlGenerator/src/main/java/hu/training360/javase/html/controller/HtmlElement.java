package hu.training360.javase.html.controller;


//import com.sun.jdi.IntegerType;

//import java.util.ArrayList;
//import java.util.List;

import hu.training360.javase.html.container.HtmlDiv;
import hu.training360.javase.html.container.HtmlSpan;
import hu.training360.javase.html.other.HtmlStyle;

public abstract class HtmlElement {

    // elvileg minden html objektumon értelmezett dolgok:
    protected String id;              // egyedi azonosítója a html elemnek
    protected String onClick;         // onClick-re futtatandó eljárás
    protected String style;           // stílus szöveges formában


//    public String getId() { return id; }

    // ---------------------------------------------------------------------------------------------------------
    // toString, ezt a gyerekosztályokban kell megírni, hogy pontosan milyen formátumban adja vissza az elemet
    // ---------------------------------------------------------------------------------------------------------
    public abstract String toString(Integer tabLevel, boolean formatted);


    // alábbiak akár el is hagyhatóak, de akkor csak "htmlDocument.add(new HtmlBr());" formátumban adható hozzá,
    // és nem használható pl a "htmlDocument.add(HtmlElement.Br());" formátum

    // -----------------------
    // BUTTON
    // -----------------------
    static public HtmlElement Button(HtmlStyle elementStyle, String caption, String onClick) {
        return new HtmlButton(elementStyle, caption, onClick, false, "");
    }

    static public HtmlElement Button(HtmlStyle elementStyle, String caption, String onClick, boolean disabled) {
        return new HtmlButton(elementStyle, caption, onClick, disabled, "");
    }

    static public HtmlElement Button(HtmlStyle elementStyle, String caption, String onClick, boolean disabled, String id) {
        return new HtmlButton(elementStyle, caption, onClick, disabled, id);
    }

    // -----------------------
    // BR
    // -----------------------
    static public HtmlElement Br() {
        return new HtmlBr();
    }

    // -----------------------
    // DIV
    // -----------------------
    static public HtmlElement Div(HtmlStyle elementStyle,HtmlElement... divelements) {
        return new HtmlDiv(elementStyle,divelements);   }

    // -----------------------
    // H1-H...
    // -----------------------
    static public HtmlElement H1(HtmlStyle elementStyle,String text) {
        return new HtmlH1(elementStyle, text);
    }

    static public HtmlElement H2(HtmlStyle elementStyle,String text) {
        return new HtmlH2(elementStyle, text);
    }

    // -----------------------
    // P
    // -----------------------
    static public HtmlElement P(HtmlStyle elementStyle,String text) {
        return new HtmlP(elementStyle, text);
    }

    // -----------------------
    // SPAN
    // -----------------------
    static public HtmlElement Span(HtmlStyle elementStyle,HtmlElement... divelements) {
        return new HtmlSpan(elementStyle,divelements);   }

}
