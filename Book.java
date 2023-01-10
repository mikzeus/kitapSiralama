package Collection;

public class Book implements Comparable<Book>{

        private String bookName;
        private int numberOfPage;
        private String authorName;
        private int publishedYear;

        public Book(String bookName, int numberOfPage, String authorName, int publishedYear) {
            this.bookName = bookName;
            this.numberOfPage = numberOfPage;
            this.authorName = authorName;
            this.publishedYear = publishedYear;

        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public int getNumberOfPage() {
            return numberOfPage;
        }

        public void setNumberOfPage(int numberOfPage) {
            this.numberOfPage = numberOfPage;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public int getPublishedYear() {
            return publishedYear;
        }

        public void setPublishedYear(int publishedYear) {
            this.publishedYear = publishedYear;
        }


    @Override
    public int compareTo(Book o) {
        return 0;
    }
}

