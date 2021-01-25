
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        int games = 0;
        int win = 0;
        int lose = 0;

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        try ( Scanner read = new Scanner(Paths.get(file))) {

            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] parts = line.split(",");

                if (parts[0].equals(team)) {
                    games++;
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        win++;
                    }else{
                    lose++;
                    }
                }
                if (parts[1].equals(team)) {
                    games++;
                 if(Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])){
                win++;
                }else{
                lose++;}
                }
            }
        } catch (Exception e) {
            System.out.println("Error with the file: " + file);
        }
        System.out.println("Games: "+games);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+lose);
    }
}
