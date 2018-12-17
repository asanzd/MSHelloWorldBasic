package es.asd.personal.rest.services.V1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestServices {

	Logger log=LoggerFactory.getLogger(TestServices.class);
	
	
	@RequestMapping("/version")
	public ResponseEntity<String> version(){
		
		log.info("HEALTH OK");
		return new ResponseEntity<String>("1.0.0",HttpStatus.OK);
	}
	
 
	
}
