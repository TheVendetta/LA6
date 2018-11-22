package edu.wmich.cs1120.LA6;

public interface IEncoder {
	
	/**
	 * 
	 * encodes the message in the input file to the output file. 
	 * If the file at output file path already exists, it will be erased and completely overritten. 
	 * 
	 * @param inputFileName the path of the file to be encoded
	 * @param outputFilePath the path of the encoded file. 
	 */
	public void encode(String inputFileName, String outputFilePath);

}
