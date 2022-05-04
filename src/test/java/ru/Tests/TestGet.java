package ru.Tests;

import org.junit.Assert;
import rgrproject.managers.CalculatorStateImpl;
import org.junit.Test;

public class TestGet {

	@Test
	public void test() {
		CalculatorStateImpl clc=new CalculatorStateImpl();
		clc.setWeight(10);
		clc.setHeight(10);
		clc.setAtazhnost(2);
		clc.setTsokol(5);
		clc.setHeightAtazh(4);
		clc.setHeightKon(10);
		
		Assert.assertEquals(clc.getWeight(), 10,0.1);
		Assert.assertEquals(clc.getHeight(), 10,0.1);
		Assert.assertEquals(clc.getAtazhnost(), 2,0.1);
		Assert.assertEquals(clc.getTsokol(), 5,0.1);
		Assert.assertEquals(clc.getHeightAtazh(), 4,0.1);
		Assert.assertEquals(clc.getHeightKon(), 10,0.1);
	}

}
