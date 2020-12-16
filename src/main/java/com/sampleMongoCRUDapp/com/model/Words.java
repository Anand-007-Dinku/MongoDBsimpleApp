package com.sampleMongoCRUDapp.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Anand SN
 */

@Document(collection = "words_and_ASCII")
public class Words {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private long id;

    private String word;

    private long ASCIInumberOfWord;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public long getASCIInumberOfWord() {
        return ASCIInumberOfWord;
    }

    public void setASCIInumberOfWord(long ASCIInumberOfWord) {
        this.ASCIInumberOfWord = ASCIInumberOfWord;
    }

    public Words(long id, String word, long ASCIInumberOfWord) {
        this.id = id;
        this.word = word;
        this.ASCIInumberOfWord = ASCIInumberOfWord;
    }
}
