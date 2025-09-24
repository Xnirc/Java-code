public class Test9{
    public static void main(String[] args) {
      int bookcount = 0;
      int totalprice = 100;
      if(bookcount == 0) {
          throw new ArithmeticException("Book count cannot be zero.");
      }
      int pricePerBook = totalprice / bookcount;
      System.out.println("Price per book: " + pricePerBook);
    }
}
