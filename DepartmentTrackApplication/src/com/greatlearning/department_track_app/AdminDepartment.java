package com.greatlearning.department_track_app;

import java.util.*;

public class AdminDepartment extends SupperDepartment {
	
	@Override
	public String departmentName(){		
		return "Admin Department";		
	}
	
	@Override
	public String getTodayWork() {
		return "Complete your documents Submission";		
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";	
	}	
}
