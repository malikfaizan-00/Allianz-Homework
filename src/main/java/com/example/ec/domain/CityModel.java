package com.example.ec.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "city")
public class CityModel {
//    @Id
//    @GeneratedValue
//    private int id;

//    @Column(name = "City", length = 100)
    @Id
    private String city;

//    @Column(name = "District", length = 100)
//    private String district;

    @Column(name = "TimeStamp")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date utilTimestamp;

    @ManyToOne(cascade = {CascadeType.ALL})
    private DistrictModel distModel;

    public CityModel(Date utilTimestamp, DistrictModel distModel, String city) {
        this.utilTimestamp = utilTimestamp;
        this.distModel = distModel;
        this.city = city;
    }

    protected CityModel(){

    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public void setUtilTimestamp(Date utilTimestamp) {
        this.utilTimestamp = utilTimestamp;
    }

//    public void setDistrict(String district) {
//        this.district = district;
//    }

    public void setCity(String city) {
        this.city = city;
    }

//    public int getId() {
//        return id;
//    }

    public Date getUtilTimestamp() {
        return utilTimestamp;
    }

//    public String getDistrict() {
//        return district;
//    }

    public String getCity() {
        return city;
    }

    public DistrictModel getDistModel() {
        return distModel;
    }

    public void setDistModel(DistrictModel distModel) {
        this.distModel = distModel;
    }

    @Override
    public String toString() {
        return "CO2Model{" +
//                "id=" + id +
                ", Timestamp='" + this.utilTimestamp + '\'' +
                ", District='" + this.distModel + '\'' +
                ", City='" + this.city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityModel cityModel = (CityModel) o;
        return //Objects.equals(id, cityModel.id) &&
                Objects.equals(this.utilTimestamp, cityModel.utilTimestamp) &&
                Objects.equals(this.distModel, cityModel.distModel) &&
                Objects.equals(this.city, cityModel.city);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(id, utilTimestamp, district, city);
        return Objects.hash(this.utilTimestamp, this.city, this.distModel);
    }

}
