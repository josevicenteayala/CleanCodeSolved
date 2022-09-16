/**
 * 
 */
package com.cleancode.streams;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author vin001
 *
 */
public class StreamTest {
	private Stream stream;
	
	@BeforeEach
	void init() {
		stream = new Stream(createDataSetsStructure());
	}

	private List<DataSet> createDataSetsStructure() {
		List<DataSet> dataSets = new LinkedList<DataSet>();
		
		DataSet dataSet = new DataSet();
		dataSet.setIdentification("1");
		dataSet.setName("Vin");
		
		DataSet dataSet2 = new DataSet();
		dataSet2.setIdentification("2");
		dataSet2.setName("Cristina");
		
		dataSets.add(dataSet);
		dataSets.add(dataSet2);
		
		return dataSets;
	}
	
	@Test
	void getFirstDataSetTest(){
		DataSet firstDataSet = stream.getFirstDataSet();
		assertTrue(firstDataSet.getIdentification().equals("1"), String.format("Expected 1 but found %s",firstDataSet.getIdentification()));
		assertTrue(firstDataSet.getName().equals("Vin"), String.format("Expected Vin but found %s",firstDataSet.getName()));
	}

}
