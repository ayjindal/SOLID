package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements IWriter
{
    private String _fileName;

    public MyFileWriter(String fileName)
    {
        _fileName = fileName;
    }

    @Override
    public void write(String encodedLine) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(_fileName));
        writer.write(encodedLine);
        writer.close();
    }
}
