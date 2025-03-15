 abstract class ReadingMaterial {

    private String title;
    private  int year;
    private String author;

    ReadingMaterial(String title, int year, String author){
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public int getYear(){
        return year;
    }

    public String getAuthor(){
        return author;
    }


    abstract void displayDetails();

}

class Book extends ReadingMaterial{

  private String genre;

    Book(String title, int year, String author, String genre){
        super(title, year, author);
        this.genre = genre;
    }


    public String getGenre(){
        return genre;
    }


    @Override
    void displayDetails(){
        System.out.println("Title: " + getTitle());
        System.out.println("Year: " + getYear());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getGenre());
    }
}

class Magazine extends ReadingMaterial{

    private int issueNumber;

    Magazine(String title, int year, String author, int issueNumber){
        super(title, year, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber(){
        return issueNumber;
    }

    @Override
    void displayDetails(){
        System.out.println("Title: " + getTitle());
        System.out.println("Year: " + getYear());
        System.out.println("Author: " + getAuthor());
        System.out.println("Category: " + getIssueNumber());
    }
}

class Library {

    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 2001, "J.K. Rowling", "Fantasy");
        Magazine magazine = new Magazine("National Geographic", 2020, "National Geographic Society", 1);

        book.displayDetails();
        magazine.displayDetails();
    }
}