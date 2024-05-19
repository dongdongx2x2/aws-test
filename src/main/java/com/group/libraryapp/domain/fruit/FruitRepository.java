package com.group.libraryapp.domain.fruit;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {

    List<Fruit> findByNameAndIsSold(String name, boolean isSold);

}
