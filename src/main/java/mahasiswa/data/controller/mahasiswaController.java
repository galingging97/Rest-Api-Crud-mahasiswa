package mahasiswa.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mahasiswa.data.entity.Mahasiswa;
import mahasiswa.data.service.MahasiswaServis;

@RestController
@RequestMapping("/latihan/mahasiswa")
public class mahasiswaController {
    
    @Autowired
    private MahasiswaServis mahasiswaServis;

    @GetMapping("/{id}")
    public Mahasiswa findById(@PathVariable("id") Long id) {
        return mahasiswaServis.findById(id);
    }
    
    @PostMapping
    public Mahasiswa create(@RequestBody Mahasiswa mahasiswa){
        return mahasiswaServis.save(mahasiswa);
    }

    @GetMapping
    public Iterable<Mahasiswa> findAll(){
        return mahasiswaServis.findAll();
    }

    @PutMapping
    public Mahasiswa update(@RequestBody Mahasiswa mahasiswa){
        return mahasiswaServis.save(mahasiswa);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        mahasiswaServis.delete(id);
    }
}
