package S03_00;
/**
 *
 * @author Usuario
 */
public class S03_00_Array1 {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 500;
        numeros[3] = 1000;
        numeros[4] = 1500;
        
        System.out.println(numeros[4]);
        
        int[] numeros2 = {10 ,20, 30, 40, 50, 60, 70, 80, 90};
        
        System.out.println(numeros2[2]);
        
        for(int numero : numeros2){
            System.out.println(numero);
        }
        
        for (int i = 0; i <= 7; i++) {
            System.out.println(numeros2[i]+"===");
        }
        
    }
}
