public class ThroeDemo {
    public void issuebook(String bookname) {
        if (bookname == null || bookname.isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be null or empty.");
        }
        System.out.println("Issuing book: " + bookname);
    }    
    public static void main(String[] args) {
        ThroeDemo library = new ThroeDemo();
        try {
            library.issuebook("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }       
}
