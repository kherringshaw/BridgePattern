

public class GreenCrayon implements MakeCrayon {
	
   @Override
   public void makeCrayon(int size) {
      System.out.println("Making Crayon[ color: green, size: " + size +  "]");
   }
}