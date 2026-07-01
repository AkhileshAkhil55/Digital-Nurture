import java.util.*;
public class Ecommerce {
    public static void main(String[] args) {
        String [] products ={"Computer","playStation","Tv","laptop"};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("The product to be Searched "+s );
        boolean flag = false;
        for(int i = 0 ;i<products.length;i++)
        {
            if(products[i].equalsIgnoreCase(s))
            {
                System.out.println("Product is found at index "+i);
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("Product not found");
    }
}