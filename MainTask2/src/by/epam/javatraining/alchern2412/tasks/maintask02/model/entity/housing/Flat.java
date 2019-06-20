package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing;

import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.Electrodevice;

/**
 * Used to create Flat
 *
 * @author Alex
 */
public class Flat extends Housing {
    /*fields*/

    /**
     * Floor of flat.
     */
    private int floor;

    /**Setter for floor field*/
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**Getter for floor field*/
    public int getFloor() {
        return floor;
    }

    /**Square of this Flat. */
    public int square;

    /**
     * Setter for square. Square can't be lower 0.
     * @param square square of flat
     */
    public void setSquare(int square) {
        if (square < 0) {
            this.square = 0;
        } else {
            this.square = square;
        }
    }

    /**Getter for square*/
    public int getSquare() {
        return square;
    }

    /*Constructors*/
    
    /**Default constructor without any parameters.*/
    public Flat() {
        this(1, 0, 1, "Unknown Address");
    }

    
    public Flat(int floor, int square, int roomCount, String address) {
        this(floor, square, roomCount, address, null);
    }

    
    /**Constructor with all parameters*/
    public Flat(int floor, int square, int roomCount, String address, Electrodevice[] electrodevices) {
        super(roomCount, address, electrodevices);
        this.floor = floor;
        this.square = square;
    }

}
