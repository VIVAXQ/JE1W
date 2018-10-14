import java.util.ArrayList;

public class Clq {
    public boolean res(int kr,int[] ts) {
        ArrayList<Integer> cli = new ArrayList<>();
        int kas;
        int buf;
        int asd2=0;
        int asd5=0;
        for (int i = 0; i < kr; i++) {
            buf = ts[i];
            if ((buf == 25) || (buf == 50) || (buf == 100)) {
                cli.add(buf);
            } else {
                System.out.println("Set correctly");
                break;
            }
        }
        boolean sat = true;
        while (!cli.isEmpty()) {
            kas = cli.get(0);
            if (kas == 25) {
                asd2 = asd2 + 1;
            }
            if (kas == 50) {
                if (asd2 > 0) {
                    asd5 = asd5 + 1;
                    asd2 = asd2 - 1;
                } else {
                    sat = false;
                }
            }
            if (kas == 100) {
                if ((asd2 > 0) && (asd5 > 0)) {
                    asd2 = asd2 - 1;
                    asd5 = asd5 - 1;
                } else {
                    if (asd2 > 2) {
                        asd2 = asd2 - 3;
                    } else {
                        sat = false;
                    }
                }
            }
            cli.remove(0);
        }
        return sat;
    }
}
