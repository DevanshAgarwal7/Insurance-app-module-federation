package com.insurance.ConfigurationService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "configuration")
public class Configuration {
	
	@Id()
	@Column(name = "id")
	private String id;
	
	@Column(name = "remote_entry")
	private String remoteEntry;
	
	@Column(name = "remote_name")
	private String remoteName;
	
	@Column(name = "exposed_module")
	private String exposedModule;
	
	@Column(name = "outlet")
	private String outlet;
	
	@Column(name = "module")
	private String module;

	public void setRemoteEntry(String remoteEntry) {
		this.remoteEntry = remoteEntry;
	}

	public void setRemoteName(String remoteName) {
		this.remoteName = remoteName;
	}

	public void setExposedModule(String exposedModule) {
		this.exposedModule = exposedModule;
	}

	public void setOutlet(String outlet) {
		this.outlet = outlet;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getRemoteEntry() {
		return remoteEntry;
	}

	public String getRemoteName() {
		return remoteName;
	}

	public String getExposedModule() {
		return exposedModule;
	}

	public String getOutlet() {
		return outlet;
	}

	public String getModule() {
		return module;
	}

}
