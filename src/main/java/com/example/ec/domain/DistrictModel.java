package com.example.ec.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "district")
public class DistrictModel {

    @Id
    private String district;

    public DistrictModel(String district) {
        this.district = district;
    }

    protected DistrictModel() {

    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "DistrictModel{" +
                "District='" + this.district + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DistrictModel that = (DistrictModel) o;
        return Objects.equals(this.district, that.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(district);
    }
}
