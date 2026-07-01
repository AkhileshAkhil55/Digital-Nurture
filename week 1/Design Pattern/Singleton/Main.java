class Database{
    private static Database obj = new Database();
    private Database(){
        System.out.println("Object create");
    }
    public static Database getInstance(){
        return obj;
    }
}
public class Main{
    public static void main(String[]args){
        Database d1 = Database.getInstance();
        Database d2 = Database.getInstance();
        System.out.println(d1==d2);
    }
}