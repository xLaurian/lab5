import java.util.Arrays;
class Book implements Comparable<Book> {
    private String title;
    private String[] authors;
    private int year;
    private String publisher;
    private int recommendedAge;
    private float price;

    public Book(String title, int year, String publisher, int recommendedAge, float price) {
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.recommendedAge = recommendedAge;
        this.price = price;
        this.authors = new String[3]; // Vectorul de autori are dimensiunea 3 la început
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void addAuthor(String author) {
        int currentLength = authors.length;
        if (currentLength >= authors.length) {
            // Duplicăm capacitatea vectorului de autori
            authors = Arrays.copyOf(authors, currentLength * 2);
        }
        // Adăugăm noul autor la vectorul de autori
        authors[currentLength] = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", recommendedAge=" + recommendedAge +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.recommendedAge, o.recommendedAge);
    }
}
