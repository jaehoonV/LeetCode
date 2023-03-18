class BrowserHistory {
    ArrayList<String> his;
    int leng = 0;
    int i = 0;
    public BrowserHistory(String homepage) {
        his = new ArrayList<String>();
        his.add(homepage);
        leng++;
        i++;
    }

    public void visit(String url) {
        if (his.size() > i) {
            his.set(i, url);
        } else {
            his.add(url);
        }
        i++;
        leng = i;
    }

    public String back(int steps) {
        i = Math.max(1, i - steps);
        return his.get(i - 1);
    }

    public String forward(int steps) {
        i = Math.min(leng, i + steps);
        return his.get(i - 1);
    }
}