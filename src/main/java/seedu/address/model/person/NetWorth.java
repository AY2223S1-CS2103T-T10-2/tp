package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;


/**
 * Represents a Person's net worth in the address book.
 */
public class NetWorth {

    public static final String MESSAGE_CONSTRAINTS =
            "Net worth should only contain numbers and net worth should be at least 4 digits";
    public static final String VALIDATION_REGEX = "\\d{4,}";
    public final String value;

    /**
     * Constructs a {@code Phone}.
     *
     * @param netWorth A valid net worth.
     */
    public NetWorth(String netWorth) {
        requireNonNull(netWorth);
        checkArgument(isValidNetWorth(netWorth), MESSAGE_CONSTRAINTS);
        value = netWorth;
    }

    /**
     * Returns true if a given string is a valid networth.
     */
    public static boolean isValidNetWorth(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Phone // instanceof handles nulls
                && value.equals(((Phone) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
