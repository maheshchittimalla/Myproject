package mahesh.service;

import mahesh.binding.DashboardResponse;
import mahesh.entity.Counsellor;

public interface CounsellorService {
		
		public String saveCounsellor(Counsellor c);
		public Counsellor loginCheck(String email,String pwd);
		public boolean recoverPwd(String email);
		public DashboardResponse getDashboardInfo(Integer cid);
		
	}

