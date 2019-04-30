package com.via_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileReader {
    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void print() {
        System.out.println("Read from file " + fileName);
    }
}

class TestSpringXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

       /* FileReader reader1 = context.getBean("fileReaderNew", FileReader.class);

        reader1.setFileName("XmlFile");

        FileReader reader2 = context.getBean("fileReaderNew", FileReader.class);

        reader2.print();*/

        ReaderService service = context.getBean("readerServiceNew", ReaderService.class);

        service.action();
    }
}

/*
* A(D, B)
* B(C, D)
* C()
* D()
* */