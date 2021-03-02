package com.tts.practicesession.repo;

import com.tts.practicesession.model.Crystal;
import com.tts.practicesession.service.CrystalService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Repository
public interface CrystalRepository extends CrudRepository<Crystal, Long> {
}

//@RequestMapping("/crystal")
//@RestController
//public class CrystalRepository {
//
//    CrystalService crystalService;
//
//    public CrystalRepository(CrystalService crystalService) {
//        this.crystalService = crystalService;
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Crystal> getCrystalById(@PathVariable Long id) {
//        return crystalService.getCrystal(id);
//    }
//
//    @GetMapping("/all")
//    public Iterable<Crystal> getAllCrystals() {
//        return crystalService.getAllCrystals();
//    }
//
//}
