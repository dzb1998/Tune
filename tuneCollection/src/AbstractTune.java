import java.util.Locale;
import java.util.Objects;

/**
 * Abstract Tune class helps implement the Tune interface
 * <p></p>
 * STUDENT TO COMPLETE -- INCLUDING JAVADOCS, STUBBED/MISSING METHODS
 * See AbstractTuneTest as well
 */
// BUG
//public abstract class AbstractTune extends Tune, Comparable<Tune> {
public abstract class AbstractTune implements Tune, Comparable<Tune> {
  private String title;
  private Person artist;
  private Genre genre;
  private int tempo;
  private String filePath;

  /**
   * STUDENT TO COMPLETE JAVADOCS and ARG-CHECKING of CONSTRUCTOR
   */
  public AbstractTune(String title, Person artist, Genre genre, int tempo, String filePath) throws IllegalArgumentException {
    // BUG - should do null check see if there's a IllegalArgumentException
    if (title == null || title.isEmpty() || artist == null || genre == null || filePath == null || filePath.isEmpty() || tempo <= 0) {
      throw new IllegalArgumentException("argument is invalid");
    }

    this.title = title;
    this.artist = artist;
    this.genre = genre;
    this.tempo = tempo;
    // BUG
    this.filePath = filePath;
  }

  /**
   * STUDENT TO COMPLETE REMAINING METHODS, except playTune, here.
   * INCLUDE ACTUAL JAVADOCS and ARG CHECKS. THIS SHOULD INCLUDE
   * equals METHOD, hashCode METHOD, and toString METHODS. See the
   * parent Interface for a full list of methods required. What
   * you see here has been partly "stubbed out" to get started.
   */
  // BUG - should have override for title as well
  @Override
  public String getTitle () {
      return this.title;
    }

  @Override
  public Person getArtist() {
    return this.artist;
  }

  @Override
  public Genre getGenre() {
    return this.genre;
  }

  @Override
  public int getTempo() {
    return this.tempo;
  }

  @Override
  public String getFilePath() {
    return this.filePath;
  }

  /*
   There is one required method that is NOT to be implemented here:
   the method for playing a tune from a file. That is left to each concrete
   class that extends AbstractTune, based on the type of file that
   contains the music. See the two concrete classes for details.
  */

  /** Overriding equals for Tunes to examine all attributes */
  @Override
  // BUG
//  public boolean equals (Tune other) {
  public boolean equals (Object obj) {
    // Student to complete
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof AbstractTune)) {
      return false;
    }
    AbstractTune t = (AbstractTune) obj;
    return this.title.equals(t.getTitle()) && this.artist.getName().equals(t.getArtist().getName())
        && this.artist.getBirthYear() == t.getArtist().getBirthYear() && this.genre == t.getGenre()
        && this.tempo == t.getTempo() && this.filePath.equals(t.getFilePath());

  }

  /** Overriding hashCode for Tunes to match equals */
  @Override
  public int hashCode () {
    // Student to complete
    return Objects.hash(this.title, this.artist, this.genre, this.tempo, this.filePath);
  }

  /** Overriding toString for Tunes to include all attributes */
  @Override
  public String toString () {
    // Student to complete
    return "Title: " + this.title + ", Artist: " + this.artist.getName() + ", Genre: " + this.genre
        + ", Tempo: " + this.tempo + ", FilePath: " + this.filePath;
  }

  /**
   * Comparable Interface for comparing based on Title
   * <p></p>
   * 
   * @param other -- a Tune
   * @return negative, 0, or positive int based on Title
   *         Comparison should ignore case (so A equals a)
   */
  @Override
  public int compareTo(Tune other) {
    // STUDENT TO IMPLEMENT
    if (this.title.toUpperCase().charAt(0) < other.getTitle().toUpperCase().charAt(0)) {
      return -1;
    } else if (other.getTitle().toUpperCase().charAt(0) < this.title.toUpperCase().charAt(0)) {
      return 1;
    } else {
      return 0;
    }
  }
}
