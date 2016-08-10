/*
    Convert cartesian (x,v)  to Polar (ray, angle)
*/

public class Coordinates {

    private double mX;
    private double mY;
    private double mRay;
    private double mAngleRadians;

    public Coordinates() {
        //
    }

    ///////  "setters"
    public void setCartesian(double x, double y) {
        mX = x;
        mY = y;
        mRay = Math.hypot(mX,mY);
        mAngleRadians = (mRay!=0) ? Math.acos(mX / mRay) : 0.0;
        if ( mY < 0 ) {
            // angle need be corrected to 4rd quadrant
            mAngleRadians = ( Math.PI * 2 ) - mAngleRadians;
        }
    }

    public void setPolarRadians(double ray, double angleRadians) {
        mRay = ray;
        mAngleRadians = angleRadians;
        mX = mRay * Math.cos(mAngleRadians);
        mY = mRay * Math.sin(mAngleRadians);
        if (mX == -0.0f ) { mX = 0; }
        if (mY == -0.0f ) { mY = 0; }
    }

    public void setPolarDegrees(double ray, double angleDegrees) {
        setPolarRadians(ray, Math.toRadians(angleDegrees));
    }

    ///////  "getters"
    public double getX() {  return mX;  }

    public double getY() {  return mY;  }

    public double getRay() { return mRay; }

    public double getAngleRadians() { return mAngleRadians; }

    public double getAngleDegrees() { return Math.toDegrees(mAngleRadians); }

}
