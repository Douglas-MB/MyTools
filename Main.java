import java.util.ArrayList;

public class Main {
    static int x=0;
    int exp;

    public int seqA(int n, int a){
        exp = n*x +a;
        x++;
        return exp;
    }

    public int seqB(int n, int a){
        exp = n*x*x + a;
        x++;
        return exp;
    }


    public static void main(String[] args)
    {
        MyTools.clean();

        ArrayList<ArrayList<Integer>> valueListA = new ArrayList<>();
        ArrayList<Integer> valueListB;

        Main test = new Main();
        int n=1;
        System.out.println();
            for (int i = 0; i < 8; i++) {
                valueListB = new ArrayList<>();
                for (int j = 0; j < 8; j++) {
                    if(i>3){
                        valueListB.add(test.seqB(n,1));
                    } else {
                        valueListB.add(test.seqA(n, 1));
                    }
                }
                if (i==3){
                    n=0;
                }
                n++;
                valueListA.add(valueListB);
                Main.x=0;
            }

        for (int i = 0; i < valueListA.size(); i++) {
            System.out.printf("n = %02d: ",i+1);
            for (int j = 0; j < 8; j++) {
                System.out.printf(" %03d ",valueListA.get(i).get(j));
            }

            n = n+1;
            System.out.println();
        }
        System.out.println();
        int aux;
        int auxB;
        for (int i = 0; i < valueListA.size(); i++) {
            for (int j = 0; j <8; j++) {
                auxB = j +1;
                if(auxB>= valueListA.size()){
                    auxB = j;
                }
                aux = valueListA.get(i).get(j) - valueListA.get(i).get(auxB);
                System.out.printf(" %03d ", -(aux));
            }
            System.out.println();
        }

    }
}