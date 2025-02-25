public class Elevator {

    public static String call(int left, int right, int call) {
        String text = "right";
        int Dleft = left - call;    int Dright = right - call;

        if (left == call && right != call) {
            text = "left";
        }else if(Dright<Dleft){
            return text;
        }else if(Dleft<Dright) {
            text="left";
        }
        return text;
    }
}
