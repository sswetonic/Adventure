import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PageTree {
    private PageNode root;

    public PageTree(Integer rootData) {
        root = new PageNode(rootData);
    }

    public PageTree(PageNode root) {
        this.root = root;
    }

    public PageNode getNode(Integer data) {
        Queue<PageNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            PageNode current = q.remove();
            if (current.getData().equals(data)) {
                return current;
            }
            q.addAll(current.getChildren());

        }
        return null;
    }


}
