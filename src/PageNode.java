import java.util.ArrayList;
import java.util.List;

public class PageNode {
    private Integer data;
    private List<PageNode> children = new ArrayList<>();

    public PageNode(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    List<PageNode> getChildren() {
        return children;
    }

    public void addChild(PageNode child) {
        children.add(child);
    }
}