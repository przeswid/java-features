package p.s.java17features.records;

public class RecordsMain {
  public static void main(String[] args) {
    Client c = new Client("John", "Doe", 99);
    System.out.println("Client: " + c);
    System.out.println("Age: " + c.age());
  }
}
