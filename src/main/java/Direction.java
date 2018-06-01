import java.util.Arrays;
import java.util.List;

public class Direction {
    private final CompassPoint direction;
    private final List<CompassPoint> directionMap = Arrays.asList(CompassPoint.N,CompassPoint.E,CompassPoint.S,CompassPoint.W);

    public Direction(CompassPoint direction) {
        this.direction = direction;
    }

    public CompassPoint rotate90Left(){
       for(int index=0;index<directionMap.size();index++){
           if(directionMap.get(index)==direction){
               if(index-1<0){
                   return directionMap.get(3);
               }
               else{
                   return directionMap.get(index-1);
               }
           }
       }
       return null;
    }

    public CompassPoint rotate90Right(){
        for(int index=0;index<directionMap.size();index++){
            if(directionMap.get(index)==direction){
                return directionMap.get((index+1)%4);
            }
        }
        return null;
    }
}
