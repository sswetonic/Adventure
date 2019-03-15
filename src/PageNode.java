import java.util.ArrayList;
import java.util.List;

public class PageNode {
    private Integer page;
    private String text;
    private boolean isEnding;
    private List<PageNode> children = new ArrayList<>();

    public PageNode(Integer page, String text, boolean isEnding) {

        this.page = page;
        this.text = text;
        this.isEnding = isEnding;
    }

    public Integer getPage() {
        return page;
    }

    public String getText() { return text; }

    public boolean getIsEnding() { return isEnding; }

    List<PageNode> getChildren() { return children; }

    public void setPage(Integer data) {
        this.page = data;
    }

    public void setText(String text) { this.text = text; }

    public void setIsEnding(boolean isEnding) { this.isEnding = isEnding; }



    public void addChild(PageNode child) {
        children.add(child);
    }

    public boolean hasChild(Integer page) {
        for (PageNode node : children) {
            if (node.getPage().equals(page)) {
                return true;
            }
        }
        return false;
    }
}