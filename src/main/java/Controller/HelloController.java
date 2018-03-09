package Controller;

import Model.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private LoginForm loginForm;


    @RequestMapping("/sample")
    @ResponseBody
    public LoginForm greet(){
        loginForm.setUsername("Bharath");
        loginForm.setPassword("picasso");
        return loginForm;
    }
}
