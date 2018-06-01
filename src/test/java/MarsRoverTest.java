import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    MarsRover marsRover;
    @Before
    public void setUp() {
        Plateau plateau = new Plateau(5,5);
        marsRover = new MarsRover(plateau,1,2, CompassPoint.N);
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

}
