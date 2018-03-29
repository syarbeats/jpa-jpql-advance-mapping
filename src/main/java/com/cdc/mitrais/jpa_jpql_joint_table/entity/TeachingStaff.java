package com.cdc.mitrais.jpa_jpql_joint_table.entity;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
public class TeachingStaff extends Staff{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String qualification;
	private String subjectexpertise;
	
	public TeachingStaff(int sid, String sname, String qualification, String subjectexpertise) {
		super(sid, sname);
		this.setQualification(qualification);
		this.setSubjectexpertise(subjectexpertise);
	}
	
	public TeachingStaff() {super();}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectexpertise() {
		return subjectexpertise;
	}

	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}
	
	
	
}
