package michalski.kamil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TweetController {
    @RequestMapping("/")
    public String hello() {
        return "resultPage";
    }
}
