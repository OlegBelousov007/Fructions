 public class Math {
        static int naimObKrat(int a, int b) {

            return a * b / naibObDel(a, b);
        }

        static int naibObDel(int a, int b) {

            if (b == 0) {
                return a;
            }
            return naibObDel(b, a % b);
        }
    }

