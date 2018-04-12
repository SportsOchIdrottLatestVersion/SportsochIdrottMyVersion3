package com.mariam.SportsochIdrottMyVersion3.resource;
import com.mariam.SportsochIdrottMyVersion3.model.region;
import com.mariam.SportsochIdrottMyVersion3.repository.regionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/rest/region")
public class regionResource {
  
    @Autowired
   regionRepository regionrepository;
   @GetMapping(value="/all")
   public List<region> getAll()
   {
       return regionrepository.findAll();
   }
   @GetMapping(value="/one/{id}")
   public region getOne(@PathVariable String id) throws RegionNotFoundException
   {
       Optional<region> r=regionrepository.findById(Integer.parseInt(id));
       if(!r.isPresent())
       {
           throw new RegionNotFoundException("id-"+id);
       }
       return r.get();
   }
@PostMapping(value="/load")

public List<region> persist(@RequestBody final region r)
{

regionrepository.save(r);
return regionrepository.findAll();
}        
  
}


