package com.daas.core.service.login;

import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daas.core.businesss.login.DataAcquisitionLoginBusinessService;
import com.daas.core.model.login.User;


/**
 * This class provides the implementation for DataAcquisitionLoginService methods to invoke
 * the corresponding business methods of DataAcquisitionBusinessService interface.
 * 
 * @author snatti
 */
@Path("/bdaas/")
@Service
public class DataAcquisitionLoginServiceImpl implements DataAcquisitionLoginService {

	/**
     * Logger object to log the activities performed in this class.
     */
	
	private Logger logger=LoggerFactory.getLogger(DataAcquisitionLoginServiceImpl.class);	

	 /**
     * Autowired businessService implementation class to perform business.
     */
	@Autowired
	DataAcquisitionLoginBusinessService dataAcquisitionLoginBusinessService;
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		logger.info("Enter DataAcquisitionLoginServiceImpl login");
		User users = this.dataAcquisitionLoginBusinessService.findUserDetails(user);
		logger.info("Exit DataAcquisitionLoginServiceImpl login");
		return users;
	}


	
		

}
