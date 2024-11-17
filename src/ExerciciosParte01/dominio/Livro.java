package ExerciciosParte01.dominio;

public class Livro {
    private String title;
    private String author;
    private double price;

    public Livro(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Livro (String title, String author, double price) {
        this(title, author);
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("Título: "+title+"\n");
         sb.append("Author: "+author+"\n");
         sb.append("Price: R$ "+price+"\n");
         return sb.toString();
    }
}
