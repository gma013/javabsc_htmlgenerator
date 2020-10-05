package hu.training360.javase.html;



import hu.training360.javase.html.controller.HtmlBr;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class HtmlBrTest {

    @Test
    public void unformattedBr() {
        String htmlPart = "<br>";
        HtmlBr htmlbr=new HtmlBr();
        assertThat(htmlbr.toString(0,false), equalTo(htmlPart));
    }

    @Test
    public void formattedBr() {
        String htmlPart = "      <br>\n";
        HtmlBr htmlbr=new HtmlBr();
        assertThat(htmlbr.toString(2,true), equalTo(htmlPart));
    }

}