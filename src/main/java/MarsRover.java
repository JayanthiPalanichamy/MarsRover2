public class MarsRover {
    private final Plateau plateau;
    private Position position;


    public MarsRover(Plateau plateau, int xPosition, int yPosition, Direction direction) {
        this.plateau = plateau;
        this.position = new Position(xPosition,yPosition,direction);
    }

    public String getPosition() {
        return position.getXPosition()+" "+position.getYPosition()+" "+position.getDirection();
    }

    public void move(String m) {
        for(int i=0;i<m.length();i++) {
            if (m.charAt(i)=='M') {
                position = new Position(position.getXPosition() + 1, position.getYPosition(), position.getDirection());
            }
            if (m.equals("L")) {
                position = new Position(position.getXPosition(), position.getYPosition(), Direction.E);
            }
        }
    }
}
