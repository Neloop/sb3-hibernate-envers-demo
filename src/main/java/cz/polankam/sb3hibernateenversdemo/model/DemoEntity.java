package cz.polankam.sb3hibernateenversdemo.model;

import jakarta.persistence.*;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Table(name = "DEMO")
public class DemoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEMO_GEN")
    @SequenceGenerator(name = "DEMO_GEN", sequenceName = "DEMO_GEN", allocationSize = 1)
    private Long id;

    @Lob
    private String description;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
