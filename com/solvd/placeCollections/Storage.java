
package com.solvd.placeCollections;


import com.solvd.ships.civil.Civil;
import com.solvd.ships.civil.SailingBoat;
import com.solvd.ships.civil.service.servicetype.Fishing;
import com.solvd.ships.navy.military.Military;

import java.util.*;

public class Storage {
    public static int count = 1;
    public List<Military> militaryList = new ArrayList<>();
    private LinkedList<Civil> linkedListCivils = new LinkedList<>();
    private Set<Fishing> fishingSet = new HashSet<>();
    private Map<Integer, SailingBoat> sailingBoatMap = new HashMap<>();

    /**
     * Member of the class for HashMap key
     */

    private int key = 0;

    public Storage() {

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
        countNumeration();
        return militaryList;
    }

    public void setCivil(Civil civil) {
        linkedListCivils.add(civil);
    }

    public void removeCivil(int index) {
        linkedListCivils.remove(index);
    }

    public List<Civil> getlinkedListCivils() {
        countNumeration();
        return linkedListCivils;
    }

    public void setFishingSet(Fishing fishing) {
        fishingSet.add(fishing);
    }

    public Set<Fishing> getFishingSet() {
        countNumeration();
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
        countNumeration();
        return sailingBoatMap;
    }

    public void removeSailingBoat(Integer key) {
        sailingBoatMap.remove(key);
    }

    public static void countNumeration() {
        if (count != 1) {
            count = 1;
        }
    }

}




