package comoprogramarenjava;

import java.util.ArrayList;
import java.util.List;

public class C76 {
    private List<Integer> numeros = new ArrayList<>(); // variable de instancia, no local

    public void agregar(int n) {
        numeros.add(n);
    }

    

    public static void main(String[] args) {
        C76 objeto = new C76(); // ACÁ SÍ creás un objeto de la clase
        objeto.agregar(10);
        objeto.agregar(20);

        System.out.println(objeto); // Java llama a toString() automáticamente
    }
}
