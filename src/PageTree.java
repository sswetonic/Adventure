import java.util.LinkedList;
import java.util.Queue;

public class PageTree {
    private PageNode root;

    public PageTree() { root = null; }

    public PageTree(Integer rootData) {
        root = new PageNode(rootData, "", false);
    }

    public PageTree(PageNode root) {
        this.root = root;
    }

    public PageNode getRoot() { return root; }

    public void setRoot(PageNode root) { this.root = root; }

    //Returns a PageNode by the page number
    public PageNode getPageNode(Integer page) {
        Queue<PageNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            PageNode current = q.remove();
            if (current.getPage().equals(page)) {
                return current;
            }
            q.addAll(current.getChildren());

        }
        return null;
    }
}
