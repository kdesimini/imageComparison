package edu.bsu.kdesimini;
import java.awt.*;

public class GetFilePath {

    public String getPath(){
        FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String file = dialog.getFile();

        String string = dialog.getDirectory() + file;
        System.out.println(string);
        return string;
    }
}
