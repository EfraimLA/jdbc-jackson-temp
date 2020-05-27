package io.efraim.quarkus.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "users_birth_data")
public class User extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Temporal(value = TemporalType.DATE)
    public Date birthDate;

    @Temporal(value = TemporalType.TIME)
    public Date birthTime;
}
