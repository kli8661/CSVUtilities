package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<Controller> fromCSV()
    {
        Path pathToFile = Paths.get("src/2012_SAT_Results.csv");
        List<Controller> sat = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.UTF_8))
        {
            String line = br.readLine();
            line = br.readLine();
            while(line != null)
            {
                String[] attributes = line.split(",");

                Controller temp = createStats(attributes);

                sat.add(temp);

                line = br.readLine();
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return sat;
    }

    private static Controller createStats(String[] metadata)
    {
        String school = metadata[0];
        int takers = Integer.parseInt(metadata[1]);
        int average = Integer.parseInt(metadata[2]);
        int read = Integer.parseInt(metadata[3]);
        int math = Integer.parseInt(metadata[4]);
        int write = Integer.parseInt(metadata[5]);
        return new Controller(school,takers,average,read,math,write);
    }
}
