package org.jsp.annotation.dao;

import java.util.List;

import org.jsp.annotation.entity.Watch;

public interface WatchDao {
	void insertWatch(Watch watch) throws Exception;
	List<Watch> displayWatch() throws Exception;
	List<Watch> takeOld() throws Exception;


}
