package com.exxeta.summerschool.bier.bloodalceholconcentration;

public enum Gender {

    MALE(70), FEMALE(60);

    private final Integer waterConcentrationInPercent;

    Gender(Integer waterConcentration) {
        this.waterConcentrationInPercent = waterConcentration;
    }

    public Integer getWaterConcentrationInPercent() {
        return waterConcentrationInPercent;
    }
}
