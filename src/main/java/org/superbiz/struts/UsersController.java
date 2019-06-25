package org.superbiz.struts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/addUser")
    public String addUserForm() {
        return "addUserForm";
    }
}
