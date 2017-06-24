package net.runnerdave.service;

import net.runnerdave.model.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by runnerdave on 24/06/17.
 */
@Service
public class HomeDetailsService {

    @Autowired
    Home home;

    public String getDummyService() {
        return "El dummy";
    }

    public String getHomeBeanDetails() {
        this.home.setColour("Red");
        this.home.setAddress("1 Main street");
        this.home.setNumberOfPeople(4);
        this.home.setHomeName("my house");
        return home.toString();
    }
}
