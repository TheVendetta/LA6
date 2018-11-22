package edu.wmich.cs1120.LA6;
import java.io.*;
public interface IDecoder {
	/**
	 * 
	 * decode reads the message encoded by Encoder.encode() 
	 * 
	 * @param filePath the file path of the file to be decoded 
	 * @throws IOException
	 */
	public void decode(String filePath) throws IOException;
}
