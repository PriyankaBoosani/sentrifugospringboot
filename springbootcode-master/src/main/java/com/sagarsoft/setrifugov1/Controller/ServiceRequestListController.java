package com.sagarsoft.setrifugov1.Controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sagarsoft.setrifugov1.Dao.MyHolidayListDAO;
import com.sagarsoft.setrifugov1.Dao.MySkillSetDAO;
import com.sagarsoft.setrifugov1.Dao.ServiceRequestListDAO;
import com.sagarsoft.setrifugov1.model.MyHolidayCalendar;
import com.sagarsoft.setrifugov1.model.MyLeaveRequests;
import com.sagarsoft.setrifugov1.model.MySkillsList;
import com.sagarsoft.setrifugov1.model.ServiceRequestList;

@RestController
@CrossOrigin(origins = "*")
public class ServiceRequestListController {
	
	
	
	@Autowired
	private ServiceRequestListDAO srld;
	
	@Autowired
	private MyHolidayListDAO mhld;
	
	@Autowired
	private MySkillSetDAO mssd;
	
	// API to get all service requests
	@GetMapping("/srl")
	@CrossOrigin(origins = "*")
	public List<ServiceRequestList> getAllServiceRequestListDAO() {
		return srld.findAll();
	}
	
	
	// API to insert a service request
	@PostMapping("/srli")
	@CrossOrigin(origins = "*")
	public ServiceRequestList insertServiceRequestList(@RequestBody ServiceRequestList srl) {
		return srld.save(srl);
		
	}
	
	// API to get list of holidays
	@GetMapping("/mhc")
	@CrossOrigin(origins = "*")
	public List<MyHolidayCalendar> getAllHolidaysListDAO() {
		return mhld.findAll();
	}
	
	// API to insert a holiday
	@PostMapping("/mhci")
	@CrossOrigin(origins = "*")
	public MyHolidayCalendar insertMyHolidayCalendarList(@RequestBody MyHolidayCalendar mhc) {
		return mhld.save(mhc);
		
	}
	
	// API to get list of skills
	@GetMapping("/mssl")
	@CrossOrigin(origins = "*")
	public List<MySkillsList> getAllSkillSetListDAO() {
		return mssd.findAll();
	}
	
	@GetMapping("/mssl/{slno}")
	@CrossOrigin(origins = "*")
	public MySkillsList getSkillsById(@PathVariable("slno") int id) {
		return mssd.getById(id);
		
	}
	
	// API to insert a new skill
	@PostMapping("/mssli")
	@CrossOrigin(origins = "*")
	public MySkillsList insertMySkillSetList(@RequestBody MySkillsList mhc) {
		return mssd.save(mhc);
		
	}
	
	
	
	// Method to get service request by status 
	public ServiceRequestList getByStatus(String status) {
			
			ServiceRequestList srl = (ServiceRequestList) srld.findAll().stream().filter(t -> status.equalsIgnoreCase(t.getStatus())).findFirst().orElse(null);
			
			return srl;
		}
	
	// API to get service request by status
	@RequestMapping(value="/srl/{status}")
	@CrossOrigin(origins = "*")
	public ServiceRequestList getByStat(@PathVariable String status) {
		return getByStatus(status);
	}
	
	
	
	
}
