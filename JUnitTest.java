import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class JUnitTest {
    
	Converter convert = new Converter();
	MemoryUnit memory = new MemoryUnit();
	
	//test Binary to Hex
	@Test
	void testBinToHex() {
		String Binary = "1010";
		assertEquals(convert.binToHex(Binary),"a");
	}
	
	//test Binary to Decimal
	@Test
	void testBinToDec() {
		String Binary = "1010";
		assertEquals(convert.binToDec(Binary), 10);
	}
    
	//test Decimal to Binary
	@Test
	void testDecToBin() {
		int Decimal = 10;
		assertEquals(convert.decToBin(Decimal), 1010);
	}
	
	//test Hex to Binary
	@Test
	void testHexToBin() {
		String Hexcode = "00FF";
		assertEquals(convert.hexToBin(Hexcode), 11111111);
	}
	
	//test Hex to Decimal
	@Test
	void testHexToDec() {
		String Hexcode = "00FF";
		assertEquals(convert.hexToDec(Hexcode), 255);
	}
	
	//test Decimal to Hex
	@Test 
	void testDecToHex() {
		int Decimal = 10;
		assertEquals(convert.decToHex(Decimal), "a");
	}
	
	@Test
	void testMemoryUnit() {
		memory.storeAt(1, "The End");
		assertEquals(memory.getDataAt(1), "The End");
	}
}
