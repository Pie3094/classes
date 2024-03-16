import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudenteService {

    @Autowired
    private studentRepository studentRepository;

    public List<Studente> findAll() {
        return studenteRepository.findAll();
    }

    public Studente findById(Long id) {
        return studenteRepository.findById(id).orElse(null);
    }

    public Studente save(Studente studente) {
        return studenteRepository.save(studente);
    }

    public void delete(Long id) {
        studenteRepository.deleteById(id);
    }

}