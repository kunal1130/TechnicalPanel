package com.example.demo.technicalpanel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KUNAL
 *
 */
@RestController
@RequestMapping("/technicalpanel")
public class TechnicalPanelController {

	
	private final TechnicalPanelService technicalPanelService;

	@Autowired
	public TechnicalPanelController(TechnicalPanelService technicalPanelService) {
		this.technicalPanelService = technicalPanelService;
	}

	@GetMapping
	public List<TechnicalPanel> getAllTechnicalPanel(){
		return technicalPanelService.getAllTechnicalPanel();
	}
	
	@PostMapping
	public TechnicalPanel addTechnicalPanel(@Validated @RequestBody TechnicalPanel technicalPanel) {
		return technicalPanelService.addTechnicalPanel(technicalPanel);
	}
	
	@PutMapping("/{panelId}")
	public TechnicalPanel updateTechnicalPanel(@Validated @RequestBody TechnicalPanel technicalPanel, @PathVariable(name="panelId")Long panelId) throws Exception {
		return technicalPanelService.updateTechnicalPanel(technicalPanel,panelId);
	}
	
	@DeleteMapping("/{panelId}")
	public void deleteTechnicalPanel(@PathVariable(name="panelId")Long panelId) throws Exception {
		 technicalPanelService.deleteTechnicalPanel(panelId);
	}
}
