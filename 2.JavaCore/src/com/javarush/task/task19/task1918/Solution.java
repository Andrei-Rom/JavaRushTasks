package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        br.close();

        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder();

        while (reader.ready()) {
            sb.append(reader.readLine());
        }

        for (int i = 0; i < args.length; i++) {
            String line = sb.toString();
            line = line.replaceAll("\\r","");
            Document doc = Jsoup.parse(line, "", Parser.xmlParser());
            Elements elements = doc.select(args[0]);
            for (Element els : elements) {
                System.out.println(els);
                System.out.println();
            }
        }
        fr.close();
    }
}