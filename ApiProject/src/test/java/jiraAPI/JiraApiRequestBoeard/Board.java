package jiraAPI.JiraApiRequestBoeard;

import java.util.List;

public class Board {
    private int maxResults;
    private int startAt;
    private int total;
    private boolean isLast;
    private List<insideList> values;

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public int getStartAt() {
        return startAt;
    }

    public void setStartAt(int startAt) {
        this.startAt = startAt;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public List<insideList> getValues() {
        return values;
    }

    public void setValues(List<insideList> values) {
        this.values = values;
    }
}
