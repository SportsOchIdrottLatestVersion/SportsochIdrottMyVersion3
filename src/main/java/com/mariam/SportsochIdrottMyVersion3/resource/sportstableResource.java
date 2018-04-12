
package com.mariam.SportsochIdrottMyVersion3.resource;


import java.util.List;
import com.mariam.SportsochIdrottMyVersion3.model.sportstable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mariam.SportsochIdrottMyVersion3.repository.sportstableRepository;
import java.net.URI;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author maria
 */
@RestController
@RequestMapping(value="/rest/sportstable")
public class sportstableResource {
    @Autowired
    sportstableRepository sportstablerepository;
   @GetMapping(value="/all")
   public List<sportstable> getAll()
   {
       return sportstablerepository.findAll();
   }
   @GetMapping(value="/one/{id}")
   public sportstable getOne(@PathVariable String id) throws SportNotFoundException
   {
       Optional<sportstable> s=sportstablerepository.findById(Integer.parseInt(id));
       if(!s.isPresent())
       {
           throw new SportNotFoundException("id-"+id);
       }
       return s.get();
   }
  @DeleteMapping(value="/delete/{id}")
public void deleteSport(@PathVariable String id) {
    sportstablerepository.deleteById(Integer.parseInt(id));
    
}
@PostMapping("/load")
//	public ResponseEntity<Object> createNewSport(@RequestBody sportstable s) {
//		sportstable savedsport = sportstablerepository.save(s);
//
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(savedsport.getId()).toUri();
//
//		return ResponseEntity.created(location).build();

public sportstable createSport(@Valid @RequestBody sportstable s) {
           // public String createSport(sportstable s) {
        return sportstablerepository.save(s); 
}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody sportstable s, @PathVariable String id) {

		Optional<sportstable> sportOptional = sportstablerepository.findById(Integer.parseInt(id));

		if (!sportOptional.isPresent())
			return ResponseEntity.notFound().build();

		s.setId(Integer.parseInt(id));
		
		sportstablerepository.save(s);

		return ResponseEntity.noContent().build();
	}
}

//public List<sportstable> persist(@RequestBody final sportstable s)
//{
//
//sportstablerepository.save(s);
//return sportstablerepository.findAll();
//}        


    
    
    

