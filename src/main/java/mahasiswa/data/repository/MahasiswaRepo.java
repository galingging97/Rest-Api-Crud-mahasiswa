package mahasiswa.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mahasiswa.data.entity.Mahasiswa;


public interface MahasiswaRepo extends JpaRepository<Mahasiswa, Long> {
    Mahasiswa findByJurusan(String jurusan);
}
