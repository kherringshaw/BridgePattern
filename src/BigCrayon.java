public class BigCrayon extends Crayon {
   private int size;

   public BigCrayon(int size, MakeCrayon makeCrayon) {
      super(makeCrayon);
      this.size = size;  

   }

   public void draw() {
      makeCrayon.makeCrayon(size);
   }
}