public class FunInterface{
  public static void main(String[] argv) {
    Processor stringProcessor = (String str) -> str.length();
    String name = "Java Lambda";
    int length = stringProcessor.getStringLength(name);
    System.out.println(length);/*  ww  w  .  j  a va 2 s .co  m*/

  }
}

@FunctionalInterface
interface Processor {
  int getStringLength(String str);
}