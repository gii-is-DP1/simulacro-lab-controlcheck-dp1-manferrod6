package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	@Query("SELECT P FROM Product P")
    List<Product> findAll();
    
	@Query("SELECT PT FROM ProductType PT")
    List<ProductType> findAllProductTypes();

	@Query("SELECT P FROM Product P WHERE P.id=?1")
    Optional<Product> findById(int id);
    
    Product findByName(String name);
    
    Product save(Product p);
    
}
