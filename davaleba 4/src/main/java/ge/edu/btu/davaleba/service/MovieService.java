package ge.edu.btu.davaleba.service;

import ge.edu.btu.davaleba.dto.movie.*;

public interface MovieService {
    AddMovieOutput addMovie(AddMovieInput addMovieInput);
    GetMovieOutput getMovie(GetMovieInput getMovieInput);
    GetMoviesOutput getMovies(GetMoviesInput getMoviesInput);
    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);
}
