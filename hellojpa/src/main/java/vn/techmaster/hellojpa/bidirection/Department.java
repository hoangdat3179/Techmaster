package vn.techmaster.hellojpa.bidirection;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Table @Data
public class Department {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  public Department(String name) {
    this.name = name;
  }

  @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = false)
  private List<Professor> professors = new ArrayList<>();

  public void add(Professor professor) {
    professor.setDepartment(this);    
    professors.add(professor);
  }

  public void remove(Professor professor) {    
    professor.setDepartment(null);
    professors.remove(professor);    
  }

  /*
  Nếu không có hàm này, khi department xoá, thì xoá luôn giáo sư
  */
  @PreRemove
  public void preRemove() {
    professors.stream().forEach(p -> p.setDepartment(null));
    professors.clear();
  }
}
