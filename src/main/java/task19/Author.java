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

public class Author {

    // atributele
    private String surname;
    private String nationality;

    // constructor default/neparametrizat
    public Author() {
        this.surname = "";
        this.nationality = "";
    }

    // constructor parametrizat
    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    // getters/setters
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // metode suprascrise
    // metode specifice obiectului
    // etc..
}
