import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

public class copyFile {



    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\z.cai\\readme.txt";
        String dest = "C:\\Users\\z.cai\\readme2.txt";

        java.io.File sourceFile = new java.io.File(source);
        java.io.File destFile = new java.io.File(dest);



//        copyFileUsingFileStreams(sourceFile,destFile);

        fileDetail(destFile);


    }
    private static void copyFileUsingFileStreams(java.io.File source, java.io.File dest) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }
    }
    private static void fileDetail(java.io.File file) throws IOException {
        Path path = file.toPath();
        long size = Files.size(path);
        FileTime lastModifiedTime = Files.getLastModifiedTime(path);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
//        String format = simpleDateFormat.format(lastModifiedTime);
        System.out.println("date:"+lastModifiedTime.toString());
        System.out.println("file size:"+size);
    }

}