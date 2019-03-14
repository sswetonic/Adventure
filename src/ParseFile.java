import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseFile {

    public static PageTree parseFile(String filePath) throws FileNotFoundException {
        PageTree adventureTree = new PageTree();
        Scanner sc = new Scanner(new File(filePath));
        List<String[]> fileData = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            fileData.add(data);
        }

        adventureTree.setRoot(new PageNode(1, "", false));
        for (int i = 0; i < fileData.size(); i++) {
            String text = fileData.get(i)[fileData.get(i).length - 1];
            PageNode current = adventureTree.getPageNode(i+1);
            if (!fileData.get(i)[0].equals("ENDING")) {
                current.setText(text);
                for (int j = 0; j < fileData.get(i).length-1; j++) {
                    int childPage = Integer.parseInt(fileData.get(i)[j]);
                    current.addChild(new PageNode(childPage, "", false));
                }
            } else {
                current.setText(text);
                current.setIsEnding(true);
            }
        }
        return adventureTree;
    }
}
