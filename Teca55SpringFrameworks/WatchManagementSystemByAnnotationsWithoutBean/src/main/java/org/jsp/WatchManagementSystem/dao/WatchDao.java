package org.jsp.WatchManagementSystem.dao;

import java.util.List;

import org.jsp.WatchManagementSystem.entity.Watch;

public interface WatchDao {
	void insertWatch(Watch watch) throws Exception ;
	List<Watch> displayWatches() throws Exception;
	List<Watch> takeOld() throws Exception;
	void deleteWatchByBrand(String brand) throws Exception;
	void storeWatches(List<Watch> watches) throws Exception;
	void updateOldByNewBrand(String oldBrand,String newBrand) throws Exception;
	void updateModelByBrand(String brand,String model) throws Exception;

}
