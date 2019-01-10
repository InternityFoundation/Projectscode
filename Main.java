import java.util.function.UnaryOperator;
//from   w  w  w.j a  va  2  s.c o m
public class Main {

  public static void main(String[] args) {
    UnaryOperator<String> i  = (x)-> x.toUpperCase();
    
    System.out.println(i.apply("java2s.com"));
  }
}