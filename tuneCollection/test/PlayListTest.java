
// STUDENTS TO COMPLETE ONLY PORTIONS OF THIS FILE:
// setUp, as needed; sortByTitle; and sortByTempo.
// The other methds needing tests may be skipped for this midterm.

// PROVIDE TWO ASSERTIONS PER METHOD (THREE FOR COMPARISON TESTS).

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PlayListTest {

  private PlayList playList;
  private Tune tune1, tune2, tune3;

  @BeforeEach
  void setUp() {
    playList = new PlayList();
    tune1 = new Mp3Tune("A", new Person("AA", 1999), Genre.HIPHOP, 128, "A.mp3");
    tune2 = new Mp3Tune("B", new Person("BB", 2000), Genre.ROCK, 133, "B.mp3");
    tune3 = new Mp3Tune("C", new Person("CC", 2010), Genre.CLASSICAL, 108, "C.mp3");
    playList.addTune(tune1);
    playList.addTune(tune2);
    playList.addTune(tune3);
  }

  @Test
  void addItem() {
  }

  @Test
  void getItem() {
  }

  @Test
  void remove() {
  }

  @Test
  void size() {
  }

  @Test
  void sortByTitle() {
    playList.sortByTitle();
    assertEquals("A", playList.getTune(0).getTitle());
    assertEquals("B", playList.getTune(1).getTitle());
    assertEquals("C", playList.getTune(2).getTitle());
  }

  @Test
  void sortByTempo() {
    playList.sortByTempo();
    assertEquals(108, playList.getTune(0).getTempo());
    assertEquals(128, playList.getTune(1).getTempo());
    assertEquals(133, playList.getTune(2).getTempo());
  }

  @Test
  void testToString() {
  }
}
