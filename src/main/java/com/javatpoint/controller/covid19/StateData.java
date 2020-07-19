package com.javatpoint.controller.covid19;

public class StateData {
    private int active ;
    private int confirmed ;
    private int deaths ;
    private int deltaconfirmed ;
    private int deltadeaths ;
    private int deltarecovered ;
    private String lastupdatedtime ;
    private int migratedother ;
    private int recovered ;
    private String state ;
    private String statecode ;
    private String statenotes ;

    public StateData() {
    }

    public StateData(int active, int confirmed, int deaths, int deltaconfirmed, int deltadeaths, int deltarecovered, String lastupdatedtime, int migratedother, int recovered, String state, String statecode, String statenotes) {
        this.active = active;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.deltaconfirmed = deltaconfirmed;
        this.deltadeaths = deltadeaths;
        this.deltarecovered = deltarecovered;
        this.lastupdatedtime = lastupdatedtime;
        this.migratedother = migratedother;
        this.recovered = recovered;
        this.state = state;
        this.statecode = statecode;
        this.statenotes = statenotes;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getDeltaconfirmed() {
        return deltaconfirmed;
    }

    public void setDeltaconfirmed(int deltaconfirmed) {
        this.deltaconfirmed = deltaconfirmed;
    }

    public int getDeltadeaths() {
        return deltadeaths;
    }

    public void setDeltadeaths(int deltadeaths) {
        this.deltadeaths = deltadeaths;
    }

    public int getDeltarecovered() {
        return deltarecovered;
    }

    public void setDeltarecovered(int deltarecovered) {
        this.deltarecovered = deltarecovered;
    }

    public String getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(String lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public int getMigratedother() {
        return migratedother;
    }

    public void setMigratedother(int migratedother) {
        this.migratedother = migratedother;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getStatenotes() {
        return statenotes;
    }

    public void setStatenotes(String statenotes) {
        this.statenotes = statenotes;
    }

    @Override
    public String toString() {
        return "StateData{" +
                "active=" + active +
                ", confirmed=" + confirmed +
                ", deaths=" + deaths +
                ", deltaconfirmed=" + deltaconfirmed +
                ", deltadeaths=" + deltadeaths +
                ", deltarecovered=" + deltarecovered +
                ", lastupdatedtime='" + lastupdatedtime + '\'' +
                ", migratedother=" + migratedother +
                ", recovered=" + recovered +
                ", state='" + state + '\'' +
                ", statecode='" + statecode + '\'' +
                ", statenotes='" + statenotes + '\'' +
                '}';
    }
}
