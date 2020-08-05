package mockito.example.services.impl;

import mockito.example.services.DataService;

public class DataServiceImpl implements DataService {

	private int[] arrayInt;
	
	@Override
	public int[] getListOfNumbers() {
		return this.arrayInt;
	}
	
	public void setListOfNumbers(int[] arrayInt) {
		this.arrayInt = arrayInt;
	}

}
