package Converter.MVC.Konstantin.courses;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CourseDollar extends CourseAbstract implements CourseImplement {


    public void courseVision() {
        init(url);
        System.out.println(course);
    }

    @Override
    public double getCourse(String url) throws IOException {

        Document doc = Jsoup.connect(url).get();

        Elements tables = doc.getElementsByTag("tbody");
        Element table = tables.get(0);
        Elements dollar_elements = table.children();
        String[] dollar = dollar_elements.get(0).text().replace("USD", "").split(" ");
        double course = Double.parseDouble(dollar[1]);
        return course;
    }
}
