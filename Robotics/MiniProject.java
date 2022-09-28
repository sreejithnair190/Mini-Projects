/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SREEKUMAR
 */
package robotics;
import ch.aplu.robotsim.*;

public class MiniProject {
    static{
        RobotContext.setStartPosition(425,200);
        RobotContext.useBackground("sprites/yellowpath.gif");
    }
    
    MiniProject(){
        LegoRobot r = new LegoRobot();
        Gear g = new Gear();
        LightSensor ls = new LightSensor(SensorPort.S3);
        
        r.addPart(g);
        r.addPart(ls);
        
        g.forward();
        g.setSpeed(50);
        
         while(true){
            int v =ls.getValue();
//            System.out.println(v);
            if(v == 1000)
                g.forward();
            if(v < 1000 )
                g.leftArc(0.005);
            if(v == 3)
                g.stop();
        }

        
    }
    
    public static void main(String[] args){
        new MiniProject();
    }
}
