package com.sagarsoft.setrifugov1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagarsoft.setrifugov1.Dao.ConferenceAttendeesDao;
import com.sagarsoft.setrifugov1.Dao.ConferenceBookingDao;
import com.sagarsoft.setrifugov1.Dao.ConferenceRepeatDao;
import com.sagarsoft.setrifugov1.Dao.ConferenceRoomDao;
import com.sagarsoft.setrifugov1.model.ConferenceAttendees;
import com.sagarsoft.setrifugov1.model.ConferenceBooking;
import com.sagarsoft.setrifugov1.model.ConferenceRepeat;
import com.sagarsoft.setrifugov1.model.ConferenceRoom;



@RestController
@RequestMapping("/conferencebooking")
public class ConferenceController {
	
	@Autowired
	ConferenceBookingDao conferenceBookingDao;
	
	@Autowired
	ConferenceRepeatDao conferenceRepeatDao;
	
	@Autowired
	ConferenceAttendeesDao conferenceAttendeesDao;
	
	@Autowired
	ConferenceRoomDao conferenceRoomDao;
	
	 @CrossOrigin(origins = "*")
	    @GetMapping("/allbookings")
	public List<ConferenceBooking> allusers () {
        return conferenceBookingDao.findAll();
    }
	 
	 @PostMapping("/schedulebooking")
		@CrossOrigin(origins = "*")
		public ConferenceBooking insertConferenceBooking(@RequestBody ConferenceBooking cb) {
			return conferenceBookingDao.save(cb);
			
		}
	 @GetMapping("/allrepeat")
	 @CrossOrigin(origins = "*")
	 public List<ConferenceRepeat> allusers1 () {
	        return conferenceRepeatDao.findAll();
	    }
	 
	 @GetMapping("/allattendees")
	 @CrossOrigin(origins = "*")
	 public List<ConferenceAttendees> allusers2 () {
	        return conferenceAttendeesDao.findAll();
	    }
	 
	 @GetMapping("/allrooms")
	 @CrossOrigin(origins = "*")
	 public List<ConferenceRoom> allusers3 () {
	        return conferenceRoomDao.findAll();
	    }
		
	

}
