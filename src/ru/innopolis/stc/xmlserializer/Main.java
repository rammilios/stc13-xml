package ru.innopolis.stc.xmlserializer;

import java.beans.ExceptionListener;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.beans.XMLDecoder;
import java.io.FileInputStream;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Students students = new Students();
        students.setId(25436);
        students.setName("Ramil Gaisin");
        students.setStatus(true);

        //Before
        System.out.println(students);
        serializeToXML ( students );
        Students loadedStudents = deserializeFromXML();
        //After
        System.out.println(loadedStudents);
    }

    private static void serializeToXML (Students students) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("Students.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :"+e.toString());
            }
        });
        encoder.writeObject(students);
        encoder.close();
        fos.close();
    }

    private static Students deserializeFromXML() throws IOException {
        FileInputStream fis = new FileInputStream("Students.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        Students decodedSettings = (Students) decoder.readObject();
        decoder.close();
        fis.close();
        return decodedSettings;
    }
}
