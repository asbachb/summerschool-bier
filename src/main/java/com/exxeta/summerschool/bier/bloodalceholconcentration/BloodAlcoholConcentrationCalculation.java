package com.exxeta.summerschool.bier.bloodalceholconcentration;

import java.io.Serializable;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@ManagedBean
@RequestScoped
public class BloodAlcoholConcentrationCalculation implements Serializable {

    private Double amountOfAlcoholInGram;

    private Integer personWeight;

    private Gender gender;

    private Double bloodAlcoholConcentration;

    @Inject
    @Any
    private Instance<BloodAlcoholConcentrationCalculator> bloodAlcoholConcentrationCalculator;

    public void calculateBloodAlcoholConcentration() {
        BloodAlcoholConcentrationCalculator calculator = bloodAlcoholConcentrationCalculator.get();
        try {
            bloodAlcoholConcentration = calculator.calculateBloodAlcoholConcentration(amountOfAlcoholInGram, personWeight, gender);
        } catch (CalculationException ex) {
            bloodAlcoholConcentration = 1.0;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), ""));
        }
    }

    public boolean parametersFilled() {
        return amountOfAlcoholInGram != null && personWeight != null && gender != null;
    }

    public Gender[] availableGenders() {
        return Gender.values();
    }

    public Double getAmountOfAlcoholInGram() {
        return amountOfAlcoholInGram;
    }

    public void setAmountOfAlcoholInGram(Double amountOfAlcoholInGram) {
        this.amountOfAlcoholInGram = amountOfAlcoholInGram;
    }

    public Integer getPersonWeight() {
        return personWeight;
    }

    public void setPersonWeight(Integer personWeight) {
        this.personWeight = personWeight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Double getBloodAlcoholConcentration() {
        return bloodAlcoholConcentration;
    }

    public void setBloodAlcoholConcentration(Double bloodAlcoholConcentration) {
        this.bloodAlcoholConcentration = bloodAlcoholConcentration;
    }
}
