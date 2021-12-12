package com.hiper.repository.crud;

import com.hiper.model.Supplement;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author desarrolloextremo
 */
public interface SupplementCrudRepository extends MongoRepository<Supplement, String> {
    
}
