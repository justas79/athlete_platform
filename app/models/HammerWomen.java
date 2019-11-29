package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HammerWomen {

    @Id
    private Long athleteId;

    public static io.ebean.Finder<Long, HammerWomen> find = new io.ebean.Finder<>(HammerWomen.class);

    String mark;
    String athleteName;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public Long getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(Long athleteId) {
        this.athleteId = athleteId;
    }
}
