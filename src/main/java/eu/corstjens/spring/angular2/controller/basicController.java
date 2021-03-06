package eu.corstjens.spring.angular2.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by koencorstjens on 22/06/16.
 */
@Controller
public class BasicController {

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public String start() {
        return "start";
    }

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


}
