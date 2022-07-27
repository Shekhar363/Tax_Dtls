package com.taxcollectionapp.taxcollection;



import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TaxCollectionController 
{
	@Autowired
    TaxCollectionRepositry tr;

	
	
	@PostMapping("/saveTaxcollection")
public Taxcollection saveTaxcollection( @RequestBody Taxcollection taxcollection)
{
	Taxcollection taxcollection1 = tr.save(taxcollection);
	return taxcollection1;
	
}

	@GetMapping("/getTaxcollection")
	public List<Taxcollection> getTAxxcollection()
	{
		return tr.findAll();
		
	}
	
	@PutMapping("/updateTaxcollection")
	public Taxcollection updateTaxcollection(@RequestParam int taxid,@RequestBody Taxcollection taxcollection)
	{
		Optional<Taxcollection> opt=tr.findById(taxid);
		if(opt.isPresent())
		{
			return tr.save(taxcollection);
		}
		else
		{
			return null;
		}
	}
	
	
	@DeleteMapping("/deleteTaxcollectionById")
	public String deleteTaxcollectionById(@RequestParam int taxid)
	{
		
		Optional<Taxcollection> opt=tr.findById(taxid);
		if(opt.isPresent())
		{
			Taxcollection taxcollection=opt.get();
			tr.delete(taxcollection);
			return "taxcollection delete to given taxid";
		}
		else
		{
			return "There is no taxcollection to delete";
		}
	}
	
	@GetMapping("/getTaxcollectionById1{taxid}")
	public Taxcollection getTaxcollectionById1(@RequestParam int taxid)
	{
		Optional<Taxcollection> opt=tr.findById(taxid);
		
		if(opt.isPresent())
		{
			//System.out.println("No id");
			return tr.getById(taxid);
		}
		else {
			System.out.println("No id");
			return null;
		}
	}
//	  
//	  @GetMapping("/getTaxcollectionById")
//	  public Taxcollection getTaxcollectionById(@RequestParam  int taxid) 
//	  {
//		  Taxcollection taxcollection=tr.getReferenceById(taxid);
//		  return taxcollection;
//	  }
//	  @GetMapping("/getTaxcollection1{taxid}")
//		public List<Taxcollection> getTaxxcollection1()
//		{
//			return tr.findAll();
//			
//		}
//	
	}
	

	
	
	
		
	


