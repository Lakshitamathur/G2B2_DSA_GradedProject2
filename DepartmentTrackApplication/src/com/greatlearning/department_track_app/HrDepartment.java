package com.greatlearning.department_track_app;

import java.util.*;

public class HrDepartment extends SupperDepartment{

	@Override
	public String departmentName() {
		return "Hr Department";
	}
	
	@Override
	public String getTodayWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	@Override
	public String getWorkDeadline() {	
		return "Complete by EOD";	
	}
	
	public String doActivity() {
		return "team Lunch";	
	}
}
