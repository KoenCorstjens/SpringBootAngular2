package eu.corstjens.spring.angular2.controller;


import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Koen on 27/06/2016.
 */
@Controller
public class SecurityController {

    @RequestMapping(value = "/csrf", method = RequestMethod.GET)
    public @ResponseBody
    CsrfToken getToken(CsrfToken token) {
        return token;
    }


}
