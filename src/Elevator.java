public class Elevator {

    public static String call(int left, int right, int call) {
        if (left == call && right != call) {
            return "left";
        } else if (right==call && left != call) {
            return "right";
        }else if(call>right && call>left) {
            if (right>left) {
                return "right";
            } else if (left>right) {
                return "left";
            }
        } else if(call<right && call<left) {
            if (right<left) {
                return "right";
            } else if (left<right) {
                return "left";
            }
        }
        return "right";
    }
}
