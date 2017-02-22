package FramgiaProject.project01.model;

import java.sql.Date;

public class Tour {
	private int id;
	private Date start_date, finish_date;
	private int tour_master_id;
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFinish_date() {
		return finish_date;
	}
	public void setFinish_date(Date finish_date) {
		this.finish_date = finish_date;
	}
	public int getTour_master_id() {
		return tour_master_id;
	}
	public void setTour_master_id(int tour_master_id) {
		this.tour_master_id = tour_master_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
