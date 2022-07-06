public class Board {
   private int size;


   public void setSize(int a){
    if (a > 12){
        this.size = 12;
        return;
    }
    this.size = a;
   }

   public int getSize(){
        return this.size;
   }
}
