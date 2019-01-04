/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javahtmlparser;

import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
/**
 *
 * @author Alexandr
 */
public class javaHTMLParser {
    
    private static String CHARSET = "utf8";
    private static String ElementId = "make-everything-ok-button";
    
    public static void main(String[] args) throws IOException {
        
        for (int i = 0; i < 5; i++) {
            String fileName = "sample"+Integer.toString(i)+".html";
            File htmlFile = new File(fileName);
            Document doc = Jsoup.parse(htmlFile, CHARSET); 
            Element btnElement = doc.getElementById(ElementId); 

            if (btnElement!=null) {
                System.out.println("File name "+fileName);
                System.out.println(btnElement.text());
            }
        }
        
    }
       
}
