package com.sampleMongoCRUDapp.com.service;

import com.sampleMongoCRUDapp.com.Utils.StringUtils;
import com.sampleMongoCRUDapp.com.model.Words;
import com.sampleMongoCRUDapp.com.repository.WordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anand SN
 */
@Service
public class WordsServiceImpl implements WordsService {

    @Autowired
    WordsRepository wordsRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    StringUtils stringUtils;

    @Override
    public List<Words> getAllWords() {
        return wordsRepository.findAll();
    }

    @Override
    public Words insertWordIntoDB(Words words) {
        words.setASCIInumberOfWord(stringUtils.getASCIIofWOrd(words.getWord()));
        words.setId(sequenceGeneratorService.generateSequence(Words.SEQUENCE_NAME));
        return wordsRepository.save(words);
    }

    @Override
    public List<Words> getMatchingWords(String word) {


        return wordsRepository.findByASCIInumberOfWord(stringUtils.getASCIIofWOrd(word));

        //findByOrderByaSCII_of_wordAsc
    }
}
