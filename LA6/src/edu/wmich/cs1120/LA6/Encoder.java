package edu.wmich.cs1120.LA6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class Encoder implements IEncoder {

    @Override
    public void encode(String inputFileName, String outputFilePath) {

        Random rnd = new Random();
        File inFile = new File(inputFileName);
        String inputText = "";

        try {
            Scanner scanInFile = new Scanner(inFile);

            while (scanInFile.hasNextLine()) {

                if (inputText.compareTo("") != 0) {
                    inputText = inputText + "\n";
                }

                inputText = inputText + scanInFile.nextLine();

            }

            scanInFile.close();


        } catch (FileNotFoundException e) {
            System.out.println("Error while reading input: " + e.getMessage());
        }

        try {
            RandomAccessFile outFile = new RandomAccessFile(outputFilePath, "rw");

            outFile.setLength(0);
            
            char[] inputCharArr = inputText.toCharArray();
            int rndOffset = 1;

            for (int i = 0; i < inputCharArr.length; i++) {

                outFile.writeChar(inputCharArr[i]);

                if (i != (inputCharArr.length - 1)) {
                    rndOffset = rnd.nextInt(20) + 1;
                    outFile.writeInt(rndOffset);
                    outFile.seek(outFile.getFilePointer() + rndOffset);
                } else {
                	outFile.writeInt(-1);
                }

            }

            outFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error while writing output: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Something modified the Char Array during encoding!!!");
            e.printStackTrace();
        }

    }

}