package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";

    private FileOutputStream component;

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void close() throws IOException {
        component.flush();
        write("JavaRush © All rights reserved.".getBytes());
        component.close();
    }

    public static byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return fileName.getBytes(charsetName);
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    public AmigoOutputStream(FileOutputStream component) throws FileNotFoundException {
        super(fileName);
        this.component = component;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }




}
