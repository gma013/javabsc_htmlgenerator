package hu.training360.javase.html.other;

// --------------------------------
// "Stílusszerűségek" definiálásoz
// --------------------------------

import hu.training360.javase.html.exceptions.InvalidColorException;

import java.util.ArrayList;
import java.util.Arrays;

public class HtmlStyle {

    private String borderStyle;
    private String borderWidth;
    private String borderColor;
    private String textAlign;
    private String textColor;

    private ArrayList<String> styleColors=new ArrayList<>(Arrays.asList("Red", "Cyan", "Blue", "DarkBlue", "LightBlue", "Purple","Yellow","Lime","Magenta","White","Silver","Gray","Grey","Black","Orange","Brown","Maroon","Green","Olive","HotPink"));

    public String getBorderStyle() {
        return "border:" + borderWidth + "px " + borderStyle + " " + borderColor + ";";
    }

    public String getTextStyle() {
        return "color:" + textColor + "; text-align:" + textAlign + ";";
    }


    public HtmlStyle(String borderStyle, String borderWidth, String borderColor, String textAlign, String textColor) {

        if (!styleColors.contains(borderColor)) {
            throw new InvalidColorException("\n  Nem megfelelő bordercolor-t állítottál be! (" + borderColor + ")\n  Amennyiben tényleg érvényes színt adtál meg, akkor add hozzá a HtmlStyle osztály styleColors listájához!\n");
        }
        if (!styleColors.contains(textColor)) {
            throw new InvalidColorException("\n  Nem megfelelő textcolor-t állítottál be! (" + textColor + ")\n  Amennyiben tényleg érvényes színt adtál meg, akkor add hozzá a HtmlStyle osztály styleColors listájához!\n");
        }

        this.borderStyle = borderStyle;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
        this.textAlign = textAlign;
        this.textColor = textColor;

    }

    @Override
    public String toString() {
        //TODO itt még szebb lenne, ha csak akkor adná vissza, ha értelmes adattal ki van töltve (azaz ne legyen kötelező megadni ezeket a stílus létrehozásakor, és akkor üresen maradna)
        return "style=\""+getBorderStyle()+getTextStyle()+"\"";
    }
}
