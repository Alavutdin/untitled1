package org.example.task;

import javax.persistence.*;

@Entity
@Table(name = "test.magic")
public class Magic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Course")
    private String name;

    public Magic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Magic() {
    }
}
