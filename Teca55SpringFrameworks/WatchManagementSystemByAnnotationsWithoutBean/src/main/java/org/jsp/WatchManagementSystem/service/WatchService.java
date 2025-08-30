package org.jsp.WatchManagementSystem.service;

public interface WatchService {
	void addWatch() throws Exception;

	void getWatches() throws Exception;

	void deleteWatchesByBrand() throws Exception;

	boolean isPresent(String brand) throws Exception;

	void updateoldBrandByNewBrand() throws Exception;
	void changeModelByBrand() throws Exception;
}
