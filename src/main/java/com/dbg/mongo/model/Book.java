package com.dbg.mongo.model;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 8620857413630670758L;

	private String title;

	private Integer pages;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

}
