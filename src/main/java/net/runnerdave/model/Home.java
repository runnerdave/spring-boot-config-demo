package net.runnerdave.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by runnerdave on 24/06/17.
 */
@Component
public class Home {

    private String address;
    private String colour;
    private int numberOfPeople;
    private String homeName;

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }



    @Override
    public String toString() {
        return "Home{" +
                "address='" + address + '\'' +
                ", colour='" + colour + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", homeName=" + homeName +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
