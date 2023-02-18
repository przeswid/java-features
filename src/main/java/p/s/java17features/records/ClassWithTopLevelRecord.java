package p.s.java17features.records;

record ExampleRecord(String id) {};

public class ClassWithTopLevelRecord {
  public ExampleRecord getExampleRecord() {
    return new ExampleRecord("1");
  }

  public static void main(String[] args) {
    System.out.println(new ClassWithTopLevelRecord().getExampleRecord());
  }
}
