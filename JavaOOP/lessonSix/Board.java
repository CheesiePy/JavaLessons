public class Board {
   private int size;
   private String name;
   
    public Board() {
        this.size = 0;
    }

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
