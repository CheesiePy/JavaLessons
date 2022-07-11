public class ChessBoard extends Board {


    @Override
    public int getSize(){
        this.setSize(super.getSize()+1);
        return super.getSize(); 
    }

    public String toString() {
        return super.toString();
    }
}
