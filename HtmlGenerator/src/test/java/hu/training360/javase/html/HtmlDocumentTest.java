package hu.training360.javase.html;

import hu.training360.javase.html.container.HtmlDocument;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class HtmlDocumentTest {

    @Test
    public void emptyHtmlDocument() {
        String htmlEmptyDoc = "<!DOCTYPE html><html><head><title>Teszt, üres, formázatlan HTML dokument</title></head><body></body></html>";
        HtmlDocument htmlTestDocument = new HtmlDocument("Teszt, üres, formázatlan HTML dokument", false,"");
        assertThat(htmlTestDocument.htmlGenerate(), equalTo(htmlEmptyDoc));
    }



}