import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// STUDENT TO TEST ALL METHODS IN AbstractTune
// TWO ASSERTIONS PER METHOD, THREE FOR COMPARISONS

class AbstractTuneTest {

  private AbstractTune tune1;
  private AbstractTune tune2;
  private AbstractTune tune3;

  @BeforeEach
  void setUp() {
    tune1 = new Mp3Tune("A", new Person("AA", 1999), Genre.HIPHOP, 128, "A.mp3");
    tune2 = new Mp3Tune("B", new Person("BB", 2000), Genre.ROCK, 133, "B.mp3");
    tune3 = new Mp3Tune("A", new Person("AA", 1999), Genre.HIPHOP, 128, "A.mp3");

  }

  // SOME EXAMPLES OF STUBBED OUT TESTS (ALL METHODS REQUIRE TESTING, NOT JUST
  // THE ONES SHOWN HERE)

  @Test
  void getTitle() {
    assertEquals("A", tune1.getTitle());
    assertEquals("B", tune2.getTitle());
  }

  @Test
  void getArtist() {
    assertEquals("AA", tune1.getArtist().getName());
    assertEquals(1999, tune1.getArtist().getBirthYear());
    assertEquals("BB", tune2.getArtist().getName());
    assertEquals(2000, tune2.getArtist().getBirthYear());
  }

  @Test
  void getGenre() {
    assertEquals(Genre.HIPHOP, tune1.getGenre());
    assertEquals(Genre.ROCK, tune2.getGenre());
  }

  @Test
  void getTempo() {
    assertEquals(128, tune1.getTempo());
    assertEquals(133, tune2.getTempo());
  }

  @Test
  void getFilePath() {
    assertEquals("A.mp3", tune1.getFilePath());
    assertEquals("B.mp3", tune2.getFilePath());
  }


  @Test
  void testToString() {
    assertEquals("Title: A, Artist: AA, Genre: HIPHOP, Tempo: 128, FilePath: A.mp3", tune1.toString());
    assertEquals("Title: B, Artist: BB, Genre: ROCK, Tempo: 133, FilePath: B.mp3", tune2.toString());
  }

  @Test
  void testCompareTo() {
    assertEquals(-1, tune1.compareTo(tune2));
    assertEquals(1, tune2.compareTo(tune1));
    assertEquals(0, tune1.compareTo(tune3));
  }

  @Test
  void testHashCode(){
    assertNotEquals(tune1.hashCode(), tune2.hashCode());
    assertNotEquals(tune2.hashCode(), tune3.hashCode());
  }

  @Test
  void testEquals(){
    assertFalse(tune1.equals(tune2));
    assertTrue(tune1.equals(tune3));
  }
}
