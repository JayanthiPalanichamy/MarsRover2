public class MarsRover {
    private final Plateau plateau;
    private Position position;


    public MarsRover(Plateau plateau, int xPosition, int yPosition, CompassPoint compassPoint) {
        this.plateau = plateau;
        this.position = new Position(xPosition, yPosition, compassPoint);
    }

    public String getPosition() {
        return position.toString();
    }

    public void move(String message) {
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'M') {
                position=position.incrementPositionTowardsCompassPoint();
            }
            else if(message.charAt(i)=='L') {
                position = position.changeDirectionAntiClockwise();
            }
            else if(message.charAt(i)=='R'){
                position = position.changeDirectionClockwise();
            }
        }
    }
}
