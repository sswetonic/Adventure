
import java.util.LinkedList;
import java.util.Scanner;

public class Playthrough {
    private LinkedList<PageNode> choices = new LinkedList<>();
    private PageTree book;

    public Playthrough(PageTree book) {
        this.book = book;
    }

    public LinkedList<PageNode> getChoices() { return choices; }

    public void playGame() {
        playGame("1");
    }

    public void playGame(String option) {
        PageNode current = book.getPageNode(Integer.parseInt(option));
        Scanner sc = new Scanner(System.in);
        while (!current.getIsEnding()) {
            choices.add(current);
            System.out.println(current.getText());
            System.out.print("Choose an option: ");
            for (PageNode node : current.getChildren()) {
                System.out.printf(String.valueOf(node.getPage()) + " ");
            }
            String choice = sc.next();
            current = book.getPageNode(Integer.parseInt(choice));
        }
        choices.add(current);
        System.out.println(current.getText());

    }

    public void truncateChoices() {
        choices.clear();
    }
}