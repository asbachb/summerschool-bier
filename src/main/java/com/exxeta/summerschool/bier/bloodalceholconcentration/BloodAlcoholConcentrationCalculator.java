package com.exxeta.summerschool.bier.bloodalceholconcentration;

public interface BloodAlcoholConcentrationCalculator {

    Double calculateBloodAlcoholConcentration(Double amountOfAlcoholInGram, Integer personWeight, Gender gender) throws CalculationException;
}
