import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    MarsRover marsRover;
    MarsRover marsRover1;

    @Before
    public void setUp() {
        Plateau plateau = new Plateau(5, 5);
        marsRover = new MarsRover(plateau, 1, 2, CompassPoint.N);
        marsRover1 = new MarsRover(plateau,3,3,CompassPoint.E);
    }
    @Test
    public void returnInitialPositionWhenStringIsEmpty() {
        assertEquals("1 2 N",marsRover.getPosition());
    }

    @Test
    public void return13NWhenTheRoverIsMoved() {
        marsRover.move("M");
        assertEquals("1 3 N",marsRover.getPosition());

    }

    @Test
    public void return12WWhenRoverIsMovedToLeft() {
        marsRover.move("L");
        assertEquals("1 2 W",marsRover.getPosition());
    }

    @Test
    public void return13WWhenRoverIsMoved(){
        marsRover.move("ML");
        assertEquals("1 3 W",marsRover.getPosition());
    }

    @Test
    public void return13NWhenRoverIsMoved() {
        marsRover.move("LMLMLMLMM");
        assertEquals("1 3 N",marsRover.getPosition());
    }

    @Test
    public void return51EWhenRoverIsMoved() {

        marsRover1.move("MMRMMRMRRM");
        assertEquals("5 1 E",marsRover1.getPosition());
    }
}
