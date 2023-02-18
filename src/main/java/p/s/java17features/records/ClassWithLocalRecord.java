package p.s.java17features.records;

public class ClassWithLocalRecord {
  public String getId() {
    record LocalRecord(String id) {};
    return new LocalRecord("1").id();
  }

  public static void main(String[] args) {
    System.out.println(new ClassWithLocalRecord().getId());
  }
}
