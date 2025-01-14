package duke;

/**
 * Class representing any Duke-specific exceptions
 */
public class DukeException extends Exception {

    public DukeException() {
        super();
    }
    public DukeException(String msg) {
        super(msg);
    }
}
