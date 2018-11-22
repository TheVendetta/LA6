package edu.wmich.cs1120.LA6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.*;

public class Decoder implements IDecoder{

	@Override
	public void decode(String filePath) throws IOException {
		String message = "";
		int counter = 0;
		int pos;
		char letter;
		try {
			RandomAccessFile inFile = new RandomAccessFile(filePath,"r");
			while(counter != -1) {
				letter = inFile.readChar();
				message = message + letter;
				counter = inFile.readInt();
				pos = (int) inFile.getFilePointer();
				inFile.seek(counter + pos);
			}
			System.out.println(message);
			
		}
		catch(FileNotFoundException E){
			System.out.println("File not found");
		}
		
		
		
	}

	
	
}
