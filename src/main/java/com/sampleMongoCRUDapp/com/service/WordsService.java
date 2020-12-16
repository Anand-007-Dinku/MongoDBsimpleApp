package com.sampleMongoCRUDapp.com.service;

import com.sampleMongoCRUDapp.com.model.Words;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anand SN
 */
@Service
public interface WordsService {
    public List<Words> getAllWords();

    public Words insertWordIntoDB(Words words);

    public List<Words> getMatchingWords(String word);
}
