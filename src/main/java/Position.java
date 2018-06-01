public class Position {
    private final int xPosition;
    private final int yPosition;
    private final Direction direction;

    public Position(int xPosition, int yPosition, Direction direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public Direction getDirection() {
        return direction;
    }
}
