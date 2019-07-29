package com.stackroute.muzixapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Track {


    @Id
    //@Value("${track.id}")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
//@Value("{track.name}")
    String name;
//@Value("{track.comment}")
    String comment;

}
