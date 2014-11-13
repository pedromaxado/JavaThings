/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notstarcraft.utils;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public final class Line {

    private float a;
    private final float b = -1;
    private float c;
    
    public Line(float x0, float y0, float x1, float y1) {
        updateFunction(x0, y0, x1, y1);
    }
    
    public double getCoefA() {
        return this.a;
    }
    
    public float calculateAngle(Line l) {
        
        if( this.a == 0 ) {
            return (float) Math.atan(1/l.getCoefA());
        }
        else if( l.getCoefA() == 0 ) {
            return (float) Math.atan(1/this.a);
        }
        else {
            return (float) Math.atan((l.getCoefA()-this.a)/(1+l.getCoefA()*this.a));
        }
        
    }
    
    public void updateFunction(float x0, float y0, float x1, float y1) {
        if( (x1-x0) == 0 ) 
            this.a = 0;
        else 
            this.a = ( (y1 - y0) / (x1 - x0) );
        
        if( (x1-x0) == 0 )
            this.c = 0;
        else
            this.c = ( ((y0*x1) - (y1*x0)) / (x1 - x0) );
    }
    
    public static float getPointToPointDistance(double x0, double y0, double x1, double y1) {
        return (float)Math.sqrt(Math.pow(x1-x0, 2) + Math.pow(y1-y0, 2));
    }
    
}