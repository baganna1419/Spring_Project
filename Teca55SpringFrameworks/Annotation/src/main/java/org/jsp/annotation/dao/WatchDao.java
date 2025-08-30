package org.jsp.annotation.dao;

import org.jsp.annotation.entity.Watch;

public interface WatchDao {
	void insertWatch(Watch watch);
	void displayWatch();
    void updateWatchTypeByBrand(String brandName,String type);
    void deleteWatchByBrandName(String brandName);
    void printPriceBasedOnWatchBrand(String brandName);
    void updateWatchModelBasedOnBrandAndTypeOfWatch(String brandName,String type);
    void searchTypeOfWatchByBrand(String brandName);

}
