package edu.bsu.kdesimini;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    	ReadImageData imageData = new ReadImageData();

    	GetFilePath fp = new GetFilePath();
		String path1 = fp.getPath();
		ArrayList picture1Data = imageData.fileIO(path1);


		GetFilePath fp2 = new GetFilePath();
		path1 = fp2.getPath();
		ArrayList picture2Data = imageData.fileIO(path1);

		Compare comparator = new Compare();
		Boolean result = comparator.doComparison(picture1Data, picture2Data);

		if (result.equals(true)){
			System.out.println("***********************");
			System.out.println("The images are a match!");
			System.out.println("***********************");
		}else{
			System.out.println("***************************");
			System.out.println("The images are NOT a match!");
			System.out.println("***************************");
		}


    }
}
