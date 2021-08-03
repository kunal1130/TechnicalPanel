package com.example.demo.technicalpanel;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author KUNAL
 *
 */
@Repository
public interface TechnicalPanelRepository extends JpaRepository<TechnicalPanel, Long>{
	
}
