package steps;

import io.cucumber.java.*;

public class Hooks {

    public Scenario scenario;

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Before scenario");
        this.scenario = scenario;

        String html = "<video width=\"400\" controls>\n" +
                "  <source src=\"mov_bbb.mp4\" type=\"video/mp4\">\n" +
                "  <source src=\"mov_bbb.ogg\" type=\"video/ogg\">\n" +
                "  Your browser does not support HTML video.\n" +
                "</video>";
        String json = "{ \"glossary\": { \"title\": \"example glossary\", \"GlossDiv\": { \"title\": \"S\", \"GlossList\": { \"GlossEntry\": { \"ID\": \"SGML\", \"SortAs\": \"SGML\", \"GlossTerm\": \"Standard Generalized Markup Language\", \"Acronym\": \"SGML\", \"Abbrev\": \"ISO 8879:1986\", \"GlossDef\": { \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\", \"GlossSeeAlso\": [\"GML\", \"XML\"] }, \"GlossSee\": \"markup\" } } } } }";
        String videoUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4";
        String imageUrl = "https://i.picsum.photos/id/664/200/300.jpg";
        String text = "nitin nitin nitin";

        scenario.attach(html.getBytes(),"text/html","Embedded HTML");
        scenario.attach(json.getBytes(),"application/json","Embedded json");
        scenario.attach(videoUrl.getBytes(),"video/mp4","Video mp4");
        scenario.attach(imageUrl.getBytes(),"image/url","image");
        scenario.attach(text.getBytes(),"text/plain","Test Context");



    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("Before step");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("After Step");
        scenario.attach("Text attachment".getBytes(),"text/plain","Step Details");
    }

    @After
    public void afterScenario() {
        System.out.println("After Scenario");
    }

}
