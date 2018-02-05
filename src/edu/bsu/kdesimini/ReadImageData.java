package edu.bsu.kdesimini;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadImageData {
    //returns RGB profile in ArrayList format
    public ArrayList fileIO(String pathToImage) {
        BufferedImage img = null;
        File f;

        //read image
        try {
            f = new File(pathToImage);
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
        }


        ArrayList<Integer> list = new ArrayList();
        //get image width and height and add to list
        int width = img.getWidth();
        int height = img.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                list.add(img.getRGB(i, j));
            }
        }
        return list;
}//main() ends here
}//class ends here
