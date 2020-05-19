package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString(){
        String message = "\n";
        message += "ID: " + this.id + "\n";
        String empty = "Data not available";
        if(this.name.isEmpty()){
            message += "Name: " + empty + "\n";
        }else {
            message += "Name: " + this.name + "\n";
        }
        if(this.employer.getValue().isEmpty()){
            message += "Employer: " + empty + "\n";
        }else {
            message += "Employer: " + this.employer + "\n";
        }
        if(this.location.getValue().isEmpty()){
            message += "Location: " + empty + "\n";
        }else {
            message += "Location: " + this.location + "\n";
        }
        if(this.positionType.getValue().isEmpty()){
            message += "Position Type: " + empty + "\n";
        }else {
            message += "Position Type: " + this.positionType + "\n";
        }
        if(this.coreCompetency.getValue().isEmpty()){
            message += "Core Competency: " + empty + "\n";
        }else {
            message += "Core Competency: " + this.coreCompetency + "\n";
        }
        if(this.coreCompetency.getValue().isEmpty() && this.positionType.getValue().isEmpty() &&
                this.location.getValue().isEmpty() && this.employer.getValue().isEmpty() && this.name.isEmpty()){
            return "OOPS! This job does not seem to exist.";
        }
        return message;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
