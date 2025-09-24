interface chess{
    void moves();
}
class king implements chess{
    public void moves(){
        System.out.println("up,diagonal,horizontal");
    }
}
class Rook implements chess{
    public void moves(){
        System.out.println("Vertical,Horizontal");
    }

}
class Queen implements chess{
    public void moves(){
        System.out.println("Vertical,Horizontal,Diagonal");
    }
}

public class InterfaceDemo{
    public static void main(String[] args) {
        Queen  q = new Queen();
        q.moves();
        
    }
}
