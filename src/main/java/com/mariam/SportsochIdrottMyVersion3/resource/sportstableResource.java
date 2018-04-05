
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
@PostMapping(value="/load")

public List<sportstable> persist(@RequestBody final sportstable s)
{

sportstablerepository.save(s);
return sportstablerepository.findAll();
}        


    
    
    
}
