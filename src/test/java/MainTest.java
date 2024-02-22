import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.SocketPermission;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class MainTest {




    @Test
    void go()  {
        Configuration.remote = "http://localhost:4444/wd/hub/";
        Configuration.browserCapabilities.setCapability("selenoid:options", getDefaultSelenoideOptions());

        open("https://www.google.co.uk/");
        sleep(10000);


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

