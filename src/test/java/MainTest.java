import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.SocketPermission;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;
public class MainTest {


    @BeforeAll
    public static void setUp(){
        Configuration.headless = true;
    }


    @Test
    void go()  {
        open("https://www.google.co.uk/");
        $("[aria-invalid=\"false\"]").click();
        System.out.println("x");
    }

    private Map<String, Object> getDefaultSelenoideOptions() {
        Map<String, Object> options = new HashMap<>();
        options.put("enableVNC", true);
        options.put("enableLog", true);
        options.put("enableVideo", false);
        options.put("name", "P2 UI TEST");
        return options;
    }



}

