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
        return xPosition +" "+ yPosition +" "+ compassPoint;
    }

    public CompassPoint getCompassPoint() {
        return compassPoint;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public Position changeDirection(char direction) {
        if(direction=='L'){
            switch (compassPoint){
                case N: return new Position(xPosition,yPosition, CompassPoint.W);
                case E:return new Position(xPosition,yPosition, CompassPoint.N);
                case S: return new Position(xPosition,yPosition, CompassPoint.E);
                case W: return new Position(xPosition,yPosition, CompassPoint.S);
                default: return null;
            }

        }
        else {
            switch (compassPoint){
                case N: return new Position(xPosition,yPosition, CompassPoint.E);
                case E:return new Position(xPosition,yPosition, CompassPoint.S);
                case S: return new Position(xPosition,yPosition, CompassPoint.W);
                case W: return new Position(xPosition,yPosition, CompassPoint.N);
                default: return null;
            }
        }
    }
}
