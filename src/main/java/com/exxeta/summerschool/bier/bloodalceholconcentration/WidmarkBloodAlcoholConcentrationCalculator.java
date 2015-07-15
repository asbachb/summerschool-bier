package com.exxeta.summerschool.bier.bloodalceholconcentration;

import javax.ejb.Stateless;

@Stateless
public class WidmarkBloodAlcoholConcentrationCalculator implements BloodAlcoholConcentrationCalculator {

    @Override
    public Double calculateBloodAlcoholConcentration(Double amountOfAlcoholInGram, Integer personWeight, Gender gender) throws CalculationException {
        return -1.;
    }
}
