import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    private PageTree book;

    public void play() throws FileNotFoundException {
        book = ParseFile.parseFile("src/adventureOne.csv");
    }

    public static void main(String[] args) throws FileNotFoundException{
        Driver driver = new Driver();
        driver.play();
    }
}
