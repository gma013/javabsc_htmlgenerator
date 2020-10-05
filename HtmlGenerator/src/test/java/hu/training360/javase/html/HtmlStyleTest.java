package hu.training360.javase.html;

import hu.training360.javase.html.other.HtmlStyle;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class HtmlStyleTest {

    @Test
    public void styleTest() {
        String htmlStyle = "style=\"border:2px solid Black;color:Black; text-align:center;\"";
        HtmlStyle styleTest=new HtmlStyle("solid","2","Black","center","Black");
        assertThat(styleTest.toString(), equalTo(htmlStyle));
    }

}