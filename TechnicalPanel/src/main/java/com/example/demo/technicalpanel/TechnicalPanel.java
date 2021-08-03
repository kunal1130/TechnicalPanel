package com.example.demo.technicalpanel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author KUNAL
 *
 */
@Entity
public class TechnicalPanel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long panelId;	
	
	private String panel;
	
	private String techStream;
	
	private String detailTechStack;
	
	private String firstLevel;
	
	private String secondLevel;
	
	private String managerialLevel;

	public Long getPanelId() {
		return panelId;
	}

	public void setPanelId(Long panelId) {
		this.panelId = panelId;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getTechStream() {
		return techStream;
	}

	public void setTechStream(String techStream) {
		this.techStream = techStream;
	}

	public String getDetailTechStack() {
		return detailTechStack;
	}

	public void setDetailTechStack(String detailTechStack) {
		this.detailTechStack = detailTechStack;
	}

	public String getFirstLevel() {
		return firstLevel;
	}

	public void setFirstLevel(String firstLevel) {
		this.firstLevel = firstLevel;
	}

	public String getSecondLevel() {
		return secondLevel;
	}

	public void setSecondLevel(String secondLevel) {
		this.secondLevel = secondLevel;
	}

	public String getManagerialLevel() {
		return managerialLevel;
	}

	public void setManagerialLevel(String managerialLevel) {
		this.managerialLevel = managerialLevel;
	}

}
