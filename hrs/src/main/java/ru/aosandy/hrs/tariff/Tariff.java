package ru.aosandy.hrs.tariff;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tariffs")
@Getter
@Setter
public class Tariff {

    @Id
    private int id;

    @Column
    private String name;
}
