package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    String Test(){
        return "11";
    }
    String Test1() {
    	System.out.println("112");    	
    	return"1";
    	
    }

}
