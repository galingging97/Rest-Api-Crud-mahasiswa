package mahasiswa.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mahasiswa.data.entity.Mahasiswa;
import mahasiswa.data.repository.MahasiswaRepo;

@Service
public class MahasiswaServis {
    @Autowired
    private MahasiswaRepo mahasiswaRepo ;


    public Mahasiswa findById(Long id) {
        return mahasiswaRepo.findById(id).orElse(null);
    }

    public Mahasiswa save(Mahasiswa mahasiswa){
        return mahasiswaRepo.save(mahasiswa);
    }

    public Iterable<Mahasiswa> findAll(){
        return mahasiswaRepo.findAll();
    }

    public Mahasiswa findByJurusan(String jurusan){
        return mahasiswaRepo.findByJurusan(jurusan);
    }

    public void delete(Long id){
        mahasiswaRepo.deleteById(id);
    }
}
