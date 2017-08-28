package com.sherwin.otd.commands.bean;

import java.util.List;

public class Commands {
	
	private List create;
	private List delete;
	private List update;
	private List validate;

	public List getCreate() {
		return create;
	}

	public void setCreate(List create) {
		this.create = create;
	}

	public List getDelete() {
		return delete;
	}

	public void setDelete(List delete) {
		this.delete = delete;
	}

	public List getUpdate() {
		return update;
	}

	public void setUpdate(List update) {
		this.update = update;
	}

	public List getValidate() {
		return validate;
	}

	public void setValidate(List validate) {
		this.validate = validate;
	}
	

}
