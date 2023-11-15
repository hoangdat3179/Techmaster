package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Job {
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String title;

  private String description;

  @Enumerated(EnumType.STRING)
  private City city;


  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Employer employer;

}
