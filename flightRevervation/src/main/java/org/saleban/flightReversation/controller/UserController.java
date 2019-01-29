package org.saleban.flightReversation.controller;

import lombok.extern.slf4j.Slf4j;
import org.saleban.flightReversation.domain.Flight;
import org.saleban.flightReversation.domain.User;
import org.saleban.flightReversation.repository.FlightRepo;
import org.saleban.flightReversation.repository.UserRepo;
import org.saleban.flightReversation.util.Mappings;
import org.saleban.flightReversation.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private FlightRepo flightRepo;

    @RequestMapping("/register")
    public ModelAndView showRegistration(){
        ModelAndView mv = new ModelAndView(ViewNames.REGISTER);
        mv.addObject("user", new User());
        return mv;
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, ModelMap modelMap){
        log.info("Processing user info - {}");
        //ModelAndView mv = new ModelAndView(ViewNames.HOME);
        userRepo.save(user);
        LogUserData(user);
        return "redirect:/";
    }

    @GetMapping("/login")
    public ModelAndView loginGet(){
        ModelAndView mv = new ModelAndView(ViewNames.LOGIN);
        mv.addObject("login", new User());
        return mv;
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("login")User user, @RequestParam("email") String email,
                            @RequestParam("password") String password, ModelMap modelMap){
        log.info("Processing user login - {}");
         user = userRepo.findByEmail(email);
        if(user.getPassword().equals(password)){
            return "redirect:/" + Mappings.FIND_FLIGHTS;
        }else {
            modelMap.addAttribute("msg", "invalid email or password");
        }
        return ViewNames.LOGIN;
    }

    @GetMapping("/flights")
    public ModelAndView flights(){
        ModelAndView mv = new ModelAndView(ViewNames.FLIGHTS);
        mv.addObject("flights", new Flight());
        return mv;
    }

    @PostMapping("/flights")
    public String find(@RequestParam("departureCity") String departureCity,
                       @RequestParam("arrivalCity") String arrivalCity, ModelMap modelMap){
        List<Flight> flight = flightRepo.findFlight(departureCity, arrivalCity);
        modelMap.addAttribute("flight", flight);
        return ViewNames.FIND_FLIGHTS;
    }

    @GetMapping("/display")
    public ModelAndView showFlight(@RequestParam("id") Long id){
        List<Flight> one = flightRepo.findOne(id);
        ModelAndView mv = new ModelAndView(ViewNames.DISPLAY);
        mv.addObject("flight", one);
        return mv;
    }

    private void LogUserData(User user){
        log.info("SAVING USER DATA:");
        log.info("FirstName: ", user.getFirstName());
        log.info("LastName: ", user.getLastName());
        log.info("Email: ", user.getEmail());
    }

}
