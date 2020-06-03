package ge.edu.btu.davaleba.repository;

import ge.edu.btu.davaleba.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
