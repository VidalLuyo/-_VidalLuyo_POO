package S03_00;

/**
 *
 * @author Usuario
 */
public class S03_00_Switch {

    public static void main(String[] args) {

        int a = 12;

        switch (a) {
            case 1:
                System.out.println("opcion 1");
                break;
            case 2:
                System.out.println("opcion 2");
                break;
            default:
                System.out.println("No encontre las opciones");
                break;

        }

        String b = "pantalon";
        switch (b) {
            case "polo":
                System.out.println("estas comprando un polo");
                break;
            case "short":
                System.out.println("estas comprando un short");
                break;
            case "chompa":
                System.out.println("estas comprando un chompa");
                break;
            default:
                System.out.println("No encotre la prenda");
                break;
        }
    }
}
