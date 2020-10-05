package hu.training360.javase.html.container;

import hu.training360.javase.html.controller.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    List<HtmlElement> he = new ArrayList<>();

    private boolean formattedHtml;          // formázott vagy ömlesztett html legyen?
    private String htmlTitle;

    //Alapértelmezett scriptek, most a gombok tiltásához, engedélyezéséhez
    private String scripts="function disableButton(btnid) {document.getElementById(btnid).disabled = true;}function enableButton(btnid) {document.getElementById(btnid).disabled = false;}";

    public HtmlDocument(String htmlTitle, boolean formattedHtml) {
        this.formattedHtml = formattedHtml;
        this.htmlTitle = htmlTitle;
    }

    public HtmlDocument(String htmlTitle, boolean formattedHtml, String scripts) {
        this.formattedHtml = formattedHtml;
        this.htmlTitle = htmlTitle;
        this.scripts = scripts;
    }

    public void add(HtmlElement... newHtmlElements) {
        for (HtmlElement i : newHtmlElements) {
            he.add(i);
        }
    }

    public String htmlGenerate() {
        StringBuilder sb=new StringBuilder();
        sb.append("<!DOCTYPE html>"+(formattedHtml?"\n":""));
        sb.append("<html>"+(formattedHtml?"\n   ":""));
        sb.append("<head>"+(formattedHtml?"\n      ":""));
        sb.append("<title>");
        sb.append(htmlTitle);
        sb.append("</title>"+(formattedHtml?"\n   ":""));
        sb.append("</head>"+(formattedHtml?"\n   ":""));
        sb.append("<body>"+(formattedHtml?"\n":""));

        for (HtmlElement i : he) {
            sb.append(i.toString(2,formattedHtml));
        }

        if (scripts!="") {
            sb.append((formattedHtml?"      ":"")+"<script>"+(formattedHtml?"\n":""));
            sb.append((formattedHtml?"         ":"")+scripts+(formattedHtml?"\n":""));
            sb.append((formattedHtml?"      ":"")+"</script>"+(formattedHtml?"\n":""));
        }

        sb.append((formattedHtml?"   ":"")+"</body>"+(formattedHtml?"\n":""));
        sb.append("</html>"+(formattedHtml?"\n":""));

        return sb.toString();
    }
}
