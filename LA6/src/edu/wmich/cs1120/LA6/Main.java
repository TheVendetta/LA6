package edu.wmich.cs1120.LA6;

public class Main {


	IEncoder encoder = new Encoder();
	IDecoder decoder = new Decoder();
	String inputFileName = "input.txt";
	String encodedFileName = inputFileName+".encode";
	encoder.encode(inputFileName,encodedFileName);
	decoder.decode(encodedFileName);

	
}
