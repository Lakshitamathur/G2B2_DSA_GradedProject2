package com.greatlearning.department_track_app;

import java.util.*;

public class TechDepartment extends SupperDepartment {

	@Override
	public String departmentName() {
		return "Tech Department";	
	}
	
	@Override
	public String getTodayWork() {		
		return "Complete coding of module 1";		
	}
	
	@Override
	public String getWorkDeadline() {		
		return "Complete by EOD";		
	}
	
	public String getTechStackInformation() {
		return "core Java";
	}	
}
