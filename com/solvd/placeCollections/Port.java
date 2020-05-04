
package com.solvd.placeCollections;


import com.solvd.ships.Boat;
import com.solvd.ships.civil.Civil;
import com.solvd.ships.civil.SailingBoat;
import com.solvd.ships.civil.service.servicetype.Fishing;
import com.solvd.ships.navy.military.Military;

import java.util.*;

public class Port {

    private List<Military> militaryList = new ArrayList<>();
    private LinkedList<Civil> linkedListCivils = new LinkedList<>();
    private Set<Fishing> fishingSet = new HashSet<>();
    private Map<Integer, SailingBoat> sailingBoatMap = new HashMap<>();

    /**
     * Member of the class for HashMap key
     */

    public int key = 0;

    public Port() {

    }

    public void printInfoColection(Collection<?> list) {
        for (Object ls : list) {
            System.out.println(ls.toString());
        }
    }
//    public void printInfoCollection(Map<Integer, ?> map, String value) {
//        System.out.println(map.get(value));
//    }

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

    public void setCivil(Civil civil) {
        linkedListCivils.add(civil);
    }

    public void removeCivil(int index) {
        linkedListCivils.remove(index);
    }

    public List<Civil> getlinkedListCivils() {
        Boat.countNumeration();
        return linkedListCivils;
    }

    public void setFishingSet(Fishing fishing) {
        fishingSet.add(fishing);
    }

    public Set<Fishing> getFishingSet() {
        Boat.countNumeration();
        return fishingSet;
    }

    public void removeFishing(int index) {
        fishingSet.remove(fishingSet.toArray()[index]);
    }

    public void setSailigBoat(SailingBoat sailingBoat) {
        sailingBoatMap.put(key, sailingBoat);
        key++;
    }

    public Map<Integer, SailingBoat> getSailingBoatMap() {
        Boat.countNumeration();
        return sailingBoatMap;
    }

    public void removeSailingBoat(Integer key) {
        sailingBoatMap.remove(key);
    }



}




