package dao;



import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class DaoFail {

    public abstract List readFile();

    public boolean saveFile(List<String> file, String filename) {
        BufferedReader bufferedWriter = null;
        try {
            bufferedWriter = new BufferedReader(new FileWriter(System.getProperty("user.dir") + "\\src\\main\\resources\\" + filename + ".txt"));
            for (String str1 : file
            ) {
                bufferedWriter.write(str1);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return true ;
    }
}
