import java.util.Random;
import java.util.Scanner;

public class Ladder {

    Scanner sc = new Scanner(System.in);
    Random ran = new Random();

    public int InputInfo(String Questions){
        System.out.println(Questions);
        return sc.nextInt();
    }

    public String[][] LadderInfo(int Player, int LadderHeight){

        String[][] ladder = new String[LadderHeight][Player*2-1];
        MakeLadder(ladder);

        return ladder;
    }

    private void MakeLadder(String[][] ladder){
        String[] RandomLine = {" ", "-"};
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                if (j % 2 == 0){
                    ladder[i][j] = "|";
                } else {
                    ladder[i][j] = RandomLine[ran.nextInt(2)];
                }
            }
        }
    }

    public void PrintLadder(String[][] ladder){
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                System.out.print(ladder[i][j]);
            }
            System.out.println();
        }
    }

}