package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown=true)
public class TrelloBoardDto {
    @JsonProperty("name")
    public String name;

    @JsonProperty("id")
    public String id;

   // @JsonProperty("closed")
   // public boolean isClosed;

    @JsonProperty("lists")
    public List<TrelloBoardDto> lists;
}
