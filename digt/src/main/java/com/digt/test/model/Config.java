package com.digt.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Json reader Model class
 */
@Getter
@Setter
public class Config {
    @JsonProperty("fileName")
    public String fileName;
    @JsonProperty("CharacterToComapre")
    public Character characterToCompare;
    @JsonProperty("CountToBePrinted")
    public int characterCount;

}
