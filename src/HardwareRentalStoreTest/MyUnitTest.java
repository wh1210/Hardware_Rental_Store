package Hao_Yuta_Linus.HardwareRentalStoreTest;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

import Hao_Yuta_Linus.HardwareRentalStoreFile.AccessoryKit;
import Hao_Yuta_Linus.HardwareRentalStoreFile.ExtensionCord;
import Hao_Yuta_Linus.HardwareRentalStoreFile.GearPackage;
import Hao_Yuta_Linus.HardwareRentalStoreFile.Tool;
import Hao_Yuta_Linus.HardwareRentalStoreFile.ToolFactory;

class MyUnitTest {
	public ToolFactory tf = new ToolFactory();

	@Test
    public void testConcretePrice1() {
    	Tool concrete = tf.getTool(CONCRETE, "test1");
    	concrete.setDays(1);
    	assertEquals(concrete.getPrice(), CONCRETE_PER_DAY, 0.000001);
    }
	
	@Test
    public void testConcretePrice2() {
    	Tool concrete = tf.getTool(CONCRETE, "test2");
    	concrete.setDays(3);
    	assertEquals(concrete.getPrice(), CONCRETE_PER_DAY * 3, 0.000001);
    }
	
	@Test
	public void testWoodworkPrice1() {
    	Tool concrete = tf.getTool(WOODWORK, "test1");
    	concrete.setDays(1);
    	assertEquals(concrete.getPrice(), WOODWORK_PER_DAY, 0.000001);
    }
	
	@Test
    public void testWoodworkPrice2() {
    	Tool concrete = tf.getTool(WOODWORK, "test2");
    	concrete.setDays(3);
    	assertEquals(concrete.getPrice(), WOODWORK_PER_DAY * 3, 0.000001);
    }
	
	@Test
	public void testYardworkPrice1() {
    	Tool concrete = tf.getTool(YARDWORK, "test1");
    	concrete.setDays(1);
    	assertEquals(concrete.getPrice(), YARDWORK_PER_DAY, 0.000001);
    }
	
	@Test
    public void testYardworkPrice2() {
    	Tool concrete = tf.getTool(YARDWORK, "test2");
    	concrete.setDays(3);
    	assertEquals(concrete.getPrice(), YARDWORK_PER_DAY * 3, 0.000001);
    }
	
	@Test
	public void testPaintingPrice1() {
    	Tool concrete = tf.getTool(PAINTING, "test1");
    	concrete.setDays(1);
    	assertEquals(concrete.getPrice(), PAINTING_PER_DAY, 0.000001);
    }
	
	@Test
    public void testPaintingPrice2() {
    	Tool concrete = tf.getTool(PAINTING, "test2");
    	concrete.setDays(3);
    	assertEquals(concrete.getPrice(), PAINTING_PER_DAY * 3, 0.000001);
    }
	
	@Test
	public void testPlumbingPrice1() {
    	Tool concrete = tf.getTool(PLUMBING, "test1");
    	concrete.setDays(1);
    	assertEquals(concrete.getPrice(), PLUMBING_PER_DAY, 0.000001);
    }
	
	@Test
    public void testPlumbingPrice2() {
    	Tool concrete = tf.getTool(PLUMBING, "test2");
    	concrete.setDays(3);
    	assertEquals(concrete.getPrice(), PLUMBING_PER_DAY * 3, 0.000001);
    }
	
	@Test
	public void testKitDecorator() {
		Tool paintTest = tf.getTool("Painting", "paintTest");
		Tool concreteTest = tf.getTool("Concrete", "concreteTest");

      	paintTest.setDays(1);
      	paintTest = new AccessoryKit(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY + PAINTING_OPTION_RATE * ACCESSORY_KIT_PRICE, 0.000001);
      	paintTest = new AccessoryKit(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY + PAINTING_OPTION_RATE * ACCESSORY_KIT_PRICE * 2, 0.000001);
      	
      	concreteTest.setDays(1);
      	concreteTest = new AccessoryKit(concreteTest);
      	assertEquals(concreteTest.getPrice(), CONCRETE_PER_DAY + CONCRETE_OPTION_RATE * ACCESSORY_KIT_PRICE, 0.000001);
      	concreteTest = new AccessoryKit(concreteTest);
      	assertEquals(concreteTest.getPrice(), CONCRETE_PER_DAY + CONCRETE_OPTION_RATE * ACCESSORY_KIT_PRICE * 2, 0.000001);
	}
	
	@Test
	public void testGearDecorator() {
		Tool paintTest = tf.getTool("Painting", "paintTest");
		Tool concreteTest = tf.getTool("Concrete", "concreteTest");

      	paintTest.setDays(1);
      	paintTest = new GearPackage(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY + PAINTING_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE, 0.000001);
      	paintTest = new GearPackage(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY + PAINTING_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE * 2, 0.000001);
      	
      	concreteTest.setDays(1);
      	concreteTest = new GearPackage(concreteTest);
      	assertEquals(concreteTest.getPrice(), CONCRETE_PER_DAY + CONCRETE_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE, 0.000001);
      	concreteTest = new GearPackage(concreteTest);
      	assertEquals(concreteTest.getPrice(), CONCRETE_PER_DAY + CONCRETE_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE * 2, 0.000001);
	}
	
	@Test
	public void testCordDecorator() {
		Tool paintTest = tf.getTool("Painting", "paintTest");
		Tool concreteTest = tf.getTool("Concrete", "concreteTest");

      	paintTest.setDays(1);
      	paintTest = new ExtensionCord(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY + PAINTING_OPTION_RATE * EXTENSION_CODE_PRICE, 0.000001);
      	paintTest = new ExtensionCord(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY + PAINTING_OPTION_RATE * EXTENSION_CODE_PRICE * 2, 0.000001);
      	
      	concreteTest.setDays(1);
      	concreteTest = new ExtensionCord(concreteTest);
      	assertEquals(concreteTest.getPrice(), CONCRETE_PER_DAY + CONCRETE_OPTION_RATE * EXTENSION_CODE_PRICE, 0.000001);
      	concreteTest = new ExtensionCord(concreteTest);
      	assertEquals(concreteTest.getPrice(), CONCRETE_PER_DAY + CONCRETE_OPTION_RATE * EXTENSION_CODE_PRICE * 2, 0.000001);
	}
	
	@Test
	public void testDecoratorMix() {
		Tool paintTest = tf.getTool("Painting", "paintTest");

      	paintTest.setDays(1);
      	paintTest = new ExtensionCord(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY + PAINTING_OPTION_RATE * EXTENSION_CODE_PRICE, 0.000001);
      	paintTest = new GearPackage(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY + PAINTING_OPTION_RATE * EXTENSION_CODE_PRICE + 
      			PAINTING_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE, 0.000001);
      	paintTest = new AccessoryKit(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY + PAINTING_OPTION_RATE * EXTENSION_CODE_PRICE + 
      			PAINTING_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE + PAINTING_OPTION_RATE * ACCESSORY_KIT_PRICE, 0.000001);
	}
	
	@Test
	public void testDecoratorMixForSeveralDays() {
		Tool paintTest = tf.getTool("Painting", "paintTest");

      	paintTest.setDays(5);
      	paintTest = new ExtensionCord(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY * 5 + PAINTING_OPTION_RATE * EXTENSION_CODE_PRICE, 0.000001);
      	paintTest = new GearPackage(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY * 5 + PAINTING_OPTION_RATE * EXTENSION_CODE_PRICE + 
      			PAINTING_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE, 0.000001);
      	paintTest = new AccessoryKit(paintTest);
      	assertEquals(paintTest.getPrice(), PAINTING_PER_DAY * 5 + PAINTING_OPTION_RATE * EXTENSION_CODE_PRICE + 
      			PAINTING_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE + PAINTING_OPTION_RATE * ACCESSORY_KIT_PRICE, 0.000001);
	}
	
	@AfterClass
	public void testOutput() {
		System.out.println("All tests passed!");
	}

}
