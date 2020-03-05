package lesson09;
public class Book implements Publication {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean open;
    private Person reader;

    public String details() {
        return "Book{" + "title=" + title + "\n, author="
                + author + "\n, totalPages=" + totalPages 
                + ", currentPage=" + currentPage + ", open=" 
                + open + "\n, reader=" + reader.getName() +
                ", age=" + reader.getAge() +
                ", genre=" + reader.getGenre() +'}';
    }
    
    public Book(String title, String author, int totalPages, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.open = false;
        this.currentPage = 0;
        this.reader = reader;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getTotalPages() {
        return this.totalPages;
    }
    
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    
    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void browse(int p) {
        if(p > this.totalPages) {
            this.currentPage = 0;
        } else {
            this.currentPage = p;
        }
    }

    @Override
    public void nextPage() {
        this.currentPage++;
    }

    @Override
    public void backPage() {
        this.currentPage--;
    }
}
