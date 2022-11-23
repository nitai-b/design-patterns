package patterns.iterator;

public class BrowserHistory {

    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count] = url;
        count++;
    }

    public String pop() {
        count--;
        return urls[count];
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    public void setUrls(String[] urls) {
        this.urls = urls;
    }

    public class ArrayIterator implements Iterator<String> {
        private BrowserHistory history;
        private int index;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
