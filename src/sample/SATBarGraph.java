package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class SATBarGraph extends Application {

    final static String stuy = "Stuyvesant";
    final static String bronxsci = "Bronx Science";
    final static String statentech = "Staten Island Tech";
    final static String lehman = "Lehman";
    final static String harris = "Townsend Harris";
    final static String queen = "Queen Science";
    final static String bard = "Bard HS";
    final static String stem = "STEM HS";
    final static String bths = "Brooklyn Tech";

    @Override public void start(Stage stage)
    {
        stage.setTitle("2012 SAT Average Test Scores");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);
        bc.setTitle("SAT Summary");
        xAxis.setLabel("School Name");
        yAxis.setLabel("Score Value");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("SAT Tests Taken");
        series1.getData().add(new XYChart.Data(stuy, 832));
    }
}
