package com.sampleMongoCRUDapp.com.webResources;

import com.sampleMongoCRUDapp.com.model.Words;
import com.sampleMongoCRUDapp.com.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Anand SN
 */

@RestController
@RequestMapping("/api/v1")
public class WordsController {

    @Autowired
    WordsService wordsService;


    @GetMapping("/words")
    public List<Words> getAllWords(){
        return wordsService.getAllWords();
    }

    @PostMapping("/addWord")
    public Words insertWordIntoDb(@RequestBody Words words){
        return wordsService.insertWordIntoDB(words);
    }

    @GetMapping("/match/{word}")
    public List<Words> getMatchingWords(@PathVariable(value = "word") String word){
        return wordsService.getMatchingWords(word);
    }
}
