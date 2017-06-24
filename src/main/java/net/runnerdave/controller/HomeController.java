package net.runnerdave.controller;

import net.runnerdave.model.DummyForSetter;
import net.runnerdave.service.HomeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by runnerdave on 24/06/17.
 */
@RestController
public class HomeController {

    @Value("${application.config.home.name}")
    private String homeName;

    private HomeDetailsService homeDetailsService;

    @Autowired
    public HomeController(HomeDetailsService homeDetailsService) {
        this.homeDetailsService = homeDetailsService;
    }

    private DummyForSetter dummyForSetter;

    @Autowired
    public DummyForSetter getDummyForSetter(DummyForSetter dummyForSetter) {
        this.dummyForSetter = dummyForSetter;
        dummyForSetter.setName("El Dummy");
        return this.dummyForSetter;
    }

    @RequestMapping("/")
    public String getHome() {
        return "this is my home: " + getConfigHomeNameFromProperties();
    }

    @RequestMapping("/requestDummyService")
    public String getDummy() {
        return homeDetailsService.getDummyService();
    }

    @RequestMapping("/requestElDummy")
    public String getDummyViaSetter() {
        return getDummyForSetter(this.dummyForSetter).toString();
    }

    private String getConfigHomeNameFromProperties() {
        return this.homeName;
    }

    @RequestMapping("/requestHomeDetails")
    public String getFullHomeDetailsFromBean() {
        return homeDetailsService.getHomeBeanDetails();
    }
}
