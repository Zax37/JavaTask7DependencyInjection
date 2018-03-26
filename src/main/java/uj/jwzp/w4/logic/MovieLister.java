package uj.jwzp.w4.logic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import uj.jwzp.w4.model.Movie;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Scope("prototype")
public class MovieLister {
    private MovieFinder finder;

    public MovieLister(String name) {
        finder = new CSVMovieFinder(name);
    }

    public List<Movie> moviesDirectedBy(String name) {
        List<Movie> allMovies = finder.findAll();
        return allMovies.stream()
                .filter(m -> m.getDirector().equals(name))
                .collect(Collectors.toList());
    }
}
