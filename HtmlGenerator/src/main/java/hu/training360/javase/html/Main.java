package hu.training360.javase.html;

import hu.training360.javase.html.container.*;
import hu.training360.javase.html.controller.*;
import hu.training360.javase.html.enums.*;
import hu.training360.javase.html.other.*;

public class Main {

    public static void main(String[] args) {

        // Használható stílusszerűségek definiálása az egyes elemekhez
        HtmlStyle styleH1=new HtmlStyle("solid","25","HotPink","center","Blue");
        HtmlStyle styleH2=new HtmlStyle("dotted","1","Black","right","Yellow");
        HtmlStyle styleDiv=new HtmlStyle("solid","2","Black","center","Black");
        HtmlStyle styleText=new HtmlStyle("none","0","Black","left","Blue");
        HtmlStyle styleButton1=new HtmlStyle("solid","2","Red","left","Green");
        HtmlStyle styleButton2=new HtmlStyle("solid","2","Red","center","Green");
        HtmlStyle styleEmpty=new HtmlStyle("none","0","Yellow","center","Blue");

        // Egy új üres html dokumentum létrehozása
        HtmlDocument htmlDocument = new HtmlDocument("Csúnya, csicsás, értelmetlen weboldal", true);

        // csúnya H1, H2 hozzáadása kétféle lehetséges módon
        htmlDocument.add(new HtmlH1(styleH1,"Ez egy H1 szöveg középen, ronda pink keretben..."));
        htmlDocument.add(HtmlElement.H2(styleH2,"Ez a H2 szöveg jobb oldalon, a színválasztás miatt remekül NEMlátszik..."));

        // két üres sor
        htmlDocument.add(HtmlElement.Br());
        //vagy
        htmlDocument.add(new HtmlBr());

        // egy csúnya kis lista...
        HtmlLi li1=new HtmlLi(styleEmpty,new HtmlP(styleText,"Csúnya lista első sora"));
        HtmlLi li2=new HtmlLi(styleEmpty,new HtmlButton(styleButton2,"Listában gomb (libacomb igényléshez nyomd meg 1)","alert('Megnyomtad a gombot...')",false,"buttonId1"));
        HtmlLi li3=new HtmlLi(styleEmpty,new HtmlP(styleText,"Csúnya lista harmadik sora"));
        HtmlLi li4=new HtmlLi(styleEmpty,new HtmlButton(styleButton2,"Lista 4. sorában gomb (libacomb igényléshez nyomd meg 2)","alert('...kapsz egy libacombot')",false,"buttonId2"));
        HtmlOl ol=new HtmlOl(styleText,li1,li2,li3,li4);

        // ez egy kis DIV egy szöveggel, üres sorokkal:
        HtmlDiv div1 = new HtmlDiv(styleDiv,new HtmlBr(), new HtmlP(styleText,"Ez csak egy szöveg"), new HtmlBr());

        // a csúnya listát és a DIV-et egy befoglaló DIV-be tesszük
        HtmlDiv div2 = new HtmlDiv(styleDiv, ol, div1);

        // majd ezt adjuk hozzá a html doksihoz
        htmlDocument.add(div2);

        // végül két gomb, amivel tiltható/engedélyezhető a korábbi 2 gomb
        htmlDocument.add(new HtmlBr());
        htmlDocument.add(new HtmlButton(styleButton1,"Fenti gombok TILTÁSA","disableButton('buttonId1');disableButton('buttonId2');alert('A gombokat tiltom, utána próbálj libacombot igényelni! De nem tudsz! :)');",false,"buttonId3", Button.Types.button));
        htmlDocument.add(new HtmlButton(styleButton1,"Fenti gombok ENGEDÉLYEZÉSE","enableButton('buttonId1');enableButton('buttonId2');",false,"buttonId4"));

        // generált HTML kiiratása
        System.out.println(htmlDocument.htmlGenerate());


    }


}


