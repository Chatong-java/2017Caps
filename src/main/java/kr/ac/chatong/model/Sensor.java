package kr.ac.chatong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by blue on 2017-06-07.
 */
@Entity
public class Sensor {
    @Id
    @GeneratedValue
    private Long no;
    @ManyToOne
    private Region region;

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
