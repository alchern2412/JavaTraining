package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing;

import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.Electrodevice;
import java.util.Arrays;

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

    
    /**
     * Constructor with all parameter
     * @param floor
     * @param square
     * @param roomCount
     * @param address
     * @param electrodevices
     */
    public Flat(int floor, int square, int roomCount, String address, Electrodevice[] electrodevices) {
        super(roomCount, address, electrodevices);
        this.floor = floor;
        this.square = square;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Flat other = (Flat) obj;
        return (getAddress() == null ? other.getAddress() == null 
                : getAddress().equals(other.getAddress())) 
                && getRoomCount() == other.getRoomCount()
                && Arrays.equals(getElectrodevices(), other.getElectrodevices())
                && square == other.getSquare() && floor == other.getFloor();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.floor;
        hash = 59 * hash + this.square;
        return hash;
    }

}
