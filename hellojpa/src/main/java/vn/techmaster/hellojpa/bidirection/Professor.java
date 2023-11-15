package vn.techmaster.hellojpa.bidirection;

import lombok.Data;

import javax.persistence.*;

@Entity @Table
@Data
public class Professor {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;

  private String name;

  public Professor(String name) {
    this.name = name;
  }

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  //@JoinColumn(name="department_id")
  private Department department;

  @PreRemove
  public void preRemove() {
    department.remove(this);
  }
}
