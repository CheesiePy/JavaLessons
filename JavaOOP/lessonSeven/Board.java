public class Board {
   private int size;
   private String name;
   public static Integer boardCount = 0;
   public Integer id = 0;



   public Board(){
    boardCount++;
    id = boardCount;
    this.size = 5;
    this.name = "May";
}
// חתימה של מטודה זה שם + הרשאה + פרמטרים 

@Overload
public Board(int s){
    boardCount++;
    id = boardCount;
    this.size = s;
    this.name = "May";

}



public Board(int s, String name){
    boardCount++;
    id = boardCount;
    this.size = s;
    this.name = name;

}


   public void setSize(int a){
    if (a > 12){
        this.size = 12;
        return;
    }
    this.size = a;
   }

   public void setSize(int a,int b){
    if (a > b){
        this.size = (b + a);
        return;
    }
    this.size = a;
   }


   public int getSize(){
        return this.size;
   }

   public String toString(){
        return "Hello world";
   }


}
