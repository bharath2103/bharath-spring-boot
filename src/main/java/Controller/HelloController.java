package Controller;

import Model.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private LoginForm loginForm;


    @RequestMapping(value = "/sample", produces = {"application/xml","application/json"})
    @ResponseBody
    public LoginForm greet(){
        loginForm.setUsername("Bharathkumar");
        loginForm.setPassword("Password");
        loginForm.setError("Access Denied");
        return loginForm;
    }

    @RequestMapping(value = "/fetch")
    public String fetch(){
        RestTemplate restTemplate = new RestTemplate();
        loginForm = restTemplate.getForObject("http://localhost:8080/sample",LoginForm.class);
        return loginForm.getUsername();
    }
}
