package jgisson.quarkus.tuto.fruits;

import java.util.List;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
class Fruit extends PanacheEntity {
    
    public String name;

    public String season;

    public static List<Fruit> findBySeason(String season) {
        return find("season", season).list();
    }

}