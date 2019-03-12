import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ParseFile {

    public ParseFile(String filePath, PageTree tree) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        String line = sc.nextLine();
        String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

        System.out.println(Arrays.toString(data));
    }

}
