import java.util.ArrayList;
import java.util.List;

class Author {
// Atributos
private String name;
private List<Book> books; // Lista de libros

// Constructor
public Author(String name) {
this.name = name;
this.books = new ArrayList<>(); // Inicializa la lista de libros
}

// Método para agregar un libro (con objeto Book)
public void addBook(Book book) {
books.add(book);
}

// Sobrecarga del método addBook para aceptar título y precio
public void addBook(String title, double price) {
Book newBook = new Book(title, this, price); // Crea un libro con el autor actual
books.add(newBook);
}

// Método para obtener la lista de libros del autor
public List<Book> getBooks() {
return books;
}

// Método para obtener el nombre del autor
public String getName() {
return name;
}
}

// Clase Book
class Book {
// Atributos
private String title;
private Author author;
private double price;

// Constructor
public Book(String title, Author author, double price) {
this.title = title;
this.author = author;
this.price = price;
}

// Método para obtener información del libro
public String getInfo() {
return "Título: " + title + ", Autor: " + author.getName() + ", Precio: $" + price;
}

// Método para obtener el título del libro
public String getTitle() {
return title;
}

// Método para obtener el precio del libro
public double getPrice() {
return price;
}

// Método para obtener el autor del libro
public Author getAuthor() {
return author;
}
}

// Clase principal para probar el código
class Main {
public static void main(String[] args) {
// Crear un autor
Author author = new Author("Gabriel García Márquez");

// Crear libros con el objeto Book
Book book1 = new Book("Cien años de soledad", author, 20.99);
author.addBook(book1);

// Agregar otro libro usando la sobrecarga de addBook()
author.addBook("El amor en los tiempos del cólera", 15.49);

// Mostrar los libros del autor
System.out.println("Libros escritos por " + author.getName() + ":");
for (Book book : author.getBooks()) {
System.out.println(book.getInfo());
}
}
}