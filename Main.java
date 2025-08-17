import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> candidateVotes = new LinkedHashMap<>();

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line !=null){

                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (candidateVotes.containsKey(name)) {
                    int votesSoFar = candidateVotes.get(name);
                    candidateVotes.put(name, count + votesSoFar);
                }
                else {
                    candidateVotes.put(name, count);
                }

                line = br.readLine();
            }
            for (String key : candidateVotes.keySet()){
                System.out.println(key + ": " + candidateVotes.get(key));
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }
}