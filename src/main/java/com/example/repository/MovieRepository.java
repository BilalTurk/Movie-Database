package com.example.repository;

/**
 * Created by bilalturk on 11.03.2016.
 */
    import com.example.domain.movie;
    import org.springframework.data.domain.Page;
    import org.springframework.data.domain.Pageable;
    import org.springframework.data.repository.CrudRepository;
public interface  MovieRepository extends CrudRepository<movie, Long>  {
    Page<movie> findAll(Pageable pageable);
}
