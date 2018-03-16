package Controller;

import Model.LoginForm;
import customException.UserNameNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private LoginForm loginForm;


    @RequestMapping(value = "/sample", produces = {"application/xml","application/json"})
    public LoginForm greet(){
        loginForm.setUsername("Bharathkumar");
        loginForm.setPassword("Password");
        loginForm.setError("Access Denied");
        return loginForm;
    }

    @RequestMapping(value = "/fetch")
    public String fetch() {
        boolean check = false;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8080/sample"
                , String.class);
        MediaType contentType = entity.getHeaders().getContentType();
        return contentType.toString();
    }

    @RequestMapping(value = "/fetchusername")
    public String fetchUserName() throws UserNameNotFound {
        throw new UserNameNotFound();
    }

}
