import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(5.4, 2.8);

    boolean lengthSameWidth = r1.getLength() == r2.Width(); // length of r1 is equal to length of r2
    boolean widthSameLength = r1.getWidth() == r2.getLength();
    boolean isRotated = lengthSameWidth && widthSameLength; // AND 

    Rectangle r3 = new Rectangle();
    Rectangle r4 = new Rectangle();
    
    boolean isCongruent = r1.equals(r2) || (isRotated == true);
    
    double lengthratio = (r1.getLength()) / (r2.getLength());
    double widthRatio = (r1.getWidth()) / (r2.getWidth());
    boolean isSimilar = (isCongruent == true) || (widthRatio == lengthRatio);

    
  }
}
