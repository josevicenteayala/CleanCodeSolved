/**
 * 
 */
package com.cleancode.streams;

import java.util.List;

/**
 * @author vin001
 *
 */
public class Stream {
	
	private List<DataSet> dataSets;
	
	public Stream(List<DataSet> dataSets) {
		this.dataSets = dataSets;
	}

	DataSet getFirstDataSet() {
		return dataSets.stream().findFirst().orElse(new DataSet());
	}
	
}

class DataSet {
	private String name;
	private String identification;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the identification
	 */
	public String getIdentification() {
		return identification;
	}
	/**
	 * @param identification the identification to set
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}
}
