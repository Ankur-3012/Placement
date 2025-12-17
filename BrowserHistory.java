import java.util.Stack;

public class BrowserHistory {

    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = null;
    }

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
        } else {
            System.out.println("No page in back history.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
        } else {
            System.out.println("No page in forward history.");
        }
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();

        bh.visit("google.com");
        bh.visit("github.com");
        bh.visit("stackoverflow.com");
        System.out.println("Current: " + bh.getCurrentPage());

        bh.back();
        System.out.println("After back: " + bh.getCurrentPage());

        bh.back();
        System.out.println("After back: " + bh.getCurrentPage());

        bh.forward();
        System.out.println("After forward: " + bh.getCurrentPage());

        bh.visit("news.ycombinator.com");
        System.out.println("After visiting new: " + bh.getCurrentPage());

        bh.forward();
    }
}
