package S03_00;
/**
 *
 * @author Usuario
 */
public class S03_00_If_IfElse {
    public static void main(String[] args) {
        
        Boolean a = false;
        int b = 5;
        
        
        if (a) {
            System.out.println("Hola");
        }
        
        if (a) {
            System.out.println("Ejecucion true");
        }else{
            System.out.println("Ejecucion false");
        }
        
        if (b == 10) {
            System.out.println("b vale 10");
        }else if (b == 20){
            System.out.println("b vale 20");
        }else if (b == 30){
            System.out.println("b vale 30");
        }else{
            System.out.println("No cumple");
        }
    }
}
