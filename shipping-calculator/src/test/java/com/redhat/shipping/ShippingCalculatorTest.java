package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {


@Test
public void onNARegionTheCostIs100() throws RegionNotFoundException{
   ShippingCalculator calculator = new ShippingCalculator();
   int calculatedCost = calculator.costForRegion("NA");
   assertEquals(100,calculatedCost);
}

@Test
public void onLATAMRegionTheCostIs200() throws RegionNotFoundException{
   ShippingCalculator calculator = new ShippingCalculator();
   int calculatedCost = calculator.costForRegion("LATAM");
   assertEquals(200,calculatedCost);
}

@Test
public void onEMEARegionTheCostIs300() throws RegionNotFoundException {
   ShippingCalculator calculator = new ShippingCalculator();
   int calculatedCost = calculator.costForRegion("EMEA");
   assertEquals(300,calculatedCost);
}


@Test
public void onAPACRegionTheCostIs400() throws RegionNotFoundException{
   ShippingCalculator calculator = new ShippingCalculator();
   int calculatedCost = calculator.costForRegion("APAC");
   assertEquals(400,calculatedCost);
}

@Test
public void onNonSupportedRegionNotFoundExceptionRaised() {
   ShippingCalculator calculator = new ShippingCalculator();
        assertThrows(
           RegionNotFoundException.class,
           () -> calculator.costForRegion("Unknown Region")
         );
}

}
