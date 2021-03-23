import org.junit.Test;

public class TableTest {
    /**
     * Generates a movie table for testing
     *
     * @return a sample movie table
     */
    public Table createMovieTable() {
        Table movie = new Table("movie", "title year length genre studioName producerNo",
                "String Integer Integer String String Integer", "title year");
        Comparable[] film0 = {"Star_Wars", 1977, 124, "sciFi", "Fox", 12345};
        Comparable[] film1 = {"Star_Wars_2", 1980, 124, "sciFi", "Fox", 12345};
        Comparable[] film2 = {"Rocky", 1985, 200, "action", "Universal", 12125};
        Comparable[] film3 = {"Rambo", 1978, 100, "action", "Universal", 32355};
        movie.insert(film0);
        movie.insert(film1);
        movie.insert(film2);
        movie.insert(film3);
        return movie;
    }

    /**
     * Generates a cinema table for testing
     *
     * @return a sample movie table
     */
    public Table createCinemaTable() {
        Table cinema = new Table("movie", "title year length genre studioName producerNo",
                "String Integer Integer String String Integer", "title year");
        Comparable[] film0 = {"Rocky", 1985, 200, "action", "Universal", 12125};
        Comparable[] film1 = {"Rambo", 1978, 100, "action", "Universal", 32355};
        Comparable[] film2 = {"Galaxy_Quest", 1999, 104, "comedy", "DreamWorks", 67890};
        cinema.insert(film0);
        cinema.insert(film1);
        cinema.insert(film2);
        return cinema;
    }

    /**
     * Tests the Select method.
     */
    @Test
    public void testSelect() {

    }

    /**
     * Tests the Project method.
     */
    @Test
    public void testProject() {

    }

    /**
     * Tests the Union method.
     */
    @Test
    public void testUnion() {

    }

    /**
     * Tests the Minus method.
     */
    @Test
    public void testMinus() {

    }

    /**
     * Tests the Join method.
     */
    @Test
    public void testJoin() {

    }
}
