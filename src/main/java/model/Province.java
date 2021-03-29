package model;

import javax.persistence.*;

@Entity
@Table(name = "Province")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Province(Long id) {
        this.id = id;
    }

    public Province() {
    }
}
