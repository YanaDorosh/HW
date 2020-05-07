package com.solvd.placeCollections;

import com.solvd.ships.Boat;
import com.solvd.ships.navy.military.Military;
import com.solvd.ships.navy.military.Submarine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Fleet {
    Roadstead roadstead = new Roadstead();
    List<Military> militaryList = new ArrayList<>();
    List<Submarine> submarineList = new ArrayList<>();

    public Fleet() {

    }

    public void printInfoColection(Collection<?> list) {
        for (Object ls : list) {
            System.out.println(ls.toString());
        }
    }

    public void setMilitary(Military military) {
        militaryList.add(military);
    }

    public void removeMilitary(int index) {
        militaryList.remove(index);
    }

    public List<Military> getMilitaryList() {
        Boat.countNumeration();
        return militaryList;
    }
    public void setSubmarine(Submarine submarine){
        submarineList.add(submarine);
}

    public void removeSubmarine(int index) {
        Boat.countNumeration();
        submarineList.remove(index);
    }

    public List<Submarine> getSubmarineList() {
        return submarineList;
    }

}




