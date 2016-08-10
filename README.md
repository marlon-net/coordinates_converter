# coordinates_converter
Java classes for coordinate systems conversion

Use this class to convert coordinates systems: 

Cartesian (x,y) <-> Polar (ray,angle)

Each instance defines a POINT in a PLAN, which have coordinates in both systems: Cartesian and Polar.


__Constructors:__ 

Coordinates() - no parameters


__Attributes:__

double mX, mY (its cartesian coordinates)

double mRay, mAngleRadians (the polar coordinates)


__Methods:__

__setters:__

__setCartesian(x,y)__

Defines cartesian coordinates. Automatically calculates the Polar coordinates.

__setPolarRadians(r,a)__

Defines polar coordinates. Automatically calculates the cartesian pair, considering _a_ an angle in radians.

__setPolarDegrees(r,a)__

Defines polar coordinates. Automatically calculates the cartesian pair, considering _a_ an angle in degrees. Ths method actually transform the angle in radians and call setPolarRadians method.

__getters:__

__getX()__ returns X

__getY()__ returns Y

__getRay()__ returns ray

__getAngleRadinans()__ returns angle in radians

__getAngleDegrees()__ returns angle in degrees. Ths method actually transform the angle in radians and call getAngleRadians method.







