package ge.edu.btu.davaleba.service.impl;

import ge.edu.btu.davaleba.dto.movie.*;
import ge.edu.btu.davaleba.model.Movie;
import ge.edu.btu.davaleba.repository.MovieRepository;
import ge.edu.btu.davaleba.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());
        AddMovieOutput addMovieOutput = new AddMovieOutput();
        movieRepository.save(movie);
        addMovieOutput.setMsg("ფილმი წარმატებით დაემატა");
        return addMovieOutput;
    }

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        Movie movie = movieRepository.getOne(getMovieInput.getId());
        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setId(movie.getId());
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());
        return getMovieOutput;
    }

    @Override
    public GetMoviesOutput getMovies(GetMoviesInput getMoviesInput) {
        List<MovieDTO> movieDTOS = new ArrayList<>();
        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();
        for(Movie movie:movieRepository.findAll()){
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());
            movieDTOS.add(movieDTO);
        }
        getMoviesOutput.setMovieDTOList(movieDTOS);
        return getMoviesOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        Movie movie = movieRepository.getOne(deleteMovieInput.getId());
        movieRepository.delete(movie);
        DeleteMovieOutput deleteMovieOutput = new DeleteMovieOutput();
        deleteMovieOutput.setMsg("ფილმი წაიშალა");
        return deleteMovieOutput;
    }
}
