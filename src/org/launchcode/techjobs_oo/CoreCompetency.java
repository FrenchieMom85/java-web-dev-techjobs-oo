package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

    public CoreCompetency(String value) {
        super(value);
    }

    // Custom equals methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency competency = (CoreCompetency) o;
        return getId() == competency.getId();
    }

}
