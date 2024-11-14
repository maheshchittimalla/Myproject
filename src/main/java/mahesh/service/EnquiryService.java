package mahesh.service;

import java.util.List;

import mahesh.binding.SearchCriteria;
import mahesh.entity.StudentEnq;

public interface EnquiryService {
		public boolean addEnq(StudentEnq se);
		public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s);
		
		
	}

