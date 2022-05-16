package ru.Tests;

import org.junit.Assert;
import org.junit.Test;

import rgrproject.managers.CalculatorManagerImpl;
import rgrproject.managers.CalculatorStateImpl;
import rgrproject.types.FundamentTypes;
import rgrproject.types.KrshaTypes;
import rgrproject.types.StenaType;
import rgrproject.types.OknaTypes;
import rgrproject.types.OttdelcaTypes;
import rgrproject.types.PeregorodkaTypes;

public class JTEST {
@Test
public void test() {

CalculatorStateImpl data = new CalculatorStateImpl();


data.setFundamentTypes(FundamentTypes.BYRONABIV);
data.setKrshaTypes(KrshaTypes.METALLO);
data.setStenaType(StenaType.KIRPICH_1);
data.setOttdelcaTypes(OttdelcaTypes.SHTUCATURKA);
data.setPeregorodkaTypes(PeregorodkaTypes.DA);
data.setOknaTypes(OknaTypes.DA);
data.setHeightKon(10);
CalculatorManagerImpl result = new CalculatorManagerImpl(data);
Assert.assertEquals(40000,result.getKr(),1);

}

} 