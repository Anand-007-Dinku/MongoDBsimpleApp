package com.sampleMongoCRUDapp.com.repository;

import com.sampleMongoCRUDapp.com.model.Words;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Anand SN
 */
@Repository
public interface WordsRepository extends MongoRepository<Words,Long> {

    List<Words> findByASCIInumberOfWord(long asciIofWOrd);
}
