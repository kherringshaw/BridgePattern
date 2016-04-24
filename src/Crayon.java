

public abstract class Crayon {
	
	
   protected MakeCrayon makeCrayon;
   
   protected Crayon(MakeCrayon makeCrayon){
      this.makeCrayon = makeCrayon;
   }
   public abstract void draw();	
   
}