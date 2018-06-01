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

    public Position incrementPosition() {
        switch (compassPoint) {
            case N: return new Position(xPosition, yPosition + 1, compassPoint);
            case W: return new Position(xPosition - 1, yPosition, compassPoint);
            case S: return new Position(xPosition, yPosition - 1, compassPoint);
            case E: return new Position(xPosition + 1, yPosition, compassPoint);
        }
        return null;
    }

    public Position changeDirectionClockwise() {
        switch (compassPoint) {
            case N:
                return new Position(xPosition, yPosition, CompassPoint.E);
            case E:
                return new Position(xPosition, yPosition, CompassPoint.S);
            case S:
                return new Position(xPosition, yPosition, CompassPoint.W);
            case W:
                return new Position(xPosition, yPosition, CompassPoint.N);
            default:
                return null;
        }
    }

    public Position changeDirectionAntiClockwise() {
        switch (compassPoint) {
            case N:
                return new Position(xPosition, yPosition, CompassPoint.W);
            case E:
                return new Position(xPosition, yPosition, CompassPoint.N);
            case S:
                return new Position(xPosition, yPosition, CompassPoint.E);
            case W:
                return new Position(xPosition, yPosition, CompassPoint.S);
            default:
                return null;
        }
    }
}
