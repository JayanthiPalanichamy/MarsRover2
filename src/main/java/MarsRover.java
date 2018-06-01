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
                switch (position.getCompassPoint()) {
                    case N: {
                        if (position.getyPosition() + 1 <= plateau.getMaxY())
                            position = new Position(position.getxPosition(), position.getyPosition() + 1, position.getCompassPoint());
                        break;
                    }

                    case W: {
                        if (position.getxPosition() - 1 >= 0)
                            position = new Position(position.getxPosition() - 1, position.getyPosition(), position.getCompassPoint());
                        break;
                    }
                    case S: {
                        if (position.getyPosition() - 1 >= 0)
                            position = new Position(position.getxPosition(), position.getyPosition() - 1, position.getCompassPoint());
                        break;
                    }
                    case E: {
                        if (position.getxPosition() + 1 <= plateau.getMaxX())
                            position = new Position(position.getxPosition() + 1, position.getyPosition(), position.getCompassPoint());
                        break;
                    }
                }
            } else {
                position = position.changeDirection(message.charAt(i));
                }
        }
    }
}
