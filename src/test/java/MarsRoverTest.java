import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    MarsRover marsRover;
    @Before
    public void setUp() {
        Plateau plateau = new Plateau(5,5);
        marsRover = new MarsRover(plateau,1,2,Direction.N);
    }
    @Test
    public void returnInitialPositionWhenStringIsEmpty() {
        assertEquals("1 2 N",marsRover.getPosition());
    }

    @Test
    public void return22NWhenTheRoverIsMoved() {
        marsRover.move("M");
        assertEquals("2 2 N",marsRover.getPosition());

    }

    @Test
    public void return12EWhenRoverIsMovedToLeft() {
        marsRover.move("L");
        assertEquals("1 2 E",marsRover.getPosition());
    }

}
