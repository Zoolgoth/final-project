package pl.sdacademy.adsense_web;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubpageRepository extends JpaRepository<Subpage, Integer> {

    Subpage findByName (String name);

}
