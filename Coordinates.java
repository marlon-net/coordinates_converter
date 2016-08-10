import java.util.ArrayList;

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
    public String getX(int decimals) {
        return String.format("%." + decimals + "f", mX);
    }

    public double getY() {  return mY;  }
    public String getY(int decimals) {
        return String.format("%." + decimals + "f", mY);
    }

    public double getRay() { return mRay; }
    public String getRay(int decimals) {
        return String.format("%." + decimals + "f", mRay);
    }

    public double getAngleRadians() { return mAngleRadians; }
    public String getAngleRadians(int decimals) {
        return comum.formatDouble( mAngleRadians, decimals );
    }

    public double getAngleDegrees() { return Math.toDegrees(mAngleRadians); }
    public String getAngleDegrees(int decimals) {
        return comum.formatDouble( this.getAngleDegrees(), decimals );
    }


    ////// get arrays

    public Double[] getArrayOfNumbers(Coordinates coordinates) {

        // empty array to be filled and returned
        Double[] array = new Double[0];

        ArrayList<Double> arrayList = new ArrayList<Double>();
        arrayList.add(coordinates.getX());
        arrayList.add(coordinates.getY());
        arrayList.add(coordinates.getRay());
        arrayList.add(coordinates.getAngleRadians());
        arrayList.add(coordinates.getAngleDegrees());

        array = arrayList.toArray(array);
        return array;
    }

    public Double[] getArrayOfNumbers() {
        return getArrayOfNumbers(this);
    }

    public String[] getArrayOfStrings(Coordinates coordinates, int decimals) {

        // empty array of strings to be filled and returned
        String[] array = new String[0];

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(coordinates.getX(decimals));            
        arrayList.add(coordinates.getY(decimals));            
        arrayList.add(coordinates.getRay(decimals));          
        arrayList.add(coordinates.getAngleRadians(decimals)); 
        arrayList.add(coordinates.getAngleDegrees(decimals)); 

        array = arrayList.toArray(array);
        return array;
    }

    public String[] getArrayOfStrings(int decimals) {
        return getArrayOfStrings(this, decimals);
    }
