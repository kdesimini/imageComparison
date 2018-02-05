package edu.bsu.kdesimini;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ReadImageData imageData = new ReadImageData();
	Scanner scanner = new Scanner(System.in);
	String path1 = scanner.nextLine();
	String path2 = scanner.nextLine();
	ArrayList picture1Data = imageData.fileIO(path1);
	ArrayList picture2Data = imageData.fileIO(path2);

	Compare comparator = new Compare();
	System.out.println(comparator.doComparison(picture1Data, picture2Data));

    }
}
