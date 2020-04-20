package com.solvd.placeCollections;

import com.solvd.ships.Boat;
import com.solvd.ships.civil.Civil;
import com.solvd.ships.civil.SailingBoat;
import com.solvd.ships.civil.service.Service;
import com.solvd.ships.civil.service.servicetype.Fishing;
import com.solvd.ships.civil.service.servicetype.Icebreaker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class StationOfShips {
    LinkedList<SailingBoat> sailingBoats = new LinkedList<>();
    LinkedList<Civil> civils = new LinkedList<>();
    LinkedList<Service> services = new LinkedList<>();
    LinkedList<Icebreaker> icebreakers = new LinkedList<>();
    LinkedList<Fishing> fishings = new LinkedList<>();

    List<? extends Boat> listOfBoat;

    public StationOfShips() {
        listOfBoat = new ArrayList<>();
    }

    public void printInfoColection(Collection<?> list) {
        for (Object ls : list) {
            System.out.println(ls.toString());
        }
    }

    public void setShipOfFleet(Boat boat) {
        sailingBoats.add(new SailingBoat());
        civils.add(new Civil());
        services.add(new Service());
        icebreakers.add(new Icebreaker());
        fishings.add(new Fishing());

    }

    public void removeShipOfFleet(int index) {
        listOfBoat.remove(index);

    }

    public List<? extends Boat> getShipOfFleet() {
        return listOfBoat;
    }

}
