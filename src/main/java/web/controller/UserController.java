package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/user")
    public String showCars(@RequestParam(Model model) {
        model.addAttribute("cars", userService.getCars(count.orElse(0)));
        return "cars";
    }

}
