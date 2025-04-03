package task19;

/*
    Write an application that consists of few classes:
    a. Author class, representing an author – poem writer, which consists of fields surname
    and nationality (both of type String)
    b. Poem class, representing poem, which consists of fields creator (type Author) and
    stropheNumbers (type int – numbers of strophes in poem)
    c. Main class, with main method, inside which you will:
    i. Create three instances of Poem class, fill them with data (using constructor
    and/or setters) and store them in array
    ii. Write a surname of an author, that wrote a longest poem (let your application
    calculate it!)
 */

public class Poem {

    private Author creator;     // compunere / composition
    private int stropheNumbers;

    public Poem(int stropheNumbers, Author creator) {
        this.stropheNumbers = stropheNumbers;
        this.creator = creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }
}
