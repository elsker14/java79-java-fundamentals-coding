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

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setSurname("Iancu Jianu");
        author1.setNationality("Roman");

        Author author2 = new Author("George Popescu", "Italian");

        Poem poem1 = new Poem(5, author1);
        Poem poem2 = new Poem(15, author2);

        Poem[] arrPoems = {poem1, poem2};
        for (int i = 0; i < arrPoems.length; i++) {
            System.out.println(arrPoems[i].getStropheNumbers()
                    + " " + arrPoems[i].getCreator().getSurname()
                    + " " + arrPoems[i].getCreator().getNationality());
        }
    }
}
