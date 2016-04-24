
//Use the Crayon and MakeCrayon classes to draw different colored crayons.


public class Client {
	
   public static void main(String[] args) {
	   
      Crayon redCircle = new BigCrayon(100, new RedCrayon());
      Crayon greenCircle = new BigCrayon(100, new GreenCrayon());

      redCircle.draw();
      greenCircle.draw();
   }
}