package com.via_xml;

public class ReaderService {
    private FileReader reader;
    public ReaderService() {
        System.out.println("Inside def const");
    }

    public ReaderService(FileReader reader) {
//        System.out.println("Inside const");
        this.reader = reader;
    }

    public void setReader(FileReader reader) {

        System.out.println("Inside setter");
        this.reader = reader;
    }

    public void action() {
        reader.print();
    }
}
