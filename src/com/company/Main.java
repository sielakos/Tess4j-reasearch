package com.company;

import java.io.File;
import net.sourceforge.tess4j.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(new File(".").getAbsoluteFile());

        File imageFile = new File("/home/mariusz/Obrazy/text01.png");

        ITesseract instance = new Tesseract(); // JNA Interface Mapping
//         ITesseract instance = new Tesseract1(); // JNA Direct Mapping

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
