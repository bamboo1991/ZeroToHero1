package jiraAPI.JiraApiRequestBoeard;

import java.util.List;

public class BoardPojo {
    private int maxResults;

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

    public boolean getIsLast() {
        return isLast;
    }

    public void setLast(boolean isLast) {
        this.isLast = isLast;
    }

    public List<insideList> getValues() {
        return values;
    }

    public void setValues(List<insideList> values) {
        this.values = values;
    }

    private int startAt;
    private int total;
    private boolean isLast;
    private List<insideList> values;
}
