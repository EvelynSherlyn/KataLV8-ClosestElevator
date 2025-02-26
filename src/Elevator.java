public class Elevator {

    public static String call(int left, int right, int call) {
        //Math.abs() Nos da el número absoluto. Por lo que, no da negativo y es perfecto para calcular distancia.
        int izq= Math.abs(left-call);   int der=Math.abs(right-call);
        if (left == call && right != call) {
            return "left";
        } else if (right==call && left != call) {
            return "right";
        }else if(izq<der){ //Si la distancia de la derecha al call es mayor que al de la izquierda, nos devolverá izquierda
            return "left";
        } else {
            return "right";
        }
    }
}
