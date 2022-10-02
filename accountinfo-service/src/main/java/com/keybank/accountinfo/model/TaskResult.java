/**
 * @Copyright 2022, Key Bank pvt ltd, All rights are reserved. You should not disclose the information outside 
 * otherwise terms and condition will apply
 */
package com.keybank.accountinfo.model;

/**
 * @author jatin, 27-Sep-2022
 * Description:
 */
public class TaskResult {
	
	private String taskName;
	private Object result;
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	/**
	 * @return the result
	 */
	public Object getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(Object result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "TaskResult [taskName=" + taskName + ", result=" + result + "]";
	}
	
	
}
