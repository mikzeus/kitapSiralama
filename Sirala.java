package Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Sirala {
    public static void main(String[] args) {
        TreeSet<Book> kitaplar = new TreeSet<>();

        kitaplar.add(new Book("Calikusu", 180, "R.N Guntekin", 1888));
        kitaplar.add(new Book("Kasagi", 230, "Omer Seyfettin", 1930));
        kitaplar.add(new Book("Kibarlik Budalasi", 500, "Moliere", 1860));
        kitaplar.add(new Book("Vadideki Zambak", 1920, "Balzac", 1780));
        kitaplar.add(new Book("siyasetname", 546, "Nizamul Mulk", 1200));

        for (Book k : kitaplar) {
            System.out.println(k.getBookName());
        }
        System.out.println("******************");

        TreeSet<Book> books =new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return 0;
            }
        });
        books.addAll(kitaplar);
        for (Book o: books){
            System.out.println(o.getBookName());
        }

    }

}

