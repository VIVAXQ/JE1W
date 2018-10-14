import java.util.ArrayList;

public class Numb {
    ArrayList<Integer> nums = new ArrayList<>();
    String Way1="(";
    public String set(int num[])
    {
        int nnm;
        String Way2="";
        for (int i=0; i<=9; i++)
        {
            nnm=num[i];
            if ((nnm<10)&&(nnm>=0))
            {
                nums.add(nnm);
                Way1 = Way1.concat(Integer.toString(nnm));
                if (i==2) {Way1 =Way1.concat(") ");}
                if (i==5) {Way1 =Way1.concat("-");}
            }
            else
            {
                System.out.println("Set correctly");
                break;
            }
        }
        for (int i=1; i<=10; i++)
        {
            Way2 = Way2.concat(Integer.toString(nums.get(0)));
            nums.remove(0);
        }
        return "("+Way2.substring(0,3)+") "+Way2.substring(3,6)+"-"+Way2.substring(6,10);
    }
}
