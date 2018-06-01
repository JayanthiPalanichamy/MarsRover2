public class Position {
    private final int xPosition;
    private final int yPosition;
    private final CompassPoint compassPoint;

    public Position(int xPosition, int yPosition, CompassPoint compassPoint) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.compassPoint = compassPoint;
    }

    @Override
    public String toString() {
        return xPosition + " " + yPosition + " " + compassPoint;
    }

    public Position incrementPositionTowardsCompassPoint() {
        switch (compassPoint) {
            case N: return new Position(xPosition, yPosition + 1, compassPoint);
            case W: return new Position(xPosition - 1, yPosition, compassPoint);
            case S: return new Position(xPosition, yPosition - 1, compassPoint);
            case E: return new Position(xPosition + 1, yPosition, compassPoint);
        }
        return null;
    }

    public Position changeDirectionClockwise() {
        return new Position(xPosition, yPosition, new Direction(compassPoint).rotate90Right());
    }

    public Position changeDirectionAntiClockwise() {
        return new Position(xPosition,yPosition,new Direction(compassPoint).rotate90Left());
    }
}
