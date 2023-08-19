import org.w3c.dom.ls.LSOutput;

public class ENCAPSULAMIENTO {
    //ABSTRACCION REPRESENTACION DE UNA CUENTA DE BANCO Y SUS OPERACIONES
    private int saldo=0 ;
    private String nombre_cliente;
    private String cedula_cliente;

    public void depositar_dinero (int x ) {
        saldo+=x;
    }
    public void retirar_dinero (int x ) {
        saldo-=x;
    }
    public void consulta () {
        System.out.println(saldo);
    }
}
