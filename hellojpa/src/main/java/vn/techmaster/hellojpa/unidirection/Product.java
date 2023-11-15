package vn.techmaster.hellojpa.unidirection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "product")
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
  private Category category;

  public Product(String name, Category category) {
    this.name = name;
    this.category = category;
  }
}
