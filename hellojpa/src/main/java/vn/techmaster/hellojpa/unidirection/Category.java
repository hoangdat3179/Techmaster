package vn.techmaster.hellojpa.unidirection;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "category")
@Table(name = "category")
@Data
public class Category {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;

  public Category(String name) {
    this.name = name;
  }
}
