package com.example.demo.technicalpanel;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

/**
 * @author KUNAL
 *
 */
@Service
public class TechnicalPanelService {
	
	private final TechnicalPanelRepository technicalPanelRepository;

	@Autowired
	public TechnicalPanelService(TechnicalPanelRepository technicalPanelRepository) {
		this.technicalPanelRepository = technicalPanelRepository;
	}
	
	public List<TechnicalPanel> getAllTechnicalPanel(){
		return technicalPanelRepository.findAll(Sort.by("detailTechStack").descending());   
	}
	
	@Transactional
	public TechnicalPanel addTechnicalPanel(TechnicalPanel technicalPanel) {
		return technicalPanelRepository.save(technicalPanel);
	}
	
	@Transactional
	public TechnicalPanel updateTechnicalPanel(TechnicalPanel technicalPanel, Long panelId) throws Exception {
		TechnicalPanel technicalPanelObject = technicalPanelRepository.findById(panelId).orElse(null);
		if(technicalPanelObject != null && technicalPanelObject.getPanelId() != technicalPanel.getPanelId()) {
			throw new Exception("ID and object are not matching");
		}
		return technicalPanelRepository.save(technicalPanel);
	}
	
	public void deleteTechnicalPanel(Long panelId) throws Exception {
		TechnicalPanel technicalPanelObject = technicalPanelRepository.getById(panelId);
		if(technicalPanelObject !=null) {
			throw new Exception("Object not present");
		}
		technicalPanelRepository.deleteById(panelId);
	}
	
	
	

}
