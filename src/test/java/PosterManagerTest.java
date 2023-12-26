import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterManager;

public class PosterManagerTest {

    @Test
    public void shouldNotFindAllMovies() {
        PosterManager manager = new PosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMoviesFrom1() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMoviesFrom3() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesFrom1() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesFrom3() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");

        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesFrom5() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5MoviesFromMoreThan5() {
        PosterManager manager = new PosterManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");

        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast3Movies() {
        PosterManager manager = new PosterManager(3);
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");

        String[] expected = {"Film7", "Film6", "Film5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast7Movies() {
        PosterManager manager = new PosterManager(7);
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");

        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast7MoviesFrom3() {
        PosterManager manager = new PosterManager(7);
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");


        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}


