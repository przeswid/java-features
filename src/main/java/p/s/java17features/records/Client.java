package p.s.java17features.records;

public record Client(
  String firstName,
  String lastName,
  int age
) // extends RecordCannotExtends
{

  //private int instanceFieldIsNotAllowedInRecord;

  private static int classFieldIsAllowedInRecord = 0;

  public Client {
    System.out.println("Compact constructor is running.");
    if (age > 99) {
      throw new IllegalStateException("Sorry, you're too old for that");
    }
  }

  public int age() {
    System.out.println("Returning age");
    return age;
  }

}
