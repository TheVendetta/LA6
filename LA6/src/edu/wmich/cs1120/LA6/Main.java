package edu.wmich.cs1120.LA6;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		IEncoder encoder = new Encoder();
		IDecoder decoder = new Decoder();
		String inputFileName = "input.txt";
		String encodedFileName = inputFileName + ".encode";
		encoder.encode(inputFileName, encodedFileName);
		decoder.decode(encodedFileName);
	}
}
