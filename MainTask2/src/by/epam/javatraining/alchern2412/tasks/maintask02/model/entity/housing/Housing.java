package by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.housing;

import by.epam.javatraining.alchern2412.tasks.maintask02.model.entity.electrodevice.Electrodevice;

/**
 * This class is an abstraction for creating real Houses or Flats.
 *
 * @author Alex
 */
public abstract class Housing {

    /*fields*/
    /**
     * Address of Housing
     */
    private String address;

    /**
     * Address getter.
     * 
     * @return Housing's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Count of rooms
     */
    private int roomCount;

    /**
     * Count of rooms setter.
     * 
     * @param roomCount  Count of rooms
     */
    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    /**
     * Count of rooms getter.
     * 
     * @return roomCount
     */
    public int getRoomCount() {
        return roomCount;
    }

    /**
     * List of Electrodevices of Housing.
     * 
     */
    private Electrodevice[] electrodevices;

    /**
     * Getter for Electrodevices of Housing
     * 
     * @return electrodevices of Housing
     */
    public Electrodevice[] getElectrodevices() {
        return electrodevices;
    }

    /**
     * Setter Electrodevices
     * 
     * @param electrodevices  
     */
    public void setElectrodevices(Electrodevice[] electrodevices) {
        this.electrodevices = electrodevices;
    }

    /*Constructors*/
    
    /**
     * Default constructor without any parameters.
     * Unknown address by default and room count = 1.
     */
    public Housing() {
        this(1, "Unknown Address");
    }

    public Housing(int roomCount, String address) {
        this(roomCount, address, null);
    }

    /**
     * Full constructor with all params.
     * 
     * @param roomCount Count of rooms
     * @param address Address of Housing
     * @param electrodevices All electrodevices
     */
    public Housing(int roomCount, String address, Electrodevice[] electrodevices) {
        this.address = address;
        this.electrodevices = electrodevices;
        this.roomCount = roomCount;
    }

}
